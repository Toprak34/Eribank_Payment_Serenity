package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import pages.HomePageElements;
import pages.PaymentPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class PaymentTo implements Interaction {
    private String phone;
    private String name;
    private Integer payments;
    private String country;

    public PaymentTo(String phone, String name, Integer payments, String country) {

        this.phone = phone;
        this.name = name;
        this.payments = payments;
        this.country = country;

    }

    @Override
    @Step("{0} swipes down screen")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePageElements.PAYMENT_BTN, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(HomePageElements.PAYMENT_BTN),
                WaitUntil.the(PaymentPageElements.COUNTRY_TEXT, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(PaymentPageElements.PHONE_TEXT),
                SendKeys.of(this.phone).into(PaymentPageElements.PHONE_TEXT),
                Click.on(PaymentPageElements.NAME_TEXT),
                SendKeys.of(this.name).into(PaymentPageElements.NAME_TEXT),
                Click.on(PaymentPageElements.AMOUNT),
                SendKeys.of(String.valueOf(this.payments)).into(PaymentPageElements.AMOUNT),
                Click.on(PaymentPageElements.COUNTRY_TEXT),
                SendKeys.of(this.country).into(PaymentPageElements.COUNTRY_TEXT),
                Click.on(PaymentPageElements.SEND_PAYMENT_BTN),
                WaitUntil.the(PaymentPageElements.SENDPAYMENTYES_BUTTON, isClickable()).forNoMoreThan(3).seconds(),
                Click.on(PaymentPageElements.SENDPAYMENTYES_BUTTON)


        );
    }

    public static PaymentTo info(String phone, String name, Integer payments, String country) {
        return instrumented(PaymentTo.class, phone, name, payments, country);
    }


}
