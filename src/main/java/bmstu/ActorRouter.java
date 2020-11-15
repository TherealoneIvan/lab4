package bmstu;

import akka.actor.*;

public class ActorRouter extends AbstractActor {
    private ActorRef storeActor;
    private ActorRef testExecutorActor;

    public ActorRouter(ActorSystem system) {
        Props propsJsTestExecProp = Props.create(JSTestExecutorActor.class);
        Props propsResultsSupplyProp = Props.create(ResultsSupplyActor.class);
        this.storeActor = system.actorOf(propsResultsSupplyProp);
        this.testExecutorActor = system.actorOf(propsJsTestExecProp);
    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
