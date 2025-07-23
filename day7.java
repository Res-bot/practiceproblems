public class day7 {
    public static void main(String[] args) {
        //sum of n natural numbers

        int n = 10;
        int sum = 0;
        for(int i=0; i<n+1; i++){
            sum += i;
        }
        System.out.println(sum);

        //sum of odd indices and even indices
        int[] arr1 = {10,20,30,40,50,60};
        int odd_sum = 0;
        int eve_sum = 0;

        int len = arr1.length;

        for(int i=0; i<len; i++){
            if(i%2 == 0){
                odd_sum += arr1[i];
            }
            else{
                eve_sum += arr1[i];
            }
        }
        System.out.println(odd_sum);
        System.out.println(eve_sum);


        //1030560
        int arr2[] = {1,0,3,0,5,6,0};
        int count1 = 0;
        for(int j = 0; j<arr2.length; j++){
            if(arr2[j] == 0){
                count1++;
            }
        }
        System.out.println(count1);

        //121324
        int arr3[] = {1,2,1,3,2,4};
        int store = 1;
        for(int k =0; k<arr3.length; k++){
            if(arr3[k] > store){
                continue;
            }
            else{
                System.out.println("The smallest element is: " + arr3[k]);
            }
        }
    }
    
}
