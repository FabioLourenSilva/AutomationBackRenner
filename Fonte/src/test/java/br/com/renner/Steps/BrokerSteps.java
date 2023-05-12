package br.com.renner.Steps;

import br.com.renner.Requests.Broker;
import io.cucumber.java.en.Given;


public class BrokerSteps {

    Broker broker = new Broker();

    @Given("Cotação no Broker")
    public void brokerDeliveryCart() {
        broker.brokerDeliveryCart();
    }

}
