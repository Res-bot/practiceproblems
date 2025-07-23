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

        //program to rotate an array
        int[] arr3 = {5,6,7,8,9};
        int ele = arr3[0];
        int lnth = arr3.length;
        System.out.println("Array before rotation: ");
        for(int i=0; i<lnth; i++){
            System.out.print(arr3[i]);
        }
        System.out.println();
        for(int i=0; i<lnth-1; i++){
            arr3[i] = arr3[i+1];
        }
        arr3[lnth-1] = ele;

        System.out.println("Array after rotation: ");
        for(int i=0; i<lnth; i++){
            System.out.print(arr3[i]);
        }
        System.out.println();

        //program to turn the uppercase characters to lowercase and the lowercase characters to uppercase

        String str = "ThiRuVANantHApURAm";
        char[] strch = str.toCharArray();

        for(int i=0; i<strch.length ; i++){
            if(strch[i] >= 'A' && strch[i]<='Z'){
                strch[i] = Character.toLowerCase(strch[i]);
            }
            else{
                strch[i] = Character.toUpperCase(strch[i]);
            }
        }
        System.out.println(strch);

        

    }
    
}
