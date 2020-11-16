package bmstu;

import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.stream.ActorMaterializer;
import akka.stream.Materializer;
import akka.stream.javadsl.Flow;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class AkkaMainApplication {

    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create("test");
        ActorRouter router = new ActorRouter(system);
        final Http http = Http.get(system);
        final Materializer materializer = ActorMaterializer.create(system);
        final Flow<HttpRequest, HttpResponse, NotUsed> routeFlow =
                instance.createRoute(system).flow(system, materializer);
    }
}
