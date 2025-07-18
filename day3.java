public class day3 {

    //Usage of String builder class
    public static void main(String[] args) {
        //Creating a new StringBuilder with the initial content "GEEKS FOR GEEKS"

        StringBuilder sb = new StringBuilder("Damon Salvatore");
        System.out.println("Initial Stringbuilder : " + sb);

        sb.append(" is awesome ! ");
        System.out.println("After appending: " + sb);

        //Creating a string using string builder constructor 

        StringBuilder sb1 = new StringBuilder("Stefan Salvatore");
        String str = sb1.toString();
        System.out.println(sb1);
        System.out.println(str);

        //applying different methods of StringBuilder 
        //in order to manipulate the string "ram#123" to "123#ram"

        StringBuilder sb2 = new StringBuilder("ram#123");
        System.out.println(sb2.substring(4,7) + sb2.substring(3,4) + sb2.substring(0,3));


    }
    
}
