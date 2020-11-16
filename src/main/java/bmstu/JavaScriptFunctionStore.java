package bmstu;

public class JavaScriptFunctionStore {
    private String jsFunctionName , jsFunctionParam , jsFunctionBody;

    public JavaScriptFunctionStore(String jsFunctionName, String jsFunctionParam, String jsFunction) {
        this.jsFunctionName = jsFunctionName;
        this.jsFunctionParam = jsFunctionParam;
        this.jsFunctionBody = jsFunction;
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

    public String getJsFunctionBody() {
        return jsFunctionBody;
    }

    public void setJsFunctionBody(String jsFunctionBody) {
        this.jsFunctionBody = jsFunctionBody;
    }
}
