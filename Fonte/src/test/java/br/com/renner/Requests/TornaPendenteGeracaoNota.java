package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;

public class TornaPendenteGeracaoNota {

    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/commerce/2.0.1/companies/001/orders/pending";

    public void pendenteGeracaoNota(){
        base.addHeader("accept","*/*");
        base.addHeader("Content-Type","application/json");
        base.addHeader("X-User","TesteOMS");
        base.addHeader("X-Application-Name", "OMS");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.bodyPendenteGeracaoNota(partOrderIdNovo);
        Response teste = base.executePutMethod(env,jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);
    }
}
