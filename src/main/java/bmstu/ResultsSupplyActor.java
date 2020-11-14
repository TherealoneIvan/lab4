package bmstu;

import akka.actor.AbstractActor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {

    private Map<String , ArrayList<String>> store = new HashMap<>();
    private void resultStoring(JavaScriptFunctionClass item){
        ArrayList<String> tmpArray;
        if (store.containsKey(item.getPackageID())){
            tmpArray = store.get(item.getPackageID());
        }else {
            tmpArray = new ArrayList<>();
        }
        tmpArray.add(item.getFunctionRes());
        store.put(item.getPackageID() , tmpArray);
    }
    private void packageIdPrinter(String packageID) {
        if (store.containsKey(packageID)) {
            ArrayList<String> tmpArray = store.get(packageID);
            for (int i = 0; i < tmpArray.size(); i++) {
                System.out.println(tmpArray.get(i));
            }
        }else {
            System.out.println("There are no tests");
        }
    }
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionClass.class,
                        this::resultStoring
                )
                .match(
                        String.class,
                        this::packageIdPrinter
                )
                .build();
    }
}