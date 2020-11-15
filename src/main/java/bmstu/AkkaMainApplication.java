package bmstu;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class AkkaMainApplication {
    ActorSystem system = ActorSystem.create("test");
    Props propsJsTestExecProp = Props.create(JSTestExecutorActor.class);
    Props propsResultsSupplyProp = Props.create(ResultsSupplyActor.class);
    ActorRef supplyActor = 
}
