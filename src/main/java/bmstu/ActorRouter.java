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
                            for (int i = 0 ; i < jsFunc.jsFunctionParam.size() ; i++) {
                                testExecutorActor.tell(
                                new OneTest(jsFunc.jsFunctionName,
                                            jsFunc.jsFunctionParam.get(i).testName,
                                            jsFunc.jsFunctionParam.get(i).expRes,
                                            jsFunc.jsFunctionParam.get(i).params,
                                            jsFunc.jsFunctionBody,
                                            jsFunc.packageId), getSelf());
                            }
                        }
                )
                .match(
                        JavaScriptFunctionRes.class,
                        output -> {
                            System.out.println("second debug");
                            storeActor.tell(output , self());
                        }
                )
                .match(
                        String.class,
                        id -> {
                            System.out.println("id =" + id);
                            storeActor.tell(id , self())
                        }
                )
                .build();
    }
}
