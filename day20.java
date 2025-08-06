public class day20 {
    public static void main(String[] args) {
        String s1 = "1234";
		String s2="56";
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		System.out.println(num1+num2);


        //programe to take the original array and return a new array which will have the sum of the value present in an index and that value which is present in the succeeding index
        //eg: input array: [2,5,1,7,9,3]
        //output array: [7,6,8,16,12,3]

        int[] arr1 = {2,5,1,7,9,3};
        int lastind = arr1[arr1.length - 1];
        int n = arr1.length;
        int sum = 0;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                sum = arr1[j] + arr1[i];
            }
            System.out.print(sum);
        }
        System.out.println(lastind);

        

    }
}
