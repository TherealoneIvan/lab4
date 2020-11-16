package bmstu;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;

public class JsonJsPackage {
    public String packageId;
    public String jsScript;
    public String functionName;
    public ArrayList<JavaScriptFunctionStore> test;

    @JsonCreator


}
