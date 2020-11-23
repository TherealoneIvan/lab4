package bmstu;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class JavaScriptFunctionStore {
    private final String ID = "packageId";
    private final String function = "jsScript";
    private final String functionName = "functionName";
    private final String functParam = "tests";

    @JsonProperty(functionName)
    private String jsFunctionName;
    @JsonProperty(functParam)
    private ArrayList<String> jsFunctionParam;
    @JsonProperty(function)
    private String jsFunctionBody;
    @JsonProperty(ID)
    private String packageId;


    @JsonCreator
    public JavaScriptFunctionStore( @JsonProperty(functionName) String jsFunctionName,
                                    @JsonProperty(functParam) ArrayList<String>  jsFunctionParam,
                                    @JsonProperty(function) String jsFunction ,
                                    @JsonProperty(ID) String packageId)
    {
        this.jsFunctionName = jsFunctionName;
        this.jsFunctionParam = jsFunctionParam;
        this.jsFunctionBody = jsFunction;
        this.packageId = packageId;
    }

    public String getPackageId() {
        return packageId;
    }

    public String getJsFunctionName() {
        return jsFunctionName;
    }

    public void setJsFunctionName(String jsFunctionName) {
        this.jsFunctionName = jsFunctionName;
    }


    public ArrayList<String> getJsFunctionParam() {
        return jsFunctionParam;
    }

    public void setJsFunctionParam(ArrayList<String> jsFunctionParam) {
        this.jsFunctionParam = jsFunctionParam;
    }

    public String getJsFunctionBody() {
        return jsFunctionBody;
    }

    public void setJsFunctionBody(String jsFunctionBody) {
        this.jsFunctionBody = jsFunctionBody;
    }
}
