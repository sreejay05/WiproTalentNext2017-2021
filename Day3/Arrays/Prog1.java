public class Prog1{
 public static void main(String [ ] args) { 
        int arr[]={4,3,7,10,15,10};
        int sum=0;
        float avg;
        for(int  i=0;i<arr.length;i++)
        {
            sum +=arr[i];
        }
        avg = (float)sum/arr.length;
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg);
    }

}
