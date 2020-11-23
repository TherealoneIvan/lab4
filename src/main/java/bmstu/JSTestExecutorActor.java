package bmstu;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;


public class JSTestExecutorActor extends AbstractActor {
    public JavaScriptFunctionRes jsExecutor(String jsFunction , String jsFuncName ,
                                            ArrayList<Test> jsFuncParam , String packageId)
            throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager()
                .getEngineByName("nashorn");
        engine.eval(jsFunction);
        Invocable invocable = (Invocable) engine;
        return  new JavaScriptFunctionRes(packageId,
                invocable.invokeFunction(jsFuncName, jsFuncParam).toString());
    }
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(
                        JavaScriptFunctionStore.class,
                        item->getSender().tell(jsExecutor(item.getJsFunctionBody(), item.getJsFunctionName()
                                ,item.getJsFunctionParam() , item.getPackageId()), ActorRef.noSender())
                )
                .build();
    }
}
