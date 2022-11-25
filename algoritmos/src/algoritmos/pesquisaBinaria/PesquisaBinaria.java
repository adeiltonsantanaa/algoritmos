package algoritmos.pesquisaBinaria;

public class PesquisaBinaria {

	public static Integer pesquisaBinaria(int[] ints, int item) {
		int inicio_pesquisa = 0;
		int final_pesquisa = ints.length - 1;

		while (inicio_pesquisa <= final_pesquisa) {
			int local_chute = (inicio_pesquisa + final_pesquisa) / 2;
			int resultado_chute = ints[local_chute];
			if (resultado_chute == item) {
				return local_chute;
			}
			if (resultado_chute > item) {
				final_pesquisa = local_chute - 1;
			} else {
				inicio_pesquisa = local_chute + 1;
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int[] inteiros = { 1, 3, 5, 7, 9, 12, 34, 511, 157, 59 };

		
		System.out.println(PesquisaBinaria.pesquisaBinaria(inteiros, 1)); //0
		System.out.println(PesquisaBinaria.pesquisaBinaria(inteiros, 3)); //1
		System.out.println(PesquisaBinaria.pesquisaBinaria(inteiros, 5)); //2
		System.out.println(PesquisaBinaria.pesquisaBinaria(inteiros, 511)); //7
		System.out.println(PesquisaBinaria.pesquisaBinaria(inteiros, 34)); //6
		System.out.println(PesquisaBinaria.pesquisaBinaria(inteiros, -1)); //NULL
	}

}
