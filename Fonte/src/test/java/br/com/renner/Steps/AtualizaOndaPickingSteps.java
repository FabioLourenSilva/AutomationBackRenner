package br.com.renner.Steps;


import br.com.renner.Requests.AtualizaOndaPicking;
import io.cucumber.java.en.When;


public class AtualizaOndaPickingSteps {

    AtualizaOndaPicking atualizaOndaPicking = new AtualizaOndaPicking();

    @When("Atualiza onda Picking")
    public void atualizaOndaPicking(){
        atualizaOndaPicking.atualizaOndaPicking();

    }

    @When("Atualiza onda Picking Reatendimento")
    public void atualizaOndaPickingReatendimentoLojaCommerce(){
        atualizaOndaPicking.atualizaOndaPickingReatendimentoLojaCommerce();

    }

    @When("Atualiza onda Picking para Cancelado Não Localizado")
    public void atualizaOndaPickingCanceladoNaoLocalizado(){
        atualizaOndaPicking.atualizaOndaPickingCanceladoNaoLocalizado();

    }

}
