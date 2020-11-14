package bmstu;

import akka.actor.AbstractActor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {

    private Map<String , ArrayList<String>> store = new HashMap<>();
    private void packageIdPrinter(String packageID){
        for (int i = store.size() ; i < ; i++) {

        }
    }
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionClass.class,
                        item->{
                            store[item.getPackageID()].add;
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