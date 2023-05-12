package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.orderId;
import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;


public class ConsultaDadosPedido {

    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/commerce/"+
            "2.0.1/companies/001/branchOffices/13/orders?orderId="+orderId+"&partOrderId="+partOrderIdNovo;

    private String envCancelamento = ambiente.setEnviromentDevPlata() + "oms/commerce/"+
            "2.0.1/companies/001/branchOffices/13/orders?orderId="+orderId;

    public void consultaDadosPedidos(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "ENTREGUE_TOTAL_TRANSPORTADOR");
    }

    public void consultaDadosDevolvidoCliente(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "DEVOLVIDO_CLIENTE_LOJA");
    }

    public void consultaDadosPedidoCancelamentoPaking(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "LOCALIZADO_TOTAL");
    }

    public void consultaDadosCancelamentoPiking(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "NOVO");
    }

    public void consultaDadosPedidoReatendimentoLoja(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "ENTREGUE_TOTAL_TRANSPORTADOR");
    }

    public void consultaDadosPedidoReatendimentoEcomerce(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "REATENDIMENTO_POR_ECOMMERCE");
    }

    public void consultaDadosPedidosPendenteGeracaoNota(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "PENDENTE_GERACAO_NOTA");
    }

    public void consultaDadosPedidosPendenteImpressaoNota(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "PENDENTE_IMPRESSAO_NOTA");
    }

    public void consultaDadosPedidosCanceladoNaoLocalizado(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "CANCELADO_NAO_LOCALIZADO");
    }

    public void consultaDadosPedidosCanceladoCommerce(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(env);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, "CANCELADO");
    }

    public void consultaDadosPedidosCancelamento(String status){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-User","");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executeGetMethod(envCancelamento);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = (teste.path("partOrders.state[0]")).toString();
        Assert.assertEquals(statusPedido, status);
    }
}
