package TugasPBO1;
import java.util.Scanner;
public class TestPelajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________________________________________________");
        System.out.print("The NIP of The Student is ");
        String NIP = input.nextLine();
        System.out.print("The Name of The Student is ");
        String Name = input.nextLine();
        System.out.print("The Number of The First Score is ");
        int TestScore1 = input.nextInt();
        System.out.print("The Number of The Second Test is ");
        int TestScore2 = input.nextInt();
        System.out.print("The Number of The Task Score is ");
        double TaskScore = input.nextDouble();
        System.out.println("_________________________________________________");
        System.out.println("");
        
        Pelajar P1 = new Pelajar();
        P1.setNip(NIP);
        P1.setName(Name);
        P1.setTestScore1(TestScore1);
        P1.setTestScore2(TestScore2);
        P1.setTaskScore(TaskScore);
        
        P1.Status();
    }
}
