package repaso;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RepasoArrays2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nElementos;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

		char[] letras = new char[nElementos];

		System.out.println("Digite los elementos del arreglo: ");

		for (int i = 0; i < nElementos; i++) {
			System.out.print(i + 1 + ". Digite un caracter: ");
			letras[i] = sc.next().charAt(0);
		}

		System.out.println("\nLos caracteres del arreglo son: ");
		for (int i = 0; i < nElementos; i++) {
			System.out.println(letras[i] + " ");

		}

	}

}
