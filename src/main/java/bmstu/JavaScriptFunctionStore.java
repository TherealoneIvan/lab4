package bmstu;

public class JavaScriptFunctionStore {
    private String jsFunctionName , jsFunctionParam , jsFunctionExpectedResult;

    public JavaScriptFunctionStore(String jsFunctionName, String jsFunctionParam, String jsFunction) {
        this.jsFunctionName = jsFunctionName;
        this.jsFunctionParam = jsFunctionParam;
        this.jsFunctionExpectedResult = jsFunction;
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

    public String getJsFunctionExpectedResult() {
        return jsFunctionExpectedResult;
    }

    public void setJsFunctionExpectedResult(String jsFunctionExpectedResult) {
        this.jsFunctionExpectedResult = jsFunctionExpectedResult;
    }
}
