import java.util.Scanner;

public class Calculadora{

public static void main(String[] args){
  Metodos chavo = new Metodos ();
  Scanner entrada = new Scanner(System.in);
  int n1, n2, resultado, opcion;
  boolean op = true;
  while(op){
    System.out.println("Prebe-calculadora");
    System.out.println("1.Sumar");
    System.out.println("2.Restar");
    System.out.println("3.Multiplicar");
    System.out.println("4.Dividir");
    System.out.println("5.Sacar Angulo");
    System.out.println("6.Sacar Magnitud");
    System.out.println("7.Cambiar numeros para operar");
    System.out.println("8.Salir");
    opcion = entrada.nextInt();

    if (opcion == 8){
      System.out.println("bye");
      break;
    } else {
      switch (opcion){
        case 1:
        System.out.print("Ingrese un valor ");
        n1 = entrada.nextInt();
        System.out.println("");
        System.out.print("ingrese otro valor ");
        n2 = entrada.nextInt();
        resultado = chavo.sumar(n1,n2);
        System.out.println("La suma es " + resultado);
        System.out.println("");
        break;
        case 2:
        System.out.print("Ingrese un valor ");
        n1 = entrada.nextInt();
        System.out.println("");
        System.out.print("ingrese otro valor ");
        n2 = entrada.nextInt();
        resultado = chavo.restar(n1,n2);
        System.out.println("La resta es " + resultado);
        System.out.println("");
        break;
        case 3:
        System.out.print("Ingrese un valor ");
        n1 = entrada.nextInt();
        System.out.println("");
        System.out.print("ingrese otro valor ");
        n2 = entrada.nextInt();
        resultado = chavo.multiplicar(n1,n2);
        System.out.println("La multiplicación es " + resultado);
        System.out.println("");
        break;
        case 4:
        System.out.print("Ingrese un valor ");
        n1 = entrada.nextInt();
        System.out.println("");
        System.out.print("ingrese otro valor ");
        n2 = entrada.nextInt();
        resultado = chavo.dividir(n1,n2);
        System.out.println("La división es " + resultado);
        System.out.println("");
        break;
        case 5:
        System.out.print("proceso...");
        /*n1 = entrada.nextInt();
        System.out.println("");
        System.out.print("ingrese otro valor");
        resultado = chavo.restar(n1,n2);
        System.out.println("La resta es" + resultado);
        */break;
        case 6:
        System.out.print("proceso...");
        /*n1 = entrada.nextInt();
        System.out.println("");
        System.out.print("ingrese otro valor");
        resultado = chavo.restar(n1,n2);
        System.out.println("La resta es" + resultado);
        */break;
        case 7:
        System.out.print("proceso...");
        /*n1 = entrada.nextInt();
        System.out.println("");
        System.out.print("ingrese otro valor");
        resultado = chavo.restar(n1,n2);
        System.out.println("La resta es" + resultado);
*/
        break;

      default:
        System.out.println("Pon una opción plox");
        }
      }
    }
  }
}
