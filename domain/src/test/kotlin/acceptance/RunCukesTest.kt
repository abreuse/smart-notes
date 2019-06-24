import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
        plugin = ["pretty"],
        features = ["classpath:features"],
        glue = ["classpath:acceptance.stepdefs"])
class RunCukesTest