package br.com.renner.Steps;


import br.com.renner.Requests.TornaPendenteGeracaoNota;
import io.cucumber.java.en.When;


public class TornaPendenteGeracaoNotaSteps {

    TornaPendenteGeracaoNota tornaPendenteGeracaoNota = new TornaPendenteGeracaoNota();

    @When("Torna pedido pendente geração nota no OMS")
    public void pendenteGeracaoNota(){
        tornaPendenteGeracaoNota.pendenteGeracaoNota();

    }

}
