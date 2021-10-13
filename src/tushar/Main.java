package tushar;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("SIZE");
        int size= sc.nextInt();
        char a[]=new char[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("Value for "+i);
            a[i]= sc.next().charAt(0);
        }
        for(char i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }


    }
    }
