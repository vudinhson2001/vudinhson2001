import java.util.Scanner;

public class baitap_md2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Can Nang Cua ban (Kg) ");
        weight = scanner.nextDouble();
        System.out.println("Chieu Cao Cua Ban(M) ");
        height = scanner.nextDouble();
        bmi = weight / (height * height);
        System.out.printf("%-20s%S", "bmi", "Interpretation\n");
        if (bmi < 18)
        System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
