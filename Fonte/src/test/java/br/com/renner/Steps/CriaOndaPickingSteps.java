package br.com.renner.Steps;


import br.com.renner.Requests.CriaOndaPicking;
import io.cucumber.java.en.Then;


public class CriaOndaPickingSteps {

    CriaOndaPicking criaOndaPicking = new CriaOndaPicking();

    @Then("Cria onde Picking")
    public void criarondaPicking() {
        criaOndaPicking.criarondaPicking();

    }

}
