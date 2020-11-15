package bmstu;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.stream.Materializer;

import java.io.IOException;

public class AkkaMainApplication {

    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create("test");
        ActorRouter router = new ActorRouter(system);
        final Materializer materializer = 
    }
}
