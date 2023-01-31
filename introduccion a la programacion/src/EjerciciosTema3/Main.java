package EjerciciosTema3;

public class Main {

    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=7;
        int resultado=sumar3(a,b,c);

        System.out.println(resultado);

        Coche tesla=new Coche();
        tesla.sumarPuerta();
        System.out.println("mi tesla tiene " +tesla.numeroPuertas+" puertas");

    }

    static int sumar3(int a,int b,int c){

        int resultado=a+b+c;
        return resultado;

    }
}
