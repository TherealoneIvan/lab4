package bmstu;

import akka.actor.AbstractActor;


public class JSTestExecutor extends AbstractActor {
    public String jsExecutor()
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match()
    }
}
