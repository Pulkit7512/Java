package Assignment7;

class Cycle{
    public  void balance(){
        System.out.println("balance is valid for unicycle and bicycle");
    }
};
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Unicycle start with RS 2500. ");
    }
};
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Bicycle start with Rs 3000. ");
    }
};
class Tricycle extends Cycle{
     public void noBalance(){
         System.out.println("it doesnt need balance");
     }

}
public class part2 {
    public static void main(String[] args) {
        Cycle[] obj = new Cycle[3];
        obj[0] = (Cycle) new Unicycle();
        obj[0].balance();
        obj[1] = (Cycle) new Bicycle();
        obj[1].balance();
        obj[2] = (Cycle) new Tricycle();
        obj[2].balance();
        Unicycle c1=(Unicycle) obj[0];
        c1.balance();
        Bicycle c2=(Bicycle) obj[1];
        c2.balance();
        Tricycle c3=(Tricycle) obj[2];
        c3.balance();

    }
}
