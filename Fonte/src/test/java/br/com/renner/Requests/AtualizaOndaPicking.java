package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;

import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;
import static br.com.renner.Requests.IdsEstaticos.pickingIdNovo;

public class AtualizaOndaPicking {

    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/sos/2.0.0/companies/001/orders/picking";

    public void atualizaOndaPicking(){
        base.addHeader("accept","*/*");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.bodyAtualizaPicking(pickingIdNovo, partOrderIdNovo);
        Response teste = base.executePutMethod(env,jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);
    }

    public void atualizaOndaPickingReatendimentoLojaCommerce(){
        base.addHeader("accept","*/*");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.bodyAtualizaPickingReatendimentoLojaCommerce(pickingIdNovo, partOrderIdNovo);
        Response teste = base.executePutMethod(env,jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);
    }

    public void atualizaOndaPickingCanceladoNaoLocalizado(){
        base.addHeader("accept","*/*");
        base.addHeader("Content-Type","application/json");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        String jsonBody = body.bodyAtualizaPickingCanceladoNaoLocalizado(pickingIdNovo, partOrderIdNovo);
        Response teste = base.executePutMethod(env,jsonBody);
        Assert.assertEquals(teste.statusCode(), 200);
    }
}
