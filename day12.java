public class day12 {
    public static void main(String[] args) {
        //program to find the square of each number in the array
        int[] arr = {1,2,3,4,5,6,7};
        for(int i = 0; i<arr.length; i++){
            arr[i] *= arr[i];
            System.out.println(arr[i] + " ");
        }

        //program to find the minimum occured element in the given array
        int[] arr1 = {1,2,1,1,2,1,3};
        int len = arr1.length;
        int[] count = new int[len];
        boolean[] visited = new boolean[len];
        
        for(int i=0; i<len; i++){
            if(!visited[i]){
                count[i] = 1;
                for(int j=i+1; j<len; j++){
                    if(arr1[i] == arr1[j]){
                        count[i]++;
                        visited[j] = true;
                    }
                }
            }
        }

        //finding the minimum occuring element
        int minCount = Integer.MAX_VALUE;
        int minElement = -1;
        for(int i=1; i<len; i++){
            if(!visited[i] && count[i]<minCount){
                minCount = count[i];
                minElement = arr1[i];
            }
        }

        if(minElement != 1){
            System.out.println(minElement + " - " + minCount);
        }
        else{
            System.out.println("No unique min occuring element found");
        }



        //program to find the maximum occuring element in the given array
        int[] arr2 = {1,2,1,3,1,4};
        int le = arr2.length;
        int[] coun = new int[le];
        boolean[] visit = new boolean[le];

        for(int i = 0; i<le; i++){
            if(!visit[i]){
                coun[i] = 0 ;
                for(int j = i+1; j<le; j++){
                    if(arr2[i]==arr2[j]){
                        coun[i]++;
                        visit[j] = true;
                    }
                }
            }
        }

        int maxCoun = Integer.MIN_VALUE;
        int maxEle = -1;

        for(int i=0; i<le; i++){
            if(!visit[i] && coun[i]>maxCoun){
                maxCoun = coun[i];
                maxEle = arr2[i];
            }
        }

        if(maxEle != -1){
            System.out.println(maxEle +" - "+ maxCoun);
        }
    }
}
