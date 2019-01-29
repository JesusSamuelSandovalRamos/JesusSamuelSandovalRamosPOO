import java.util.Scanner;
public class Cuenta{
    //atributos
    private String titular;
    private double cantidad;

    //métodos
    public void ingresar(double cantidad){
        this.cantidad = this.cantidad + cantidad;
    }

    public void retirar(double cantidad){
        this.cantidad = this.cantidad - cantidad;
    }

    public String toString(){
        return "Titular " + titular + "\n total "+ cantidad;
    }

    public String getTitular(){
        return titular;
    }
    public double  getCantidad(){
        return cantidad;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre :");
        cliente1.titular = scanner.next();

        System.out.println("Ingresa la cantidad ");
        cliente1.ingresar(100.23);

        System.out.println(cliente1.toString());
        System.out.println("Ingresa la cantidad ");
        cliente1.ingresar(500);
        System.out.println("Ingresa la cantidad ");
        cliente1.ingresar(100.23);

        System.out.println(cliente1.toString());

        cliente1.retirar(50);
        cliente1.retirar(50);
        cliente1.retirar(50);

        System.out.println(cliente1.toString());

        cliente1.getTitular();
        cliente1.getCantidad();  

        if(Cuenta<=0) 
        System.out.println("no puede retirar")

        else(cuenta>100)
        System.out.println("usted tiene de saldo eso")
        
        