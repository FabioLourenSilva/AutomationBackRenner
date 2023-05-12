package br.com.renner.Steps;


import br.com.renner.Requests.ConsultaDadosPedido;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ConsultaDadosPedidoSteps {

    ConsultaDadosPedido consultaDadosPedido = new ConsultaDadosPedido();



    @Then("Consulta dados pedido: ENTREGUE_TOTAL_TRANSPORTADOR")
    public void consultaDadosPedidos(){
        consultaDadosPedido.consultaDadosPedidos();
    }

    @Then("Consulta dados pedido: DEVOLVIDO_CLIENTE_LOJA")
    public void consultaDadosPedidosDevolvidoCliente(){
        consultaDadosPedido.consultaDadosDevolvidoCliente();
    }



    @Then("Consulta dados pedido: LOCALIZADO_TOTAL")
    public void consultaDadosPedidoCancelamentoPaking(){
        consultaDadosPedido.consultaDadosPedidoCancelamentoPaking();

    }


    @Then("Consulta dados pedido: NOVO")
    public void consultaDadosCancelamentoPiking(){
        consultaDadosPedido.consultaDadosCancelamentoPiking();

    }


    @When("Consulta dados pedido: REATENDIMENTO_POR_LOJA")
    public void consultaDadosPedidoReatendimentoLoja(){
        consultaDadosPedido.consultaDadosPedidoReatendimentoLoja();

    }


    @Then("Consulta dados pedido: REATENDIMENTO_POR_ECOMMERCE")
    public void consultaDadosPedidoReatendimentoEcomerce(){
        consultaDadosPedido.consultaDadosPedidoReatendimentoEcomerce();

    }


    @Then("Consulta dados pedido: PENDENTE_GERACAO_NOTA")
    public void consultaDadosPedidosPendenteGeracaoNota(){
        consultaDadosPedido.consultaDadosPedidosPendenteGeracaoNota();

    }


    @Then("Consulta dados pedido: PENDENTE_IMPRESSAO_NOTA")
    public void consultaDadosPedidosPendenteImpressaoNota(){
        consultaDadosPedido.consultaDadosPedidosPendenteImpressaoNota();

    }


    @Then("Consulta dados pedido: CANCELADO_NAO_LOCALIZADO")
    public void consultaDadosPedidosCanceladoNaoLocalizado(){
        consultaDadosPedido.consultaDadosPedidosCanceladoNaoLocalizado();

    }


    @Then("Consulta dados pedido: CANCELADO")
    public void consultaDadosPedidosCanceladoCommerce(){
        consultaDadosPedido.consultaDadosPedidosCanceladoCommerce();

    }

    public void consultaDadosPedidosCancelamento(String status){
        consultaDadosPedido.consultaDadosPedidosCancelamento("CANCELADO");

    }
}
