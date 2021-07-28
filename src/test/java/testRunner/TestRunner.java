package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,
        strict = true,
        features = ".//features//smokeTest.feature",
        glue = {"stepDefenition"},
        monochrome=true)

public class TestRunner extends TestCase
{
    public void test(){
    	
    }
}
