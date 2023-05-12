package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Random;

import static br.com.renner.Requests.IdsEstaticos.*;

public class CriaOrder {
    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    Random random = new Random();
    ExternalId externalId = new ExternalId();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();
    private String env = ambiente.setEnviromentDevPlata() + "oms/commerce" + "/2.0.1/orders";

    private static String orderIDcancelCommerce;

    private static String gerarDigitosAleatorios(int digitos) {
        StringBuilder text = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < digitos; i++) {
            text.append(random.nextInt(10)); // gerar um número aleatório entre 0 e 9
        }
        return text.toString();
    }




    public String criarOrderNoOms() {
//            int externalID =  random.nextInt(999999999);
            String numero = gerarDigitosAleatorios(13);
            base.addHeader("Content-Type", "application/json");
            base.addHeader("X-Application-Name", "OMS");
            base.addHeader("X-Current-Date", "2021-09-	29T18:42:34.750271");
        base.addHeader(ambiente.typeToken(), ambiente.token());
            base.addHeader("X-User", "");
            String jsonBody = body.bodyCriarOrderOMSS(idBroker, numero, modalId);
            Response teste = base.executePostMethod(env, jsonBody);
            Assert.assertEquals(teste.statusCode(), 201);
            String statusPedido = teste.path("partOrders.state").toString();
            Assert.assertEquals(statusPedido, "[CRIADO]");
            orderId = teste.getBody().path("orderId");
        return orderId;
    }

    public String criarOrderNoOmsCancelamentoCommerce() {
//            long externalID =  random.nextLong() % (max - min) + max;
        String numero = gerarDigitosAleatorios(13);
            base.addHeader("Content-Type", "application/json");
            base.addHeader("X-Application-Name", "OMS");
            base.addHeader("X-Current-Date", "2021-09-	29T18:42:34.750271");
        base.addHeader(ambiente.typeToken(), ambiente.token());
            base.addHeader("X-User", "");
            String jsonBody = body.bodyCriarOrderOMSS(idBroker, numero, modalId);
            Response teste = base.executePostMethod(env, jsonBody);
            Assert.assertEquals(teste.statusCode(), 201);
            String statusPedido = teste.path("partOrders.state").toString();
            Assert.assertEquals(statusPedido, "[CRIADO]");
            orderIDcancelCommerce = teste.getBody().path("orderId");
        return orderIDcancelCommerce;
    }
}
