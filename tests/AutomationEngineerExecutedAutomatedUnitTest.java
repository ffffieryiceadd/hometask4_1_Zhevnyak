import entity.AutomatedTest;
import entity.Result;
import entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import worker.AutomationEngineer;

public class AutomationEngineerExecutedAutomatedUnitTest {
    @Test
    public void AutomationEngineerExecutedAutomatedUnitTest() {
        AutomatedTest automatedTestUnit = new AutomatedTest(TestLevel.API, 5);
        AutomationEngineer automationEngineer3 = new AutomationEngineer();
        Assert.assertEquals("Test should be PASSED: ",
                Result.PASSED, automatedTestUnit.apply(automationEngineer3));
    }
}
