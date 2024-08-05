package co.com.bancolombia.certification.sauceprueba.stepdefinitions;

import co.com.bancolombia.certification.sauceprueba.questions.Purchase;
import co.com.bancolombia.certification.sauceprueba.tasks.AddToCart;
import co.com.bancolombia.certification.sauceprueba.tasks.CompleteOrder;
import co.com.bancolombia.certification.sauceprueba.userinterfaces.CartPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchaseStepDefinitions {

    @Before
    public void setup(){
        setTheStage(new OnlineCast()); //se instancia el escenario antes de iniciar
    }

    @When("^agrega productos al carrito de compra$")
    public void agregaProductosAlCarritoDeCompra() {
        theActorInTheSpotlight().attemptsTo(AddToCart.addToCart());
    }

    @When("^completa todo el registro de la orden$")
    public void completaTodoElRegistroDeLaOrden() {
        theActorInTheSpotlight().attemptsTo(CompleteOrder.completeOrder());
    }

    @Then("^el sistema deberia procesar la compra$")
    public void elSistemaDeberiaProcesarLaCompra() {
        theActorInTheSpotlight().should(
                seeThat(Purchase.succesful(CartPage.TXT_ORDER))
        );
    }
}
