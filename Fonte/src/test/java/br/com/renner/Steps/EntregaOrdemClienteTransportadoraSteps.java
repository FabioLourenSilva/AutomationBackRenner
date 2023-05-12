package br.com.renner.Steps;


import br.com.renner.Requests.EntregaOrderClienteTransportadora;
import io.cucumber.java.en.When;


public class EntregaOrdemClienteTransportadoraSteps {

    EntregaOrderClienteTransportadora entregaOrderClienteTransportadora = new EntregaOrderClienteTransportadora();


    @When("Entrega orden Cliente")
    public void EntregaOrdemCliente_transportadora(){
        entregaOrderClienteTransportadora.EntregaOrdemCliente_transportadora();

    }
}
