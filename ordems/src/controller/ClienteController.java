package controller;

import dao.Conexao;


public class ClienteController {
	//Metodo para receber os dados,tratar e chamar o metodo insere do ClienteDAO
	private Conexao bd;
	public void ClienteContoller() {
		bd = new Conexao();
	}
	
	
	public void validaCampos (String nome, int documento, int rg, int data, int celular, String email, String contato, int cep, String endereco, int numero, String complemento, String bairro, String cidade, String estado) {
		System.out.println("contoller" + nome);
		System.out.println("contoller" + documento);
		System.out.println("contoller" + rg);
		System.out.println("contoller" + data);
		System.out.println("contoller" + celular);
		System.out.println("contoller" + email);
		System.out.println("contoller" + contato);
		System.out.println("contoller" + cep);
		System.out.println("contoller" + endereco);
		System.out.println("contoller" + numero);
		System.out.println("contoller" + complemento);
		System.out.println("contoller" + bairro);
		System.out.println("contoller" + cidade);
		System.out.println("contoller" + estado);
		
	}

}