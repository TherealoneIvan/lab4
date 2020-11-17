package bmstu;

import com.fasterxml.jackson.annotation.JsonCreator;

public class JavaScriptFunctionStore {
    private String jsFunctionName , jsFunctionParam , jsFunctionBody , packageId;

    @JsonCreator
    public JavaScriptFunctionStore(String jsFunctionName, String jsFunctionParam, String jsFunction , String packageId) {
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
