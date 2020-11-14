package bmstu;

import akka.actor.AbstractActor;

import java.util.HashMap;
import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {
    public static void functionResReceive(String functionResult){

    }
    private Map<String , String> store = new HashMap<>();
    public Receive createReceive() {
        return receiveBuilder()
                .match(

                )
                .build();
    }
}