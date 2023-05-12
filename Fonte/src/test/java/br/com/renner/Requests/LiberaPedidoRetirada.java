package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import io.restassured.response.Response;
import org.junit.Assert;

import static br.com.renner.Requests.IdsEstaticos.partOrderIdNovo;

public class LiberaPedidoRetirada {

    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/commerce/2.0.1" +
            "/companies/001/branchOffices/13/orders/"+partOrderIdNovo+"/delivery";

    public void liberarOpedidoParaRetirada(){
        base.addHeader("accept","application/json");
        base.addHeader("X-Application-Name","OMS");
        base.addHeader(ambiente.typeToken(), ambiente.token());
        base.addHeader("X-User","");
        Response teste = base.executePutMethod(env,"{\n}");
        Assert.assertEquals(teste.statusCode(),200);
    }
}
