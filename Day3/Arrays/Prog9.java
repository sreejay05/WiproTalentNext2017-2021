import java.util.*;
public class Prog9{
    public static void main(String[] args) {
        int f=0,m=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(int i=0;i<n;i++){
            if(ar[i]==6){
                for(int j=i+1;j<n;j++){
                    if(ar[j]==7){
                        f=1;
                        m=j;}}}
        }
        int sum=0;
        if(f==1) {
            for (int i = 0; i < n; i++) {
                if (ar[i] == 6) {
                    i=m;
                    continue;
                }
                sum += ar[i];
            }
        }
        else{
            for(int i=0;i<n;i++)
                sum +=ar[i];
        }
        System.out.println(sum);
    }
}
