package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;

import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;

public class DevolveLojaCliente {
    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/sos/2.0.0/companies" +
            "/001/branchOffices/13/orders/" + partOrderIdNovo+"/returns";

    public void devolvidoCliente() {
        base.addHeader("accept", "*/*");
        base.addHeader("Content-Type", "application/json");
        base.addHeader("X-User","TesteOMS");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.devolvidoClienteLoja();
        Response teste = base.executePostMethod(env, jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);

    }
}
