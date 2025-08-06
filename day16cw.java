public class day16cw {

    // public boolean Pal(String s){
        


    // }

    public static void main(String[] arg){
        String str = "please keep quite after a duration of three hours.";
        String[] str1 = str.split(" ");
        int count = 0;
        for(int i=0; i<str1.length; i++){
            System.out.println(str1[i]);
            count++;
        }
        System.out.println(count);
        System.out.println();

        // String s = "RESHMA";
        // String[] st = s.split(" ");
        // for(int i = st.length; i<=0; i++){
        //     System.out.println(st[i]);
        // }

        //frequency count 
        String s = "RAMANA";
        String[] st = s.split("");
        int countt = 0;
        for(int i=0; i<st.length; i++){
            if(st[i].equals("A")){
                countt++;
            }
        }
        System.out.println(countt);


        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                System.out.print(st[j]);
            }
            System.out.println();
        }

        String strr = "please keep quite after a duration of three hours.";
    }
    }