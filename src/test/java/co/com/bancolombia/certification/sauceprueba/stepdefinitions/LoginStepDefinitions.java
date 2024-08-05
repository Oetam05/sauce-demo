package co.com.bancolombia.certification.sauceprueba.stepdefinitions;

import co.com.bancolombia.certification.sauceprueba.questions.Login;
import co.com.bancolombia.certification.sauceprueba.tasks.Logins;
import co.com.bancolombia.certification.sauceprueba.userinterfaces.LoginPage;
import co.com.bancolombia.certification.sauceprueba.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast()); //se instancia el escenario antes de iniciar
    }

    @Given("^el usuario navega al sitio web$")
    public void elUsuarioNavegaAlSitioWeb() {
        theActorCalled(Constants.ACTOR_NAME).wasAbleTo(Open.browserOn(new LoginPage()));
    }

    @When("^ingresa credenciales validas$")
    public void ingresaCredencialesValidas() {
        theActorInTheSpotlight().attemptsTo(Logins.login());
    }

    @Then("^deberia ver la pagina de productos$")
    public void deberiaVerLaPaginaDeProductos() {
        theActorInTheSpotlight().should(
                seeThat(Login.succesful(LoginPage.TXT_PRODUCTS))
        );
    }

}
