import java.util.Scanner;
public class VendingMachine
{ 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Liquid Bottles = new Liquid();
        int f = 0;
        int l = 0;
        
 
        while (f != 6)
        {
            System.out.println("1 - Display current Inventory");
            System.out.println("2 - Display current Monetary values");
            System.out.println("3 - Exit");
            f = Integer.parseInt(scan.nextLine());  
            if (f == 1)
            {
                System.out.println("Item    Price (Dollars)    Quantity");      
                for( int t = 0; t < 3; t++ ) 
                    {
                    System.out.println(Bottles.Drinks[t][0] + "    " + Bottles.Drinks[t][1] + "         " + Bottles.Qnty[t]);  
                    }
                System.out.println("1 - Purcase a Pepsi");
                l = Integer.parseInt(scan.nextLine());              
                Bottles.Qnty[l]--;                           
            }
        }
    }    
}
