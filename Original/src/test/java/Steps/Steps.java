package Steps;

import org.openqa.selenium.WebDriver;

import Elementos.Elementos;
import Metodos.Metodos;
import Metodos.page;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;

public class Steps {
    WebDriver driver;
	page p = new page();
	Elementos e = new Elementos();
	Metodos m = new Metodos();

	@Dado("^que o usuario acesse a URL \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_UR(String url) throws Throwable {

		m.ExecutarNavegador(url);
	}

	@E("^selecione o campo abrir conta$")
	public void selecione_o_campo_abrir_conta() throws Throwable {
		m.clicar(e.getBtnAbriConta());
	}

	@E("^selecione o tipo de pessoa fisica$")
	public void selecione_o_tipo_de_pessoa_fisica() throws Throwable {
		m.clicar(e.getBtnAbrirConta());
	}

	@E("^prencha os dados$")
	public void prencha_os_dados() throws Throwable {
		m.pausa(2000);
		m.preencher(e.getCampoNome(), "Juan Pedro Cláudio da Cunha");
		m.preencher(e.getCampoTelefone(), "71996784288");
		m.preencher(e.getCampoEmail(), "juan_dacunha@br.gestant.com");
		m.preencher(e.getCampoCpf(), "82251029168");

	}

	@Quando("^selecionar o botão quero abrir conta$")
	public void selecionar_o_botão_quero_abrir_conta() throws Throwable {
		m.pausa(2000);
		m.clicar(e.getBtnQueroSerCliente());
	}

	@Então("^realizo a validação do texto falta pouco$")
	public void realizo_a_validação_do_texto_falta_pouco() throws Throwable {
		m.pausa(7000);
		m.validarTexto("Falta pouco!", e.getValidacao());
	}
}
