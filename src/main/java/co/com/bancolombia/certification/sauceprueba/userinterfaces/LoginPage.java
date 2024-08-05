package co.com.bancolombia.certification.sauceprueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")

public class LoginPage extends PageObject {

    public static final Target TXT_USERNAME = Target.the("Campo usuario").
            locatedBy("//*[@id='user-name']");

    public static final Target TXT_PASSWORD = Target.the("Campo usuario").
            locatedBy("//*[@id='password']");

    public static final Target BUTTON_LOGIN = Target.the("Campo usuario").
            locatedBy("//*[@id='login-button']");

    public static final Target TXT_PRODUCTS = Target.the("Texto de Products").
            locatedBy("//*[@id='header_container']/div[2]/span");
}
