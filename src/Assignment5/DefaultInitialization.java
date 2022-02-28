package Assignment5;

public class DefaultInitialization {
    public static void main(String[] args) {
    pulkit p=new pulkit();
    p.print();
    //p.printLocal();
        Singleton s=new Singleton();
        s.getEmail();
    }
}
class Singleton{
    String email;

    public static Singleton setEmail(String email) {
       //    this.email = email;
        return new Singleton();
    }

    public void getEmail() {
        System.out.println(this.email);
    }
}
class pulkit{
    Character gender;
    int age;
    public void print(){
        System.out.print(this.age+" "+this.gender);
    }
//    public void printlocal(){
//     int height ;
//        int weight;
//        System.out.println(height+" "+weight);
//    }
    //we cannot print local variables without initializing them;
}