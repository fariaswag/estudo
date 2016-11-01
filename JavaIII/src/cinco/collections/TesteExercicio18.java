package cinco.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TesteExercicio18 {

	public static void main(String[] args) {

		TreeSet<Integer> numeros = new TreeSet<>();
		for (int i = 0; i < 1000; i++) {
			numeros.add(i);
		}
		
		for (Integer integer : numeros.descendingSet()) {
			System.out.println(integer);
		}
		
		ArrayList<Integer> numeros2 = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			numeros.add(i);
		}
		
		Collections.reverse(numeros2);
		for (Integer integer : numeros2) {
			System.out.println(integer);
		}

	}
}
