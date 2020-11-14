package bmstu;

import akka.actor.AbstractActor;

import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {

    private Map<String , String> store = new HashMap<>();
    private static void packageIdPrinter(String packageID){
        for (int i = store[packageID] ; i < ; i++) {

        }
    }
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionClass.class,
                        item->{
                            store.put(item.getPackageID() , item.getFunctionRes());
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