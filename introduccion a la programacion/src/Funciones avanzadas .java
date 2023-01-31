class Main {
    public static void main(String[] args) {

        int param1=10;
        int param2=30;

        suma(10,30);
        System.out.println();

    }
    public static void suma(int a, int b){
        System.out.println("los parametros son" +a+b);
        System.out.println("resultado de la operación= " +(a+b)); //imprime lo que te hago operar
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        Potato elPotato=new Potato();

        elPotato.quitarBrazo();
        elPotato.quitarBrazo();
        elPotato.quitarBrazo();


    }
}

class Potato{
    public int brazo=0;

    public void quitarBrazo(){
        this.brazo--;
        System.out.println("numero de brazos:  "+this.brazo);
    }

}