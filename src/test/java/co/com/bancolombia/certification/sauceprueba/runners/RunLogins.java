package co.com.bancolombia.certification.sauceprueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        glue = "co.com.bancolombia.certification.sauceprueba.stepdefinitions",
        features = "src/test/resources/features/login.feature",  //Se puede usar carpeta utils
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class RunLogins {
}
