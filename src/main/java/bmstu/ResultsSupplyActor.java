package bmstu;

import akka.actor.AbstractActor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {

    private Map<String , ArrayList<String>> store = new HashMap<>();
    private void resultStoring(JavaScriptFunctionRes item){
        ArrayList<String> tmpArray;
        if (store.containsKey(item.getPackageID())){
            tmpArray = store.get(item.getPackageID());
        }else {
            tmpArray = new ArrayList<>();
        }
        tmpArray.add(item.getFunctionRes());
        store.put(item.getPackageID() , tmpArray);
    }
    private String packageIdPrinter(String packageID) {
        if (store.containsKey(packageID)) {
            ArrayList<String> tmpArray = store.get(packageID);
            for (int i = 0; i < tmpArray.size(); i++) {
                return tmpArray.get(i);
            }
        }
        return "There are no tests";
    }

    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionRes.class,
                        this::resultStoring
                )
                .match(
                        String.class,
                        this::packageIdPrinter
                )
                .build();
    }
}