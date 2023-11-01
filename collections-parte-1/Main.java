package atividades;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Micael");
		names.add("Ludmilla");
		names.add("Sara");
		names.add("Cadmiel");
		names.add("Iasmin");
		names.add("Roger");
		names.add("Priscilla");
		
		Collections.sort(names);
		
		System.out.println("Nomes em ordem alfabética:");
		for(String name: names) {
			System.out.println(name);
		}

	}

}
