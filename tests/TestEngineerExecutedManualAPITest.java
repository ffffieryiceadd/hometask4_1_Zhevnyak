import entity.ManualTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import worker.TestEngineer;

public class TestEngineerExecutedManualAPITest {
    @Test
    public void TestEngineerExecutedManualAPITest() {
        ManualTest manualTestAPI = new ManualTest(TestLevel.API, 5);
        TestEngineer testEngineer1 = new TestEngineer();
        Assert.assertEquals("Test should be PASSED: ",
                Result.PASSED, manualTestAPI.apply(testEngineer1));
    }
}
