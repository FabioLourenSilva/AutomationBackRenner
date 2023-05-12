package br.com.renner.Steps;


import br.com.renner.Requests.PendenteGeracaoNota;
import io.cucumber.java.en.When;


public class PendenteImpressaoNotaSteps {
    PendenteGeracaoNota pendenteGeracaoNota = new PendenteGeracaoNota();


    @When("Torna pedido pendente impressão nota")
    public void pendenteImpressaoNota(){
        pendenteGeracaoNota.pendenteImpressaoNota();

    }

}
