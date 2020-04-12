import entity.AutomatedTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import worker.AutomationEngineer;

public class AutomationEngineerExecutedAutomatedAPITest {
    @Test
    public void AutomationEngineerExecutedAutomatedAPITest() {
        AutomatedTest automatedTestAPI = new AutomatedTest(TestLevel.API, 6);
        AutomationEngineer automationEngineer1 = new AutomationEngineer();
        Assert.assertEquals("Test should be PASSED: ",
                Result.PASSED, automatedTestAPI.apply(automationEngineer1));
    }
}
