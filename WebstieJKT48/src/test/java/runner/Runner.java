package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

// Test Case yang Mau Di Run Detail
@CucumberOptions(
        features = "src/test/resources/feature/login.feature:3",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-report.html"}
)

// Run All features
// @CucumberOptions(
//     features = "src/test/resources/features",
//     glue = "steps",
//     plugin = {
//         "pretty",
//         "html:target/cucumber-report.html"
//     },
//     snippets = CucumberOptions.SnippetType.CAMELCASE
// )



public class Runner {
}