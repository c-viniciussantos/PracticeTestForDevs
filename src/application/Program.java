package application;

import java.util.Scanner;

import entities.Menu;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();

		menu.menuInicio();

		sc.close();
	}
}
