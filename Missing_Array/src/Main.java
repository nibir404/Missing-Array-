public class Main {
    public static void main(String[] args) {
        int arr[] = {2,8,3,4,6,1,7,};
        int n = arr.length+1;

        int sum = (n *(n+1))/2;

        for (int i =0 ; i<arr.length ; i++){
            sum = sum - arr[i];
        }
        System.out.println(sum);
    }
}
