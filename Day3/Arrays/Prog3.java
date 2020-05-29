import java.util.Scanner;
public class Prog3{

    public static void main(String[] args) {
        int arr[]={5,10,15,20,25,30};
        Scanner s = new Scanner(System.in);
        int search = s.nextInt();
        int f=0;
        for(int  i=0;i<arr.length;i++) {
            if (arr[i]==search) {
                System.out.println(i);
                f = 1;
                break;
            }
        }
        if(f==0){
            System.out.println(-1);
        }
    }
}
