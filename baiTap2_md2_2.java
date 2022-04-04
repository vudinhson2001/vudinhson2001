import java.util.Scanner;

public class baiTap2_md2_2 {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double laiSuat = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien : ");
        tien = sc.nextDouble();
        System.out.println("nhap so thang gui");
        thang = sc.nextInt();
        System.out.println("nhap lai suat");
        laiSuat = sc.nextDouble();
        double tongSoTienLai = 0;
        for (int i = 0; i < thang; i++) {
            tongSoTienLai += tien * (laiSuat / 100) / 12 * thang;
        }
        System.out.println("Tong Tien Lai: " + tongSoTienLai);
    }

}
