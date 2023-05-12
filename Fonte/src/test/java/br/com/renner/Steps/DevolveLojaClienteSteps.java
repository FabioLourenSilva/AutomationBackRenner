package br.com.renner.Steps;


import br.com.renner.Requests.DevolveLojaCliente;
import io.cucumber.java.en.When;


public class DevolveLojaClienteSteps {

    DevolveLojaCliente devolveLojaCliente = new DevolveLojaCliente();

    @When("Realiza devolução na entrega")
    public void devolvidoCliente() {
        devolveLojaCliente.devolvidoCliente();


    }

}
