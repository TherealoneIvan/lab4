package bmstu;

import akka.actor.AbstractActor;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class JSTestExecutor extends AbstractActor {
    public String jsExecutor(){
        ScriptEngine engine = new
                ScriptEngineManager().getEngineByName("nashorn");
        engine.eval(jscript);
        Invocable invocable = (Invocable) engine;
        return invocable.invokeFunction(functionName, params).toString();
    }
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match()
    }
}
