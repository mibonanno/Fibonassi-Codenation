package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {
	private static final Integer UNTIL= 350;

	public static List<Integer> fibonacci() {
		List list = new ArrayList<>();
		for (int a = 0, b = 1, i = 0; i < UNTIL; b += a, a = b - a, i++) {
			list.add(a);
			if (a >= UNTIL) {
				break;
			}
		}
		return list;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}