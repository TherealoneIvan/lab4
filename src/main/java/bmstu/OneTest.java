package bmstu;

import java.util.ArrayList;

public class OneTest {
    private String testName;
    private  String expRes;
    private  ArrayList<Integer> params;
    private String function;
    private String packageId;

    public OneTest(String testName, String expRes, ArrayList<Integer> params, String function, String packageId) {
        this.testName = testName;
        this.expRes = expRes;
        this.params = params;
        this.function = function;
        this.packageId = packageId;
    }
}
