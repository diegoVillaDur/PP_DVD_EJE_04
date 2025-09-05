

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int opcion = 0, numero, total;
        double numeroRaiz, raiz;
        float base, altura, area;

        Scanner sc = new Scanner(System.in);

        while (opcion != 4) {
            System.out.println("1.- Calcular el area de un triangulo");
            System.out.println("2.- Calcular el total de un numero");
            System.out.println("3.- Calcular la raiz cuadrada de un numero");
            System.out.println("4.- Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la base del triangulo");
                    base = sc.nextFloat();

                    System.out.println("Ingrese la altura del triangulo");
                    altura = sc.nextFloat();

                    area = base * altura / 2;
                    System.out.println("El area de un triangulo: " + area);
                    break;

                case 2:
                    total = 1;
                    System.out.println("Ingrese un numero");
                    numero = sc.nextInt();

                    for (int i = 1; i <= numero; i++) {
                        total = total * i;
                    }
                    System.out.println("El total del numero: " + total);
                    break;

                case 3:
                    System.out.println("Ingrese un numero");
                    numeroRaiz = sc.nextDouble();
                    raiz = Math.sqrt(numeroRaiz);
                    System.out.println("La raiz cuadrada del numero: " + raiz);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        }
        System.out.println("Auf Wiedersehen");
    }
}
