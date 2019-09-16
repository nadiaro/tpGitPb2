package tpgitpb2;

import java.util.Scanner; 

public class Calculadora {

	public static void main(String[] args) {

		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		Scanner teclado=new Scanner (System.in);

			do{
				System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
						opcion = teclado.nextInt();
			}while (opcion < 1 && opcion > 4);	
			
				System.out.println("Ingrese el primer numero");
				a=teclado.nextInt();
				
				System.out.print("Ingrese un numero");	
				b=teclado.nextInt();
			 
				switch ( opcion ) {
			      case 1:
			           System.out.println( a + b );
			           break;
			      case 2:
			    	  System.out.println( a * b );
			           break;
			      case 3:
			           System.out.println( a - b );

			           break;
			      case 4:
			           System.out.println( a / b );
			           break;
			      default:
			           System.out.println("error" );
			           break;
			      }

		  }
			
		}
	

