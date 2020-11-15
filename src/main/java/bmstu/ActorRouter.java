package bmstu;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class ActorRouter extends AbstractActor {
    private ResultsSupplyActor storeActor;
    private JSTestExecutorActor testExecutorActor;

    public ActorRouter(ActorSystem system) {
        Props propsJsTestExecProp = Props.create(JSTestExecutorActor.class);
        Props propsResultsSupplyProp = Props.create(ResultsSupplyActor.class);
        ActorRef supplyActor = system.actorOf(propsResultsSupplyProp);
        ActorRef executorJsActor = system.actorOf(propsJsTestExecProp);
    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
