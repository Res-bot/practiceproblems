import java.util.Scanner;

public class day3pbl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean notFound = true;
        int eda=0, cda=0, kda=0, rda=0, mda=0, esal=0, csal=0, ksal=0, rsal=0, msal=0;
        System.out.print("Provide the employee number: ");
        int empno = sc.nextInt();
        int[] EmpNo = {1001,1002,1003,1004,1005,1006,1007};
        String[] EmpName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] Department = {"R&D", "PM", "Acct", "FrontDesk", "Engg", "Manufacturing", "PM"};
        String[] Designation = {"e","c","k","r","m","e","c"};
        int[] Basic = {20000,30000,10000,12000,50000,23000,29000};
        int[] HRA = {8000,12000,8000,6000,20000,9000,12000};
        int[] IT = {3000,9000,1000,2000,20000,4400,10000};
        String[] uniDes = {"e","c","k","r","m"}; 

        for(int k = 0; k<uniDes.length; k++){
            
            switch (uniDes[k]) {
                case "e":
                    eda = 20000;
                    break;
                case "c":
                    cda = 32000;
                    break;
                case "k":
                    kda = 12000;
                    break;
                case "r":
                    rda = 15000;
                    break;
                case "m":
                    mda = 40000;
                    break;
                default:
                    break;
            } 
        }

        for(int l=0; l<7; l++ ){
            if(Designation[l].equals("e")){
                esal = Basic[l] + HRA[l] + eda - IT[l];
            }
            else if(Designation[l].equals("c")){
                csal = Basic[l] + HRA[l] + cda - IT[l]; 
            }
            else if(Designation[l].equals("k")){
                ksal = Basic[l] + HRA[l] + kda - IT[l]; 
            }
            else if(Designation[l].equals("r")){
                rsal = Basic[l] + HRA[l] + rda - IT[l];   
            }
            else{
                msal = Basic[l] + HRA[l] + mda - IT[l]; 
            }
        }

        int[] Salary = {esal, csal, ksal, rsal, msal, esal, csal};
        
        while (notFound) {
            for(int i =0; i<EmpNo.length; i++){
                if(empno != EmpNo[i]){
                continue;
                }
                else{
                System.out.println(EmpNo[i] + " " + EmpName[i] +" " + Department[i] + " " + Designation[i] + " " + Salary[i]);
                notFound = false;
                }

            }
        }
        sc.close();
    }
}
