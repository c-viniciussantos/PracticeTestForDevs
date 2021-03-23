package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroPF {

	// Atributos
	private String nome;
	private Long cpf;
	private String email;
	private String senha;

	protected List<CadastroPF> list = new ArrayList<>();

	// Iniciando o construtor
	public CadastroPF() {
	}

	// Construtor para instancia de objeto
	public CadastroPF(String nome, Long cpf, String email, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

	// Encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<CadastroPF> getList() {
		return list;
	}

	// Metodos
	public void addList(CadastroPF cadastro) {
		list.add(cadastro);
	}

	public void removeList(CadastroPF cadastro) {
		list.remove(cadastro);
	}

	// Metodo para comparação valores
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroPF other = (CadastroPF) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
}
