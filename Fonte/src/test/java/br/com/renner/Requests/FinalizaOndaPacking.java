package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.packingIdNovo;
import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;

public class FinalizaOndaPacking {

    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/sos/2.0.0/companies" +
            "/001/orders/packing";

    public void finalizaOndaPacking(){
        base.addHeader("accept","*/*");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = base.executePutMethod(env, body.bodyFinalizaPacking(packingIdNovo,partOrderIdNovo));
        Assert.assertEquals(teste.statusCode(),200);
    }
}
