import java.util.HashMap;
import java.util.Map;

public class d2Hashmap {
    public static void main(String[] args) {
        HashMap <String, Integer> hashMap = new HashMap<>();
        hashMap.put("John",15);
        hashMap.put("Jane",14);
        hashMap.put("Smith",10);
        hashMap.put("Bonnie",9);

        System.out.println(hashMap);
        System.out.println(hashMap.get("Jane"));
        hashMap.remove("Bonnie");
        System.out.println(hashMap.size());
        System.out.println(hashMap.containsKey("Bonnie"));


        //first contructor type: 
        //HashMap()

        //No need to mention the generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        //Here the generic type is mentioned again
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        //Adding elements using put method
        hm1.put(1, "one");
        hm1.put(2,"two");
        hm1.put(3,"three");

        hm2.put(4,"four");
        hm2.put(5, "five");
        hm2.put(6,"six");

        System.out.println("Mappings of Hashmap 1: " + hm1);
        System.out.println("Mappings of Hashmap 2: " + hm2);

        //second contructor type
        //Hashmap(int initialcapacity)
        HashMap<Integer,String> hm3 = new HashMap<>(2);

        hm3.put(7,"seven");
        hm3.put(8,"eight");
        hm3.put(9,"nine");

        System.out.println("the size of hashmap 3 is: " + hm3.size()); // the output getting for this is three which means that the hashmap can resize itself
        System.out.println(hm3);

        //traversal of java hashmap
        HashMap<String, Integer> hm4 = new HashMap<>();
        hm4.put("hydrogen", 1);
        hm4.put("Helium",2);
        hm4.put("lithium", 3);
        hm4.put("berilium", 4);
        hm4.put("boron",5);
        hm4.put("carbon",6);

        for(Map.Entry<String,Integer> e: hm4.entrySet()){
            System.out.println("Key: " + e.getKey()+ " , " + "Value: " + e.getValue());
        }

    

    }
}
