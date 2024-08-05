package co.com.bancolombia.certification.sauceprueba.questions;

import co.com.bancolombia.certification.sauceprueba.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Login implements Question<Boolean> {

    private final Target target;

    public Login(Target target) {
        this.target = target;
    }

    public static Login succesful(Target target) {
        return new Login(target);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.TXT_PRODUCTS, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(20)
                        .seconds()
        );
        return CurrentVisibility.of(target).viewedBy(actor).asBoolean();
    }
}
