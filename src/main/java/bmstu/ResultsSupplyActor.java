package bmstu;

import akka.actor.AbstractActor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {

    private Map<String , ArrayList<String>> store = new HashMap<>();
    private void resultStoring(JavaScriptFunctionClass item , Map<String , ArrayList<String>> myStore){
        if (myStore.containsKey(item.getPackageID())){
            myStore.put(item.getPackageID() , item.getFunctionRes());
        }
    }
    private void packageIdPrinter(String packageID){
        for (int i = store.size() ; i < ; i++) {

        }
    }
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionClass.class,
                        item->{
                            store.put(item.add;
                        }
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