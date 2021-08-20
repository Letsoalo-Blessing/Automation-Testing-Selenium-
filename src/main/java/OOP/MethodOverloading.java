package OOP;

public class MethodOverloading {

    private int sum(int a, int b){

        return a+b;
    }

    private double sum(double a, double b){

        return a+b;}

    public static void main(String arg[]){

        MethodOverloading objOverloading=new MethodOverloading();


        System.out.println(objOverloading.sum(10,115));

        System.out.println(objOverloading.sum(10.2,89.25));
    }
}
