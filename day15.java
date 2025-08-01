import java.util.ArrayList;
import java.util.Scanner;

public class day15 {

    //program to create a menu driven program to insert , search, display, delete the elements of an ArrayList
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do{
            System.out.print("Array list operations:  \n");
            System.out.println("1.Insert \n");
            System.out.println("2.Search \n");
            System.out.println("3.Display \n");
            System.out.println("4.Delete \n");
            System.out.println("5.Exit \n");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the item you want to insert: ");
                    String insertStr = sc.nextLine();
                    list.add(insertStr);
                    System.out.println("item added successfully.");
                    break;
                
                case 2:
                    System.out.println("Enter the item you want to search: ");
                    String srchItem = sc.nextLine();
                    if(list.contains(srchItem)){
                        System.out.println("Item found in the list.");
                    }
                    else{
                        System.out.println("Item does not exist in the list.");
                    }
                    break;
                case 3:
                    for(String lis : list){
                        System.out.print(lis + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the item to delete: ");
                    String dltitem = sc.nextLine();
                    if(list.remove(dltitem)){
                        System.out.println("Item deleted successfully");
                    }else{
                        System.out.println("Item does not exist.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
            
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }while (choice != 5);
    }
    
}
