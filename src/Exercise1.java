
public class Exercise1 {
    public static void main(String[] args) {
        Payment p1 = new Payment("Vanzuriak", "Olexander", 6000, 2020, 20, 30, 20, 30);
        System.out.println("Accrued amount " + p1.calculateAccruedAmount());
        System.out.println("Received amount " + p1.calculateReceivedAmount());
        System.out.println("Worked years " + p1.calculateWorkExperience());
    }
}
