//find out the avg from all odd indexed element from the given int array?
public class AvgOfOddIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        oddAvg(arr);
    }
    public static void oddAvg(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2!=0){
                sum  += arr[i];
                count++;
            }
        }
        double avg = (double) sum / count;

        System.out.println(avg);

    }
    
}
