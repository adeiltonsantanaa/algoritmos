package algoritmos.selectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

	public static List<Integer> selectionSort(List<Integer> arrDesordenado) {
		List<Integer> arrOrdenado = new ArrayList<>();

		int tamanhoArr = arrDesordenado.size();
		for (int i = 0; i < tamanhoArr; i++) {
			int menor = verificaMenorNumLista(arrDesordenado);
			arrOrdenado.add(arrDesordenado.get(menor));
			arrDesordenado.remove(menor);
		}
		return arrOrdenado;
	}

	private static int verificaMenorNumLista(List<Integer> arrDesordenado) {
		int menorValorEncontrado = arrDesordenado.get(0);
		int menorIndiceParaMenorValor = 0;

		for (int i = 0; i < arrDesordenado.size(); i++) {
			if (arrDesordenado.get(i) < menorValorEncontrado) {
				menorValorEncontrado = arrDesordenado.get(i);
				menorIndiceParaMenorValor = i;
			}
		}
		return menorIndiceParaMenorValor;
	}

	public static void main(String[] args) {
		List<Integer> arrDesordenado = new ArrayList<>(Arrays.asList(6, 5, 4, 34, 87, 567, 431, 37, 8));

		System.out.println(selectionSort(arrDesordenado));

	}

}
