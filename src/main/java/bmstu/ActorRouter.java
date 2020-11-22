package bmstu;

import akka.actor.*;
import akka.routing.RoundRobinPool;

public class ActorRouter extends AbstractActor {

    Props propsJsTestExecProp = Props.create(JSTestExecutorActor.class);
    Props propsResultsSupplyProp = Props.create(ResultsSupplyActor.class);
    private ActorRef storeActor = getContext().actorOf(propsResultsSupplyProp , "Store");
    private ActorRef testExecutorActor = getContext().actorOf(
            new RoundRobinPool(5)
                    .props(propsJsTestExecProp)
        );

    public String makeRequest(String packageId){
        return packageId;
    }
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionStore.class,
                        jsFunc -> {
                            getSelf().tell(jsFunc , testExecutorActor);
                        }
                )
                .match(
                        JavaScriptFunctionRes.class,
                        output -> getSelf().tell(output , storeActor)
                )
                .build();
    }
}
