package br.com.renner.Steps;


import io.cucumber.java.en.When;

import br.com.renner.Requests.CancelaPedidoCommerce;

public class CancelaPedidoCommerceSteps {

    CancelaPedidoCommerce cancelaPedidoCommerce = new CancelaPedidoCommerce();
    @When("Realiza cancelamento do pedido Commerce")
    public void cancelaPedidoComerce() {

        cancelaPedidoCommerce.cancelaPedidoComerce();

    }

}
