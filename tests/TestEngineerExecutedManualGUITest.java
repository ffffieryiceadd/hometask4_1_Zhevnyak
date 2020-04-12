import entity.AutomatedTest;
import entity.ManualTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import worker.AutomationEngineer;
import worker.TestEngineer;

public class TestEngineerExecutedManualGUITest {
    @Test
    public void TestEngineerExecutedManualGUITest() {
        ManualTest manualTestGUI = new ManualTest(TestLevel.GUI, 6);
        TestEngineer testEngineer2 = new TestEngineer();
        Assert.assertEquals("Test should be FAILED: ",
                Result.FAILED, manualTestGUI.apply(testEngineer2));
    }
}
