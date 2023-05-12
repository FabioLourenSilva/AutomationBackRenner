package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;

public class InformaFaturamentoPedido {

    private BaseTest base = new BaseTest();
    BaseRest baseRest = new BaseRest();
    OMSBody bodyRequest = new OMSBody();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();

    private String env = ambiente.setEnviromentDevPlata() + "oms/billing" +
            "/2.0.0/companies/001/finish";

    public void informaFaturamentoDoPedido(){
        baseRest.addHeader("accept","application/json");
        baseRest.addHeader("X-Application-Name","OMS");
        baseRest.addHeader("Content-Type","application/json");
        baseRest.addHeader(ambiente.typeToken(), ambiente.token());
        Response teste = baseRest.executePostMethodFaturamento(env,bodyRequest.bodyFaturamento(this.base.getSetupProperty("body-faturamento"), partOrderIdNovo));
        Assert.assertEquals(teste.statusCode(),200);
    }
}
