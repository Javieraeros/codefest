package Codefest_AfterParty;

public class reto3 {
	public static void main(String[] args) {
		int num = 7000;
		int contador = 0;
		for (int i = num; i > 0; i--) {
			if (laFuncion(i)) {
				contador++;
			}
		}
		System.out.println(contador);
		System.out.println("RECURSIVIDAD A TOPE!");
	}

	public static boolean laFuncion(int num) {
		boolean devuelve = false;
		if (num - 5 == 1 || (num / 3 == 1 && num % 3 == 0)) {
			devuelve = true;
		} else {
			if (num % 3 == 0) {
				devuelve = laFuncion(num / 3);
			}
			if (!devuelve) {
				if (num - 5 > 0) {
					devuelve = laFuncion(num - 5);
				}
			}
		}
		return devuelve;
	}
}
