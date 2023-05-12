package br.com.renner.Steps;


import br.com.renner.Requests.CriaOrder;
import io.cucumber.java.en.Given;



public class CriarOrderNoOmsSteps {

	CriaOrder criaOrder = new CriaOrder();



	@Given("Realiza Criação da order")
	public void criarOrderNoOms() {
		criaOrder.criarOrderNoOms();

	}

	public void criarOrderNoOmsCancelamentoCommerce() {
		criaOrder.criarOrderNoOmsCancelamentoCommerce();

	}


}
