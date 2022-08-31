package Aula2;

import java.util.Scanner;

public class Sincrona {
    static boolean ehDivisivel(int n1, int n2) {
        if(n1 % n2 == 0) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 3;

        if(num1>num2){
            System.out.println("É maior");
        } else if (num2>num1) {
            System.out.println("É menor");
        } else {
            System.out.println("É igual");
        }

        switch (num1) {

            case 1:
                System.out.println("É o número 1");
                break;
            case 2:
                System.out.println("É o número 2");
                break;
            case 3:
                System.out.println("É o número 3");
                break;
            default:
                System.out.println("Não conheço esse número");
                break;
        }

        while(num1<5) {
            System.out.println("Ainda não é 5");
            num1 ++;
        }

        for(int i=0; i <=5; i++) {
            System.out.println(i);
        }

        String nome = "Fernando";

        Integer numero1 = 10;
        Integer numero2 = 30;

        System.out.println(numero1.equals(9));

        System.out.println(nome.charAt(1));

        System.out.println(numero1.compareTo(numero2));
        //resultado 1, 0, -1

        Scanner sc = new Scanner(System.in);
        //construtor, capturar o input do usuário

        System.out.println(ehDivisivel(20,10));








    }

}
