package bmstu;

import akka.actor.AbstractActor;

import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {

    private Map<String , Array<String>> store = new HashMap<>();
    private void packageIdPrinter(String packageID){
        for (int i = store.size() ; i < ; i++) {

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