package testscript;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Test1\\Test1.feature","src\\test\\resources\\Test1\\Test2.feature"},
                                  plugin="html:target/report.html")
public class RunnerClass {

}
