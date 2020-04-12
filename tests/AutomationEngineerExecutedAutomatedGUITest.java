import entity.AutomatedTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import worker.AutomationEngineer;

public class AutomationEngineerExecutedAutomatedGUITest {
    @Test
    public void AutomationEngineerExecutedAutomatedGUITest() {
        AutomatedTest automatedTestGUI = new AutomatedTest(TestLevel.GUI, 7);
        AutomationEngineer automationEngineer2 = new AutomationEngineer();
        Assert.assertEquals("Test should be FAILED: ",
                Result.FAILED, automatedTestGUI.apply(automationEngineer2));
    }
}
