package co.com.bancolombia.certification.sauceprueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CartPage extends PageObject {
    public static final Target BUTTON_CHECKOUT = Target.the("Boton checkout")
            .locatedBy("//*[@id='checkout']");

    public static final Target TXT_NAME = Target.the("Campo nombre")
            .locatedBy("//*[@id='first-name']");

    public static final Target TXT_LASTNAME = Target.the("Campo apellido")
            .locatedBy("//*[@id='last-name']");

    public static final Target TXT_POSTAL = Target.the("Campo codigo postal")
            .locatedBy("//*[@id='postal-code']");

    public static final Target BUTTON_CONTINUE = Target.the("Boton continuar")
            .locatedBy("//*[@id='continue']");

    public static final Target BUTTON_FINISH = Target.the("Boton finalizar")
            .locatedBy("//*[@id='finish']");

    public static final Target TXT_ORDER = Target.the("Texto orden finalizada")
            .locatedBy("//*[@id='checkout_complete_container']/h2");
}
