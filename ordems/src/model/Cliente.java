package model;

public class Cliente {
	
	//Atributos
    private String nm_cliente;
    private String doc_num;
    private String rg_ie;
    private String celular;
    private String fone_re;
    private String email;
    private String pes_contato;
    //private String cep;
    private Endereco endereco;
    private int tipo;
    
    public String getNm_cliente() {
		return nm_cliente;
	}


	public void setNm_cliente(String nm_cliente) {
		this.nm_cliente = nm_cliente;
	}


	public String getDoc_num() {
		return doc_num;
	}


	public void setDoc_num(String doc_num) {
		this.doc_num = doc_num;
	}


	public String getRg_ie() {
		return rg_ie;
	}


	public void setRg_ie(String rg_ie) {
		this.rg_ie = rg_ie;
	}


	public String getFone_re() {
		return fone_re;
	}


	public void setFone_re(String fone_re) {
		this.fone_re = fone_re;
	}
	
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	
	public String getPes_contato() {
		return pes_contato;
	}

	public void setPes_contato(String pes_contato) {
		this.pes_contato = pes_contato;
	//}

	//public String getCep() {
		//return cep;
	//}


	//public void setCep(String cep) {
		//this.cep = cep;
	}



	public Cliente(Endereco endereco) {
		this.endereco = endereco;
	}

	
    //Construtor
    public Cliente(){
        this.endereco = new Endereco();
    
    }
	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public void add(Cliente cliente) {
		
	}

	
	}

	
	
	
    



