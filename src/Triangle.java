import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c");
        int c = Integer.parseInt(scanner.nextLine());
        try {
            if (a<0||b<0||c<0||a+b<c||a+c<b||b+c<a){
                throw new IllegalTriangleException();
            }else {
                System.out.println("abc là tam giác");
            }
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
