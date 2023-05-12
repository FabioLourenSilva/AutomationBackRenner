package br.com.renner.Steps;

import br.com.renner.Requests.FinalizaOndaPacking;
import io.cucumber.java.en.When;


public class FinalizaOndaPackingSteps {
    FinalizaOndaPacking finalizaOndaPacking = new FinalizaOndaPacking();

    @When("Finaliza onda de Packing")
    public void finalizaOndaPacking(){
        finalizaOndaPacking.finalizaOndaPacking();

    }
}
