package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbriConta = By.xpath("/html/body/div[2]/nav[2]/div[2]/div[4]/a");
	private By btnAbrirConta = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By validacao = By.cssSelector("#pu-modalSucesso > div > div:nth-child(2) > p > span:nth-child(1)");

	public By getBtnAbriConta() {
		return btnAbriConta;
	}

	public void setBtnAbriConta(By btnAbriConta) {
		this.btnAbriConta = btnAbriConta;
	}

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public void setBtnAbrirConta(By btnAbrirConta) {
		this.btnAbrirConta = btnAbrirConta;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(By campoNome) {
		this.campoNome = campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public void setCampoTelefone(By campoTelefone) {
		this.campoTelefone = campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public void setCampoEmail(By campoEmail) {
		this.campoEmail = campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public void setCampoCpf(By campoCpf) {
		this.campoCpf = campoCpf;
	}

	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}

	public void setBtnQueroSerCliente(By btnQueroSerCliente) {
		this.btnQueroSerCliente = btnQueroSerCliente;
	}

	public By getValidacao() {
		return validacao;
	}

	

}
