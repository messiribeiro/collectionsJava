import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class App {

	public static void main(String[] args) {
		

        Map<String, String> namesAndGenders = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean controll = true;
		
		
		do {
			System.out.println("Digite seu nome \ndigite 'sair' para sair");
			String input = sc.next();

			if(input.equals("sair")) {
				controll = false;
				break;
			}else {
                boolean rightInput = false;
                do {
                    System.out.println("Qual seu sexo? \n1 - Masculino \n2 - Feminino");
                    String gender = sc.next();
				    namesAndGenders.put(input, gender);

                    if(gender.equals("1") || gender.equals("2"))rightInput = true;
                    else System.out.println("\nValor inválido!!\n");
                }while(rightInput == false);
				
			}
			
		}while(controll==true);
		

		
		System.out.println("\nMasculinos:\n");

		for(Map.Entry<String, String> entry: namesAndGenders.entrySet()){
            String name = entry.getKey();
            String gender = entry.getValue();

            if(gender.equals("1")) System.out.println(name);
        }

        System.out.println("\nFemininos:\n");

        for(Map.Entry<String, String> entry: namesAndGenders.entrySet()){
            String name = entry.getKey();
            String gender = entry.getValue();
            if(gender.equals("2")) System.out.println(name);
        }

	}

}
