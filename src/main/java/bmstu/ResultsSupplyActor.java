package bmstu;

import akka.actor.AbstractActor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {

    private Map<String , ArrayList<String>> store = new HashMap<>();
    private void resultStoring(JavaScriptFunctionClass item , Map<String , ArrayList<String>> myStore){
        ArrayList<String> tmpArray;
        if (myStore.containsKey(item.getPackageID())){
            tmpArray = myStore.get(item.getPackageID());
        }else {
            tmpArray = new ArrayList<>();
        }
        tmpArray.add(item.getFunctionRes());
        myStore.put(item.getPackageID() , tmpArray);
    }
    private void packageIdPrinter(String packageID) {
        if (store.containsKey(packageID)) {
            ArrayList<String> tmpArray = store.get(packageID);
            for (int i = 0; i < tmpArray.size(); i++) {
                
            }
        }
    }
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionClass.class,
                        item->resultStoring(item , store)
                )
                .match(
                        String.class,
                        packageID->{
                            System.out.println(store);
                        }
                )
                .build();
    }
}