package bmstu;

import akka.actor.AbstractActor;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class JSTestExecutor extends AbstractActor {
    public String jsExecutor(String jsFunction , String jsFuncName , String jsFuncParam)
            throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager()
                .getEngineByName("nashorn");
        engine.eval(jsFunction);
        Invocable invocable = (Invocable) engine;
        return invocable.invokeFunction(jsFuncName, jsFuncParam).toString();
    }
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        (f,s,t)->{
                            jsExecutor(f ,s, t);
                        }
                )
    }
}
