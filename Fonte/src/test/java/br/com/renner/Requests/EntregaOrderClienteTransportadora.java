package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;


import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;

public class EntregaOrderClienteTransportadora {

    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();

    private String env = ambiente.setEnviromentDevPlata()+ "oms/delivery/2.0.0" +
            "/companies/001/branchOffices/13/orders/"+partOrderIdNovo;

    public void EntregaOrdemCliente_transportadora(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader("X-User","");
        base.addHeader("X-Current-Date","2021-10-06T15:44:08.687241");
        base.addHeader("X-Locale","pt_BR");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.bodyEntregaOrdem();
        Response teste = base.executePostMethod(env,jsonBody);
        Assert.assertEquals(teste.statusCode(),200);
    }
}
