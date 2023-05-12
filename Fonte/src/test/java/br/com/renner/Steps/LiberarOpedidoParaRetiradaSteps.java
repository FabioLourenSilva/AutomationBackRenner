package br.com.renner.Steps;

import br.com.renner.Requests.LiberaPedidoRetirada;
import io.cucumber.java.en.When;


public class LiberarOpedidoParaRetiradaSteps {
    LiberaPedidoRetirada liberaPedidoRetirada = new LiberaPedidoRetirada();

    @When("Libera pedido para retirada")
    public void LiberarOpedidoParaRetirada(){
        liberaPedidoRetirada.liberarOpedidoParaRetirada();

    }
}
