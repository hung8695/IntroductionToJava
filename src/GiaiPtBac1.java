import java.util.Scanner;

public class GiaiPtBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b=sc.nextDouble();
        double x;
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else{
            System.out.println("Phuong trinh co nghiem duy nhat: "+(-b/a));
        }
    }
}
