package TugasPBO1;
public class Pelajar {
    private String NIP;
    private String Name;
    private String Is;
    private double TestScore1;
    private double TestScore2;
    private double TaskScore;

    Pelajar() {
        
    }

    public String getNip() {
        return NIP;
    }

    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getTestScore1() {
        return TestScore1;
    }

    public void setTestScore1(int TestScore1) {
        this.TestScore1 = TestScore1;
    }

    public double getTestScore2() {
        return TestScore2;
    }

    public void setTestScore2(int TestScore2) {
        this.TestScore2 = TestScore2;
    }

    public double getTaskScore() {
        return TaskScore;
    }

    public void setTaskScore(double TaskScore) {
        this.TaskScore = TaskScore;
    }
    
    public double FinalScore(){
        return (0.4*this.getTestScore1())+(0.4*this.getTestScore2())+
                (0.2*this.getTaskScore());
    }
    
    public String IsPassed(){
        if (this.FinalScore()>=60) {
            Is = "Passed";
        } else {
            Is = "Failed";
        }
        return Is;
    }

    public Pelajar(String NIP, String Name, double TestScore1, 
            double TestScore2, double TaskScore) {
        this.NIP = NIP;
        this.Name = Name;
        this.TestScore1 = TestScore1;
        this.TestScore2 = TestScore2;
        this.TaskScore = TaskScore;
        this.Is = Is;
    }
    
    
    public void Status(){
        System.out.println("-------------------------------------------------");
        System.out.println("----------========== REPORT ===========-----------");
        System.out.println("| NIP\t\t: " + this.getNip());
        System.out.println("| Name \t\t: " + this.getName());
        System.out.println("| Test Score 1\t: " + this.getTestScore1());
        System.out.println("| Test Score 2\t: " + this.getTestScore2());
        System.out.println("| Task Score\t: " + this.TaskScore);
        System.out.println("| Final Score\t: " + this.FinalScore());
        System.out.println("| Status\t: " + this.IsPassed());
        System.out.println("-------------------------------------------------");
    }
}   