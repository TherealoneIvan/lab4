package bmstu;

import akka.actor.ActorSystem;

public class AkkaMainApplication {
    ActorSystem system = ActorSystem.create("test");
}
