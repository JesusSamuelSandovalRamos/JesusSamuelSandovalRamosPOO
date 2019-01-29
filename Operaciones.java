public class Operaciones {
    //Atributos

    public Double a ;
    public Double b;


    //Metodos

    public Double sumarNumeros(){
        return a + b;
    }

    public Double restarNumeros(){
        return a - b;
    } 

    public Double dividirNumeros(){
        return a / b;
    }

    public Double multiplicarNumeros(){
        return a * b;
    }

    public static void main(String[] args) {
        Operaciones operaciones1 = new Operaciones();

         Scanner scanner = new Scanner(System.in);
         
            System.out.println("numero 1");
            operaciones1.a = scanner .nextDouble();

            System.out.println("numero 2");
            operaciones1.b = scanner .nextDouble();

         operaciones1.a = 10;
         operaciones1.b = 20.2;

         Double suma = operaciones1.sumarNumeros();
         System.out.println("el resultado es" + suma);
    }
}