package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features/CreateWorkTypeGroup.feature",
glue = {"stepscreateWTG", "hooks"},
monochrome = true,
publish = true)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
