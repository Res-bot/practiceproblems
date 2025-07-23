public class day4 {
    public static void main(String[] args) {

         //if the string is "RESHMA" then return the string which will have ascii value the length value more than the alphabet in the string.


        String str = "RESHMA IS A GOOD GIRL";
        char[] ch =  str.toCharArray();
        int len = ch.length;
        // System.out.println(len);

        for(int i = 0; i<len ; i++){

            if(ch[i] == ' '){
                continue;
            }

            ch[i] = (char) (ch[i] + 6);
            System.out.print(ch[i] + " ");
        }
        System.out.println();

        // program to move all the zeros of the array to the left
        int[] arr1 = {0,0,1,0,0,2,0,0,3,0,0,4,0,0,5};
        int arcap = arr1.length;

        int index = 0 ;
        for(int i=0; i<arcap; i++){
            if(arr1[i] != 0){
                arr1[index++] = arr1[i];
            }
        }

        while(index < arcap){
            arr1[index++] = 0;
        }

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]);
        }
        

    }
    
}
