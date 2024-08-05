package co.com.bancolombia.certification.sauceprueba.tasks;

import co.com.bancolombia.certification.sauceprueba.userinterfaces.CartPage;
import co.com.bancolombia.certification.sauceprueba.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CompleteOrder implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartPage.BUTTON_CHECKOUT),
                WaitUntil.the(CartPage.TXT_NAME, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(Constants.NAME).into(CartPage.TXT_NAME),
                Enter.theValue(Constants.LASTNAME).into(CartPage.TXT_LASTNAME),
                Enter.theValue(Constants.POSTAL).into(CartPage.TXT_POSTAL),
                Click.on(CartPage.BUTTON_CONTINUE),
                WaitUntil.the(CartPage.BUTTON_FINISH, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(CartPage.BUTTON_FINISH),
                WaitUntil.the(CartPage.TXT_ORDER, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds()
        );
    }

    public static CompleteOrder completeOrder(){
        return Tasks.instrumented(CompleteOrder.class);
    }

}
