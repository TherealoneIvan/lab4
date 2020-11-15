package bmstu;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;

import java.io.IOException;

public class AkkaMainApplication {

    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create("test");
        ActorRouter router = new ActorRouter(system);
        final Http http = Http.get(system);
        final Materializer materializer = ActorMaterializer.create(system);
    }
}
