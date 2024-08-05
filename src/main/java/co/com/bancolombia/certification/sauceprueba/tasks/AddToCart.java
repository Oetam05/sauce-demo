package co.com.bancolombia.certification.sauceprueba.tasks;

import co.com.bancolombia.certification.sauceprueba.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.PRODUCT_1),
                Click.on(HomePage.PRODUCT_2),
                Click.on(HomePage.PRODUCT_3),
                Click.on(HomePage.BUTTON_CART)
        );
    }

    public static AddToCart addToCart(){
        return Tasks.instrumented(AddToCart.class);
    }
}
