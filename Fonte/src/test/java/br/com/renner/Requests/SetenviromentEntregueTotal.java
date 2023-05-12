package br.com.renner.Requests;

import br.com.renner.Core.BaseTest;

public class SetenviromentEntregueTotal {
    private String url;
    private String urlBase;
    private String urlBroken;
    private String urlPlata;
    private String token;
    private String typeAutorization;
    private BaseTest baseTest = new BaseTest();

    public SetenviromentEntregueTotal(){

        System.out.println(System.getProperty("test.ambiente"));
        switch(System.getProperty("test.ambiente")){
            case "hml":
                urlBase = this.baseTest.getSetupProperty("base-url-hml");
                token = this.baseTest.getSetupProperty("tokenHml");
                typeAutorization = this.baseTest.getSetupProperty("tipo,autorizacao.hml");
                break;
            case "dev":
                token = this.baseTest.getSetupProperty("apyKey");
                typeAutorization = this.baseTest.getSetupProperty("tipo,autorizacao.dev");
                urlBase = this.baseTest.getSetupProperty("base-url-dev");
                break;
            case "local":
                urlBase = this.baseTest.getSetupProperty("base-url-local");
                break;
        }
    }


    public String setEnviromentDevPlata(){

        this.url = new StringBuilder()
                .append(urlBase)
                .toString();
        return this.url;
    }

    public String token(){
        this.url = new StringBuilder()
                .append(token)
                .toString();
        return this.url;
    }

    public String apikey(){
        this.url = new StringBuilder()
                .append(token)
                .toString();
        return this.url;
    }

    public String typeToken(){
        this.url = new StringBuilder()
                .append(typeAutorization)
                .toString();
        return this.url;
    }



}
