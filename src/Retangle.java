import java.util.Scanner;

public class Retangle {
    public static void main(String[] args) {
        float  width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        width=sc.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        height=sc.nextFloat();
        float area = width*height;
        System.out.println("Area = "+ area);

    }
}
