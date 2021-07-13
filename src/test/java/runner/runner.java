package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import page.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature",
    glue = "steps",
    monochrome =  true,
    tags = "@tag1"
)

public class runner{
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }

}