package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty" , "json:target/cucumber-Report/CucumberDemo1.json"}
				,features ="src/test/resources/com/features/LognDataTable.feature"
				,glue ="StepDefinitionDataTable"
		)
public class RunnerOrangeHrm extends AbstractTestNGCucumberTests{

}