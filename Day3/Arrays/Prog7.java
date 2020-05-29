public class Prog7 {

    public static void main(String[] args) {
        int arr[]={4,3,7,14,16,14};
        int n =arr.length;
        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
            System.out.println(arr[i]);
        }
    }
}
