package Aula2;

public class Sincrona {

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
    }

}
