package br.com.renner.Steps;


import br.com.renner.Requests.InformaFaturamentoPedido;
import io.cucumber.java.en.When;



public class InformaFaturamentodoPedidoSteps {

    InformaFaturamentoPedido informaFaturamentoPedido = new InformaFaturamentoPedido();


    @When("Informa faturamento do pedido")
    public void informaFaturamentoDoPedido(){
        informaFaturamentoPedido.informaFaturamentoDoPedido();

    }

}
