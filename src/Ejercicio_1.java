import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato =new Scanner(System.in);
		int num1;
		int num2;
		int ope;
		int suma,resta,multi,divi;
	
		
		System.out.print("Ingrese un numero: ");
		num1=dato.nextInt();
		
		System.out.print("Ingrese otro numero: ");
		num2=dato.nextInt();
		
		System.out.println("Menu de operaciones");
		
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		
		System.out.print("Que Operacion desea: ");
		ope=dato.nextInt();
		
		
		switch (ope){
		case 1:
            
            suma=num1+num2;
            System.out.println("La suma es: "+suma);
            break;
            
		case 2:
           resta=num1-num2;
           System.out.println("La resta es: "+resta);
           break;
           
		case 3:
            multi=num1*num2;
            System.out.println("La multiplicacion es: "+multi);
            break;
            
		case 4:
			divi=num1/num2;
            System.out.println("La division es: "+divi);
          
          System.out.printf("Fin");
            break;
            
            
		}
	
		
		
		
		
		
		
	}

}
