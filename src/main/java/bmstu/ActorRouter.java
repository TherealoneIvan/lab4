package bmstu;

import akka.actor.*;
import akka.routing.RoundRobinPool;

public class ActorRouter extends AbstractActor {
    private ActorRef storeActor;
    private ActorRef testExecutorActor;

    public ActorRouter(ActorSystem system) {
        Props propsJsTestExecProp = Props.create(JSTestExecutorActor.class);
        Props propsResultsSupplyProp = Props.create(ResultsSupplyActor.class);
        this.storeActor = system.actorOf(propsResultsSupplyProp , "Store");
        this.testExecutorActor = system.actorOf(
                new RoundRobinPool(5)
                    .props(propsJsTestExecProp)
        );
    }
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionStore.class,
                        testExecutorActor
                )

    }
}
