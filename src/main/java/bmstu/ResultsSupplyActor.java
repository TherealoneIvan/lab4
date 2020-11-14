package bmstu;

import akka.actor.AbstractActor;

import java.util.Map;

public class ResultsSupplyActor extends AbstractActor {
    private Map<String , String> store
    public Receive createReceive() {
        return receiveBuilder()
                .match(

                )
                .build();
    }
}