package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.orderId;

public class CancelaPedidoCommerce {

    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/commerce/2.0.1/companies/001/branchOffices/13/orders/canceled";


    public void cancelaPedidoComerce() {
        base.addHeader("accept", "application/json");
        base.addHeader("X-Application-Name", "OMS");
        base.addHeader("X-Locale", "pt_BR");
        base.addHeader("X-Current-Date", "2021-10-06T15:44:08.687241");
        base.addHeader("X-User", "");
        base.addHeader("Content-Type", "application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.bodyCancelamentoCommerce(orderId);
        Response teste = base.executePutMethod(env, jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);

    }
}
