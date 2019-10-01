package TugasPBO1;
import java.util.Scanner;
public class TestBuku {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("_________________________________________________");
        System.out.print("The Name of The Author is ");
        String Author = input.nextLine();
        System.out.print("The Title of The Book is ");
        String Name = input.nextLine();
        System.out.print("The Year of Publication is ");
        int Year = input.nextInt();
        System.out.print("The Number of Printed Book is ");
        int Print = input.nextInt();
        System.out.print("The Price of the Book is ");
        double Price = input.nextDouble();
        System.out.println("_________________________________________________");
        
        Buku B1 = new Buku();
        B1.setAuthor(Author);
        B1.setName(Name);
        B1.setYear(Year);
        B1.setPrint(Print);
        B1.setPrice(Price);
        
        B1.info();
    }
}
