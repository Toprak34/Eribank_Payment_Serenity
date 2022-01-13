package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaymentPageElements {
    public static Target PHONE_TEXT = Target.the("PHONE field")
            .located(By.id("phoneTextField"));

    public static Target NAME_TEXT = Target.the("NAME field")
            .located(By.id("nameTextField"));

    public static Target AMOUNT = Target.the("AMOUNT")
            .located(By.id("amount"));

    public static Target COUNTRY_TEXT = Target.the("COUNTRY field")
            .located(By.id("countryTextField"));

    public static Target SEND_PAYMENT_BTN = Target.the("SEND PAYMENT button")
            .located(By.id("sendPaymentButton"));

    public static Target SENDPAYMENTYES_BUTTON= Target.the("sendpayment yes button")
            .located(By.id("android:id/button1"));

    public static Target getLastBalance(int Balance){
        Target BALANCE_TEXT = Target.the("last balance text")
                .located(By.xpath("//android.view.View[@content-desc=\"Your balance is: " + Balance + ".00$\"]\n"));
        return  BALANCE_TEXT;
    }


}
