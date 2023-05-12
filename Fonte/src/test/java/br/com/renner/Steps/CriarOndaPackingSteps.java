package br.com.renner.Steps;


import br.com.renner.Requests.CriaOndaPacking;
import io.cucumber.java.en.When;


public class CriarOndaPackingSteps {
    CriaOndaPacking criaOndaPacking = new CriaOndaPacking();

    @When("Cria onda Packing")
    public void criarondaPacking() {
        criaOndaPacking.criarondaPacking();

    }
}
