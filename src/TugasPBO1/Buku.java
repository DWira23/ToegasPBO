package TugasPBO1;
public class Buku {
    private String Author;
    private int Year;
    private int Print;
    private double Price;

    Buku() {
        
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setPrint(int Print) {
        this.Print = Print;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear() {
        return Year;
    }

    public int getPrint() {
        return Print;
    }

    public double getPrice() {
        return Price;
    }

    Buku(String Author, int Year, int Print, double Price) {
        this.Author = Author;
        this.Year = Year;
        this.Print = Print;
        this.Price = Price;
    }
    
    public void info(){
        System.out.println("-------------------------------------------------");
        System.out.println("--------======== BOOK INFORMATION ========--------");
        System.out.println("| Author\t\t: " + this.getAuthor());
        System.out.println("| Year of Publication\t: " + this.getYear());
        System.out.println("| Number of Print\t: " + this.getPrint());
        System.out.println("| Price\t\t\t: Rp." + this.getPrice());
        System.out.println("-------------------------------------------------");
    }

}
