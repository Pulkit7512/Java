package Assignment7;

public class part1 {
    abstract class Rodent{
        Rodent(){
            System.out.println("Constructor of Rodent is running.");
        }
        public abstract void eat();
        public abstract void disp();

    } ;
    class Mouse extends Rodent{
        Mouse(){
            System.out.println("Constructor of Mouse is running.");
        }
        public void eat(){
            System.out.println("Mouse is eating cheese.");
        }
        public void disp(){
            System.out.println("I am Mouse... ");
        }
    };
    class Gerbil extends Rodent{
        Gerbil(){
            System.out.println("Constructor of Gerbil is running");
        }
        public void eat(){
            System.out.println("Gerbil is eating boiled egg");
        }
        public void disp(){
            System.out.println("I am Gerbil... ");
        }
    };
    class Hamster extends Rodent{
        Hamster(){
            System.out.println("Constructor of Hamster is running");
        }
        public void eat(){
            System.out.println("Hamster is eating radish");
        }
        public void disp(){
            System.out.println("I am Hamster... ");
        }
    };
}
