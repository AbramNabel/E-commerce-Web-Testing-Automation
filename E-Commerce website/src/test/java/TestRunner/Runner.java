package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner
{
    @CucumberOptions
            (
                    features = "src/main/resources/Features",
                    glue = {"stepDefs"},
                    plugin = { "pretty",
                            "html:target/cucumber_report.html"

                    },
                    tags = "@smoke"


            )


    public class runner extends AbstractTestNGCucumberTests{}
}
