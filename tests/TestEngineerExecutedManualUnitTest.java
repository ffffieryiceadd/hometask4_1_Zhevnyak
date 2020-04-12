import entity.AutomatedTest;
import entity.ManualTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import worker.AutomationEngineer;
import worker.TestEngineer;

public class TestEngineerExecutedManualUnitTest {
    @Test
    public void TestEngineerExecutedManualUnitTest() {
        ManualTest manualTestUnit = new ManualTest(TestLevel.UNIT, 2);
        TestEngineer testEngineer3 = new TestEngineer();
        Assert.assertEquals("Test should be PASSED: ",
                Result.PASSED, manualTestUnit.apply(testEngineer3));
    }
}
