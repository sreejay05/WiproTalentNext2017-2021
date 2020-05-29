import java.util.Arrays;
public class Prog8{
public static void main(String[] args) {
        int arr[]= new int[]{10, 20, 10, 30, 40, 30, 30};
        int n = arr.length;
        Arrays.sort(arr);
        int max=1,count=1;
        int num=arr[0];
        for(int i=1;i<n;i++) {
            if (arr[i] == arr[i - 1])
                count++;
            else if (count > max) {
                max = count;
                num = arr[i - 1];
            }
            count = 1;
            if (count > max) {
                num = arr[n - 1];
            }
            System.out.println(num);
     }
}
}
