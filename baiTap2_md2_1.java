import java.util.Scanner;

public class baiTap2_md2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so : ");
        int number = sc.nextInt();
        if(number<2){
            System.out.println(number+" khong phai so nguyen");
        }else{
            int i=2;
            boolean check=true;
            while(i<number){
                if (number %i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number+ " la so nguyen ");
            else
                System.out.println(number+ "  khong phai so nguyen");
        }
    }
}
