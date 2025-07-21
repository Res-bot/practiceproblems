public class day6 {
    public static void main(String[] args) {
        //program to find the length of a string

        String str1 = "RESHMA";
        System.out.print(str1.length());
        System.out.println();

        //program to reverse a string

        StringBuilder strrev = new StringBuilder(str1);
        String strre = strrev.reverse().toString();
        System.out.println(strre);

        //progra mto check if a string is a palindrome

        String str2 = "RaCeCaR";
        StringBuilder strpal = new StringBuilder(str2);
        String strpa = strpal.reverse().toString();
        if(str2.toLowerCase().equals(strpa.toLowerCase())){
            System.out.println(str2 + " is a palindrome");
        }
        else{
            System.out.println(str2 + " is not a palindrome");
        }

        //program to count the vowels and consonants in a string
        String str3 = "AN APPLE EVERY DAY keeps the doctor away.";
        char[] str3ch = str3.toCharArray();
        char[] vowchar = {'a','A','e','E','i','o','O','u','U'};
        System.out.println(str3ch);
        int vow = 0;
        int cons = 0;
        for(int i=0; i<str3ch.length; i++){
            for(int j=0; j<vowchar.length; j++){
                if(str3ch[i] == vowchar[j]){
                    vow++;
                }
            }

        }
        cons = str3ch.length - vow;
        System.out.print("there are total " + vow + " vowels in the string \n there are " + cons + " consonants in the string.");
        System.out.println();


        //program to remove spaces from a string
        String str4 = "                         THIS STRING CONTAINS A LOT OF SPAAAAAAAAAAAAAAAAAAAAces                        ";

        System.out.println(str4.trim());

        //to count the occurence of a character

        String str5 = "she sells sea shells on the sea shore, betty bought some bitter butter but adding suger to the bitter butter made betty's bitter butter better";

        char[] str5ch = str5.toCharArray();

        int n = str5ch.length;

        boolean[] visited = new boolean[n];

        for(int l=0; l<n; l++){
            if(visited[l] || str5ch[l] == ' ') continue;

            int count = 1;
            for(int k=l+1; k<n; k++){
                if(str5ch[l]==str5ch[k]){
                    count++;
                    visited[k] = true;
                }
            }
            System.out.println(str5ch[l] + " occured " + count + " times in the string.");
        }

        System.out.println();
    }
}
