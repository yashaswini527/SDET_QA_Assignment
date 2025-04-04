import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FirstPage;
import pages.ResultsPage;
import Utils.TestData;

public class LongestSubstringTest extends base.BaseTestPage {
    FirstPage firstPage;
    ResultsPage resultPage;

    @BeforeMethod
    public void setUpTest() {
        setup();
        firstPage = new FirstPage(driver);
        resultPage = new ResultsPage(driver);
    }

    @Test
    public void testLongestSubstring() {
        firstPage.enterText(TestData.INPUT_STRING);
        firstPage.clickSubmit();

        String actualOutput = resultPage.getResult();
        Assert.assertEquals(actualOutput, TestData.EXPECTED_OUTPUT, "Output mismatch!");
    }

    @AfterMethod
    public void tearDownTest() {
        tearDown();
    }
}
