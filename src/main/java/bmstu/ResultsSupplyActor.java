package bmstu;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

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
    private JavaScriptFunctionRes packageIdPrinter(String packageID) {
        if (store.containsKey(packageID)) {
            ArrayList<String> tmpArray = store.get(packageID);
            for (int i = 0; i < tmpArray.size(); i++) {
                return new JavaScriptFunctionRes( packageID , tmpArray.get(i) );
            }
        }
        return new  JavaScriptFunctionRes(packageID , "There are no tests" );
    }

    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionRes.class,
                        this::resultStoring
                )
                .match(
                        String.class,
                        id -> {
                            getSender().tell(packageIdPrinter(id) , ActorRef.noSender());
                        }
                )
                .build();
    }
}