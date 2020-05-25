import java.util.Scanner;
public class RepasoExamen{

    static Scanner teclado=new Scanner(System.in);

    public static void calcularBonoJLMCH(){
        int puntos;
        double salariominimo, montobono;
        //datos de entrada
        System.out.println("ingrese el salario minimo");
        salariominimo=teclado.nextDouble();
        System.out.println("ingrese el puntaje que ha obtenido el profesor");
        puntos=teclado.nextInt();
        //Proceso
        if(puntos>=20 && puntos <=100){
            montobono=0.1*salariominimo;
        }else if(puntos>=101 && puntos<=200){
            montobono=0.5*salariominimo;
        }else{
            montobono=1*salariominimo;
        }
        //Datos de salida 
        System.out.println("el monto de bono es:"+montobono);

    }

    public static void main(String[] arg){
         System.out.println("Holas");
        calcularBonoJLMCH();
    }


}