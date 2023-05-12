package br.com.renner.Steps;


import br.com.renner.Requests.CancelaOndaPicking;
import io.cucumber.java.en.When;


public class CancelaOndaPickingSteps {

    CancelaOndaPicking cancelaOndaPicking = new CancelaOndaPicking();

    @When("Realiza cancelamento no Pinking")
    public void cancelaOndaPicking() {
        cancelaOndaPicking.cancelaOndaPicking();

    }

}
