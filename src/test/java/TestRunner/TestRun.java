package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions( features={".//features/"},
                 //  { ".//features/login.feature"},      //no need to mention feature file name//
                   glue="StepDefinition",
                   dryRun=true,
                   plugin= {"pretty" ,"html:test-output"},
                   tags= {"@sanity"}
                   
		)
public class TestRun {

}
