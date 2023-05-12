package br.com.renner.Steps;


import br.com.renner.Requests.AprovarPedido;
import io.cucumber.java.en.When;


public class AprovarPedidoSteps {
    AprovarPedido aprovarPedido = new AprovarPedido();

    @When("Aprova Pedido")
    public void aprovarPedidoOms() {
        aprovarPedido.aprovarPedidoOms();
    }
    @When("Aprova Pedido Impressao Nota")
    public void aprovarPedidoNotaPendente() {
        aprovarPedido.aprovarPedidoImpressaoNota();
    }

}
