package bmstu;

import akka.actor.AbstractActor;

public class ActorRouter extends AbstractActor {
    private ResultsSupplyActor storeActor;
    private JSTestExecutorActor testExecutorActor;
    
    @Override
    public Receive createReceive() {
        return null;
    }
}
