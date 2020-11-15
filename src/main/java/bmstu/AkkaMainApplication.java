package bmstu;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import java.io.IOException;

public class AkkaMainApplication {

    public static void main(String[] args) throws IOException {
        ActorSystem system = ActorSystem.create("test");

    }
}
