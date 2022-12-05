import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quicksort {

	private static List<Integer> quicksort(List<Integer> list) {
		if (list.size() < 2) {

			return list;
		} else {

			Integer pivo = list.get(0);

			List<Integer> menor = list.stream().skip(1).filter(me -> me <= pivo).collect(Collectors.toList());

			List<Integer> maior = list.stream().skip(1).filter(ma -> ma > pivo).collect(Collectors.toList());

			return Stream.of(quicksort(menor).stream(), Stream.of(pivo), quicksort(maior).stream())
					.flatMap(Function.identity()).collect(Collectors.toList());
		}
	}

	public static void main(String[] args) {
		System.out.println(quicksort(Arrays.asList(10, 5, 2, 3)));
	}
}