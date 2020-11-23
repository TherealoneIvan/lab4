package bmstu;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Test {
    private final String TEST_NAME = "testName";
    private final String EXPECTED_RESULT = "expectedResult";
    private final String PARAMS = "params";

    @JsonProperty(TEST_NAME)
    private String testName;

    @JsonProperty(EXPECTED_RESULT)
    private String expRes;

    @JsonProperty(PARAMS)
    private ArrayList<Integer> params;

    @JsonCreator
    public Test(@JsonProperty(TEST_NAME) String testName,
                @JsonProperty(EXPECTED_RESULT) String expRes,
                @JsonProperty(PARAMS) ArrayList<Integer> params)
    {
        this.testName = testName;
        this.expRes = expRes;
        this.params = params;
    }
}
