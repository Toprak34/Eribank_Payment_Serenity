package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageElements {
    public static Target PAYMENT_BTN = Target.the("make payment button")
            .located(By.id("makePaymentButton"));

}
