public class day16 {

    public static void main(String[] args) {
        //program to find the password using a string 
        //input = "wipro technologies"
        //5+12 = 17 = 1+7 = 8 is the password write the code for this


        String str = "web development";
        String[] str1 = str.split(" ");
        int len = 0;
        for(String s : str1){
            len += s.length();
        }
        System.out.print(len);
        System.out.println();

        while(len>10){
            int sum = 0;
            while(len > 0){
                sum += len % 10;
                len /= 10;
            }
            len = sum;
            System.out.println(len);
        }
    }
}
