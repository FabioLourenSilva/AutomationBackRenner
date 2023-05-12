package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.orderId;
import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;

public class AprovarPedido {

    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();

    private String env = ambiente.setEnviromentDevPlata() + "oms/commerce/2.0.1/companies/001/branchOffices/13/orders/" +orderId+ "/approved";


    public String aprovarPedidoOms() {
            base.addHeader("accept", "application/json");
            base.addHeader("X-Application-Name", "OMS");
            base.addHeader("X-Locale", "pt_BR");
            base.addHeader("X-Current-Date", "2021-10-06T15:44:08.687241");
            base.addHeader("X-User", "");
            base.addHeader("Content-Type", "application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
            String jsonBody = body.bodyAprovarPedidoOms();
            Response teste = base.executePutMethod(env, jsonBody);
            Assert.assertEquals(teste.statusCode(), 200);
            String statusPedido = teste.path("message").toString();
            Assert.assertEquals(statusPedido, "Order Approved!");
            partOrderIdNovo = teste.getBody().path("data.partOrders[0].partOrderId");
            System.out.println(partOrderIdNovo);
        return partOrderIdNovo;
    }

    public String aprovarPedidoImpressaoNota() {
        base.addHeader("accept", "application/json");
        base.addHeader("X-Application-Name", "OMS");
        base.addHeader("X-Locale", "pt_BR");
        base.addHeader("X-Current-Date", "2021-10-06T15:44:08.687241");
        base.addHeader("X-User", "");
        base.addHeader("Content-Type", "application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.bodyAprovarPedidoPendenteImpressaoNota();
        Response teste = base.executePutMethod(env, jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);
        String statusPedido = teste.path("message").toString();
        Assert.assertEquals(statusPedido, "Order Approved!");
        partOrderIdNovo = teste.getBody().path("data.partOrders[0].partOrderId");
        System.out.println(partOrderIdNovo);
        return partOrderIdNovo;
    }
}
