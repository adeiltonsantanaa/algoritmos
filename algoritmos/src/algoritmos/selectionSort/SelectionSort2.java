package algoritmos.selectionSort;

public class SelectionSort2 {

	public static void selectionSort(int[] arrDesordenado) {
		int[] arrOrdenado = {};
		
		for (int i = 0; i < arrDesordenado.length; i++) {
			int menor = menorNumero(arrDesordenado);
			arrOrdenado[i] = arrDesordenado[menor];
		}
	}

	public static int menorNumero(int[] arrDesordenado) {
		int menorValorEncontrado = arrDesordenado[0];
		int menorIndiceValor = 0;

		for (int i = 0; i < arrDesordenado.length; i++) {
			if (arrDesordenado[i] < menorValorEncontrado) {
				menorValorEncontrado = arrDesordenado[i];
				menorIndiceValor = i;
			}
		}
		return menorIndiceValor;
	}

	public static void main(String[] args) {
		int[] arrDesordenado = { 5, 3, 6, 2, 10 };

	}
}
