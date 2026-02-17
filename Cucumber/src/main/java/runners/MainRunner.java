package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features",
        glue ="stepDefinitions",
        tags ="@Conta-Us", monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber"}
)
public class MainRunner extends AbstractTestNGCucumberTests {
}

