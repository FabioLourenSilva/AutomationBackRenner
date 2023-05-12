package br.com.renner.OMSBase;

import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class BaseRest {


    protected Map<String, Object> headers = new HashMap<String, Object>();

    public BaseRest(){
        headers.put("Content-Type", "application/json");
    }

    public Response executeGetMethod(String path){
        Response results =
                given()
                        .headers(headers)
                        .relaxedHTTPSValidation()
                        .log().all()
                .when()
                        .get(path)
                .then()
                        .log().all()
                        .extract()
                        .response();
        return results;
    }

    public Response executePostMethod(String path, String jsonBody){
        Response results =
                given()
                        .headers(headers)
                        .body(jsonBody)
                        .relaxedHTTPSValidation()
                        .log().all()
                .when()
                        .post(path)
                .then()
                        .log().all()
                        .extract()
                        .response();
        return results;
    }

    public Response executePostMethodFaturamento(String path, String jsonBody){
        Response results =
                given()
                        .headers(headers)
                        .relaxedHTTPSValidation()
                        .body(jsonBody)
                        .when()
                        .post(path)
                        .then()
                        .log().all()
                        .extract()
                        .response();
        return results;
    }

    public Response executePutMethod(String path, String jsonBody){
        Response results =
                given()
                        .headers(headers)
                        .relaxedHTTPSValidation()
                        .body(jsonBody)
                        .log().all()
                .when()
                        .put(path)
                .then()
                        .log().all()
                        .extract()
                        .response();
        return results;
    }

    public void addHeader(String key, String value){
        headers.put(key,value);
    }
    public void removeHeader(String key){
        headers.remove(key);
    }



}