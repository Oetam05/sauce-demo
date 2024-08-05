package co.com.bancolombia.certification.sauceprueba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.CurrentVisibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Purchase implements Question<Boolean> {

    private final Target target;

    public Purchase(Target target) {
        this.target = target;
    }

    public static Purchase succesful(Target target) {
        return new Purchase(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(target, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(20)
                        .seconds()
        );
        return CurrentVisibility.of(target).viewedBy(actor).asBoolean();
    }
}
