package entities;

import java.util.Scanner;

public class Menu extends CadastroPF {

	public void menuCadastro() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------------------");
		System.out.println("     Cadastrar novo usuário     ");
		System.out.println("--------------------------------");
		System.out.println();

		System.out.print("Nome: ");
		setNome(sc.nextLine());
		System.out.print("CPF: ");
		setCpf(sc.nextLong());
		sc.nextLine();
		System.out.print("Email: ");
		setEmail(sc.nextLine());
		System.out.print("Crie uma senha: ");
		setSenha(sc.nextLine());
		System.out.println();

		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("Voltando ao menu inicial...");
		menuInicio();
	}

	public void menuLogin(String email, String senha) {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------------------");
		System.out.println("        Login de usuário        ");
		System.out.println("--------------------------------");
		System.out.println();

		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Senha: ");
		senha = sc.nextLine();

		if (email.equals(getEmail()) == true && senha.equals(getSenha()) == true) {
			System.out.println("Login efetuado com sucesso!");
			System.out.println();
			
			System.out.println("Seja bem vindo!!!");
			System.out.println("Nome: "+ getNome());
			System.out.println("Email: "+ getEmail());
			System.out.println("cpf: "+ getCpf());
			System.out.println();
			System.out.println("Voltando ao menu inicial...");
			menuInicio();
		} else {
			System.out.println("Login invalido! Tente novamente...");
			this.menuLogin(null, null);

		}
	}

	public void menuInicio() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------------------------");
		System.out.println("     Seja muito bem vindo!      ");
		System.out.println("--------------------------------");
		System.out.println();

		System.out.println("(1) - Criar um novo cadastro.");
		System.out.println("(2) - Fazer login.");
		System.out.print("Digite a opção desejada: ");
		int op = sc.nextInt();

		if (op == 1) {
			menuCadastro();
		} else if (op == 2) {
			menuLogin(null, null);
		} else {
			System.out.println("Opção invalida! tente novamente...");
			menuInicio();
		}
	}
}
