package bmstu;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class JavaScriptFunctionStore {
    private final String ID = "packageId";
    private final String FUNCTION = "jsScript";
    private final String FUNCTION_NAME = "functionName";
    private final String FUNCTION_PARAM = "tests";

    @JsonProperty(FUNCTION_NAME)
    private String jsFunctionName;
    @JsonProperty(FUNCTION_PARAM)
    private ArrayList<Test> jsFunctionParam;
    @JsonProperty(FUNCTION)
    private String jsFunctionBody;
    @JsonProperty(ID)
    private String packageId;


    @JsonCreator
    public JavaScriptFunctionStore( @JsonProperty(FUNCTION_NAME) String jsFunctionName,
                                    @JsonProperty(FUNCTION_PARAM) ArrayList<Test>  jsFunctionParam,
                                    @JsonProperty(FUNCTION) String jsFunction ,
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


    public ArrayList<Test> getJsFunctionParam() {
        return jsFunctionParam;
    }

    public void setJsFunctionParam(ArrayList<Test> jsFunctionParam) {
        this.jsFunctionParam = jsFunctionParam;
    }

    public String getJsFunctionBody() {
        return jsFunctionBody;
    }

    public void setJsFunctionBody(String jsFunctionBody) {
        this.jsFunctionBody = jsFunctionBody;
    }
}
