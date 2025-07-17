import java.util.HashMap;
import java.util.Map;

public class day2 {
    public static void main(String[] args) {

        //count the number of even numbers in an array

        int[] arr1 = {50,58,56,53,54,57,59,51,52};
        int count = 0;

        System.out.println("the given array: ");
        for (int c = 0; c <= arr1.length - 1; c++) {
            System.out.print(arr1[c] + " ");
        }
        System.out.println();

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] % 2 == 0){
                count++;
            }
        }

        System.out.println("The number of even numbers in the array are: " + count);


        //count the occurences of each number inside an array

        int[] arr2 = {10,100,101,10,120,160,140,10,10,180,180,190,160,120,101,109,103,120,105,106,110,160,106,108,180,170,107,170};

        System.out.println("the given array: ");
        for (int c = 0; c <= arr2.length - 1; c++) {
            System.out.print(arr2[c] + " ");
        }
        System.out.println();

        int n = arr2.length;

        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(visited[i]) continue;

            int count1 = 1;
            for(int j = i+1; j<n; j++){
                if(arr2[i] == arr2[j]){
                    count1 ++;
                    visited[j] = true;
                }
            }
            System.out.println(arr2[i] + " occured " + count1 + " number of times in the array.");
        }
        System.out.println();


        //Solving the above problem using hashmap

        System.out.println("Counting the frequencies of the array using hashmap: ");

        for (int c = 0; c <= arr2.length - 1; c++) {
            System.out.print(arr2[c] + " ");
        }
        System.out.println();

        //creating a hashmap to store the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();

        //counting occurences
        for(int num: arr2){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        System.out.println("Occurences of each number: ");

        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue() + "times");
        }

        
    }
    
}
