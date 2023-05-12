package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;
import br.com.renner.OMSBase.BaseRest;
import br.com.renner.OMSBase.OMSBody;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static br.com.renner.Requests.IdsEstaticos.idBroker;
import static br.com.renner.Requests.IdsEstaticos.modalId;

public class Broker {
    OMSBody body = new OMSBody();
    BaseRest base = new BaseRest();
    BaseTest baseTest = new BaseTest();
    SetenviromentEntregueTotal ambiente = new SetenviromentEntregueTotal();

    private String env = ambiente.setEnviromentDevPlata() + "bfl/broker/1.0.0/v1/companies/001/broker/delivery/cart/query?verbose=false";

    public void brokerDeliveryCart() {
            base.addHeader("Content-Type", "Application/json");
            base.addHeader("X-Application-Name", "ATG");
            base.addHeader("X-Current-Date", "2021-10-21T14:16:09.523Z");
            base.addHeader("X-Locale", "pt_BR");
            base.addHeader(ambiente.typeToken(), ambiente.token());
            String jsonBody = body.bodyBrokerOms();
            Response response = base.executePostMethod(env, jsonBody);
            Assert.assertEquals(response.statusCode(), 200);
            idBroker = response.getBody().path("id");
            modalId = response.getBody().path("deliveryOptions.deliveryModes[0].modalId[0]");

    HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put(idBroker, modalId);
        System.out.println(modalId + "  " +  idBroker);
//        return idBroker;
    }
}
