package bmstu;

public class JavaScriptFunctionStore {
    private String jsFunctionName , jsFunctionParam , jsFunction;

    public JavaScriptFunctionStore(String jsFunctionName, String jsFunctionParam, String jsFunction) {
        this.jsFunctionName = jsFunctionName;
        this.jsFunctionParam = jsFunctionParam;
        this.jsFunction = jsFunction;
    }

    public String getJsFunctionName() {
        return jsFunctionName;
    }

    public void setJsFunctionName(String jsFunctionName) {
        this.jsFunctionName = jsFunctionName;
    }

    public String getJsFunctionParam() {
        return jsFunctionParam;
    }

    public void setJsFunctionParam(String jsFunctionParam) {
        this.jsFunctionParam = jsFunctionParam;
    }

    public String getJsFunction() {
        return jsFunction;
    }

    public void setJsFunction(String jsFunction) {
        this.jsFunction = jsFunction;
    }
}
