public class Cicle {
    //Atributos
    Double area;
    Double length;
    Double perimeter;
    Double width;

    //Metodos
    public void calcArea() {
        area = Math.PI * Math.pow(width / 2) , 2);
    } 

    public void calcPerimeter (){
        perimeter = 2 * Math.PI * (width / 2);
    }

    public Double getArea(){
        return area;
    } 

    public Double getPerimeter(){
        return perimeter;
    }

    public void setLength(Double length){

    }

     public static void main(String[] args) {
         // circle1;
         //circle1 = new circle();
        Crcle circle1 = new Circle();
        Cicle circle2 = new Cicle();
        Cicle circle3 = new Cicle();

        circle1.width = 5.2d;
        circle2.width = 10d;
        circle3.width = 20d;

        circle1.calcArea();
        circle2.calcArea();
        circle3.calcArea();

        System.out.println("El area de circle1 es:"+ circle1.getArea())
        System.out.println("El area de circle2 es:"+ circle2.getArea())
        System.out.println("El area de circle3 es:"+ circle3.getArea())

        circle1.calcPerimeter();
        circle2.calcPerimeter();
        circle3.calcPerimeter();

        System.out.println("El perimetro del circle1 es:"+ circle1.getPerimeter())
        System.out.println("El perimetro del circle2 es:"+ circle2.getPerimeter())
        System.out.println("El perimetro del circle3 es:"+ circle3.getPerimeter())
     }
}