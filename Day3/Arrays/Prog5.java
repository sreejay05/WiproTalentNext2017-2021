public class Prog5{

    public static void main(String[] args) {
        int arr[]={7,56,43,25,17};
        int min,max;
        max=min=arr[0];
        for(int  i=0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        int max2,min2;
        max2=min2=arr[0];
        for(int  i=0;i<arr.length;i++) {
            if (arr[i] < min2 && arr[i]!=min) {
                min2 = arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println("First smallest number = "+min);
        System.out.println("Second smallest number = "+min2);
        System.out.println("First largest number = "+max);
        System.out.println("Second largest number = "+max2);
    }

}
