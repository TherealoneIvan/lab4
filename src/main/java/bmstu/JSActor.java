package bmstu;

import akka.actor.AbstractActor;

public class JSActor extends AbstractActor {
    public Receive createReceive() {
        return receiveBuilder().build();
    }
}