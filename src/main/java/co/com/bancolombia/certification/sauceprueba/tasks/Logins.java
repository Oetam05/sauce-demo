package co.com.bancolombia.certification.sauceprueba.tasks;

import co.com.bancolombia.certification.sauceprueba.userinterfaces.LoginPage;
import co.com.bancolombia.certification.sauceprueba.utils.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Logins implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.TXT_USERNAME, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(Constants.VALID_USERNAME).into(LoginPage.TXT_USERNAME),
                Enter.theValue(Constants.PASSWORD).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }

    public static Logins login() {
        return Tasks.instrumented(Logins.class);
    }

}
