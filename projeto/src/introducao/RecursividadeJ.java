package introducao;

public class RecursividadeJ {

	public static void main(String[] args) {
		loop(1, 100000);
	}

	public static void loop(int inicio, int fim) {
		if (inicio < fim) loop(inicio + 1, fim);
	    else System.out.println("fim");
	}
}
