package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:feature"},
        tags = "@RenomearRepositorio",
        glue = "step",
        plugin = {
                "pretty",
                "html: target/cucumber-reports/cucumber.html",
                "json: target/cucumber-reports/cucumber.json",
        },
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        publish = false
)

public class Runner {

}

