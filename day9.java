import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {

        //program to find the largest smallest smallest number in a given array
        int[] arr4 = {1,2,1,3,2,4};
        int largest = arr4[0];
        int smallest = arr4[0];
        int seclarge = arr4[0];
        int secsmall = arr4[0];
        int len = arr4.length;
       // System.out.println(len);
        for(int i=1; i<len; i++){
            if(arr4[i] > largest){
                seclarge = largest;
                largest = arr4[i];
            }
            if(arr4[i]<smallest){
                secsmall = smallest;
                smallest = arr4[i];

            }else if (arr4[i] < secsmall && arr4[i] != smallest){
                secsmall = arr4[i];
            }
        }
        System.out.println("the largest number in an array is: " + largest);
        System.out.println("the largest number in an array is: " + smallest);
        System.out.println("the second largest number in the array is: " + seclarge);
        System.out.println("the second smallest number in the array is: " + secsmall);


        //program to convert 0 to -1 nd -1 to 0

        int[] arr5 = {0, 2, -1, 0, 2, -1, 3};
        for(int i=0; i<arr5.length; i++){
            if(arr5[i] == 0){
                arr5[i] = -1;
            }
            else if(arr5[i] == -1){
                arr5[i] = 0;
            }
        }
        System.out.println("the updated array is: ");
        for(int i=0; i<arr5.length; i++){
            System.out.print(arr5[i] + " ");
        }

        //program to print the sum of two digits of a number upto only first place

        int[] arr6 = {23,55,57,93,10,1};
        int rem1 = 0;
        int rem2 = 0 ;
        int res = 0;
        for(int i=0; i<arr6.length; i++){
            rem1 = arr6[i] % 10;
            rem2 = rem1 / 10;
            res = rem1 + rem2;
        }
        System.out.println(res);




        
        //program to take the values from the user and insert them into an array if they are even
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for(int i =0; i<5; i++){
            System.out.print("Provide the elements of an array: ");
            int ele = sc.nextInt();
            boolean isOdd = true;
            if(ele % 2 != 0){
                System.out.println("Enter an even integer");
                while(isOdd){
                    int ele1= sc.nextInt();
                    if(ele1 % 2 == 0){
                        array[i] = ele1;
                        isOdd = false;
                    }
                }    
            }
            else{
                array[i] = ele;
            }
        }
        System.out.println("The array is: ");
        for(int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

    }
}
