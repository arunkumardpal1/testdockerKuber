package TestLauncher;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

import com.generics.CustomReporter;



@Listeners(CustomReporter.class)
@CucumberOptions(features = ("features/Testcases.feature"), glue = { "stepDefinition" },
//		 tags = { "@TC_002" },
		plugin = { "html:target/custom-reports/cucumber-htmlreports",
				"json:target/custom-reports/cucumber-reports/cucumber-jsonreports.json",
				"junit:target/custom-reports/cucumber-reports/cucumber-junitreports.xml",
				"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" }, monochrome = true
// , dryRun = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

}