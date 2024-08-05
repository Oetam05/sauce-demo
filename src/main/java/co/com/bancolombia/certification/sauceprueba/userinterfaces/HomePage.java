package co.com.bancolombia.certification.sauceprueba.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target PRODUCT_1 = Target.the("Producto 1")
            .locatedBy("//*[@id='add-to-cart-sauce-labs-backpack']");

    public static final Target PRODUCT_2 = Target.the("Producto 2")
            .locatedBy("//*[@id='add-to-cart-sauce-labs-bike-light']");

    public static final Target PRODUCT_3 = Target.the("Producto 3")
            .locatedBy("//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']");

    public static final Target BUTTON_CART = Target.the("Boton carrito")
            .locatedBy("//*[@id='shopping_cart_container']/a");

}
