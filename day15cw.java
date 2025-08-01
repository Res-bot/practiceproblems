public class day15cw{
    public static void main(String[] args) {
        //WORLD WIDE WEB
        String str = "world wide web";
        String str1 = str.toUpperCase();
        String[] words = str1.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word: words){
            int len = word.length();
            int sum = 0;
            for(int i=0; i<len/2; i++){
                int left = word.charAt(i)-'A'+1;
                int right = word.charAt(len-1-i)-'A'+1;
                sum += Math.abs(left-right);
            }
            if(len % 2 == 1){
                int middle = word.charAt(len/2)-'A'+1;
                sum += middle;
            }
            result.append(sum);
        }
        System.out.println(result);
    }
}