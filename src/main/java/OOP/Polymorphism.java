package OOP;

class Pattern{

    public void display(){

        for (int i = 0; i < 10; i++) {

            System.out.print("*");
        }
    }


    public void display(char symbol){

        for (int i = 0; i < 10; i++) {
            System.out.print(symbol);
        }
    }
}

class Polymorphism {
    public static void main(String[] arg){

        Pattern objPattern=new Pattern();

        objPattern.display();
        System.out.println(" ");
        objPattern.display('#');
    }
}
