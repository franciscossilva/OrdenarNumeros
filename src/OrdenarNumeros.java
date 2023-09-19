import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNumeros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        while (true) {
            System.out.println("Digite um numero inteiro(Caso o numero seja negativo irá encerrar: ");
            int numero = scanner.nextInt();
            if (numero < 0) ;
            break;
        }
        if (numero % 2 == 0) {
            numerosPares.add(numero);
        } else {
            numerosImpares.add(numero);
        }
    }


    Collections.sort(numerosPares);
    Collections.sort(numerosImpares, Collections.reverseOrder());

    System.out.println("Numeros Pares em ordem Crescente: ");
    for (
    static int numero : numeroPares) {
    System.out.println(numero);
    }

    System.out.println("Numeros impares em ordem decrescente: ");
    for (int numero : numerosIpares){
    System.out.println(numero);
    }
    }
    }
