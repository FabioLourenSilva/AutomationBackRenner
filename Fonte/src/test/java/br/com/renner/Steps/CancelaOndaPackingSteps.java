package br.com.renner.Steps;


import br.com.renner.Requests.CancelaOndaPaking;
import io.cucumber.java.en.When;

public class CancelaOndaPackingSteps {


    CancelaOndaPaking cancelaOndaPaking = new CancelaOndaPaking();
    @When("Realiza cancelamento no Paking")
    public void cancelaOndaPacking() {
        cancelaOndaPaking.cancelaOndaPacking();
    }

}
