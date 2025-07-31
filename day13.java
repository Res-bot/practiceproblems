public class day13{

    //program to find alternate prime numbers
    public static boolean isPrime(int num){
        if(num <= 1) return false;

        for(int i = 2; i<num/2; i++){
            if(num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
         
        int count = 0;
        for(int i=1; i<=10; i++){
            if(isPrime(i)){
                if(count % i == 0){
                    System.out.println(i + " ");
                }
                count++;
            }
        }
    }
}
