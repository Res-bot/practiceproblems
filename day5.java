public class day5 {
    public static void main(String[] args) {
        //program to move all the zeros to the end of the array

        int[] arr1 = {0,0,2,0,0,3,0,0,4,0,0,5,0,0,6,0,0,7,0,0,0,8,0,0,0,0,9};

        System.out.println("Array before placing the zeros at last: ");
        for(int j=0; j<arr1.length; j++){
            System.out.print(arr1[j]);
        }
        System.out.println();

        int index =0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != 0){
                arr1[index++] = arr1[i];
            }
        }

        while(index< arr1.length){
            arr1[index++] = 0;
        }

        System.out.println("Array after placing the zeros at the end: ");
        for(int k =0 ; k<arr1.length; k++){
            System.out.print(arr1[k]);
        }

        
    }
    
}
