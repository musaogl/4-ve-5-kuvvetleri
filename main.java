import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Limit Sayıyı Giriniz :");
        n=input.nextInt();
        System.out.println("4.kuvvetleri :");
        for(int i=1;i<n;i*=4){
            System.out.println(i);
        }
        System.out.println("5.kuvvetleri :");
        for (int j=1;j<n;j*=5){
            System.out.println(j);
        }
    }
}
