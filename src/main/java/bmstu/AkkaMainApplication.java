package bmstu;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class AkkaMainApplication {
    public static void main(String[] args) throws IOException {
    ActorSystem system = ActorSystem.create("test");
    Props propsJsTestExecProp = Props.create(JSTestExecutorActor.class);
    Props propsResultsSupplyProp = Props.create(ResultsSupplyActor.class);
    ActorRef supplyActor = system.actorOf(propsResultsSupplyProp);
    ActorRef executorJsActor = system.actorOf(propsJsTestExecProp);

}
