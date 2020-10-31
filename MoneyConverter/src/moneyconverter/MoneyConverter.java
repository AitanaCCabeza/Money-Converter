package moneyconverter;

import java.util.Scanner;

public class MoneyConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put the quantity in euros: ");
        double value=input.nextDouble();
        
        System.out.println("Put the other system to convert: ");
        System.out.println("*Euros* *Dollar* *Pounds* *Won* *Yen* *ArgPesos*");
        
        String election=input.next();
        
        double euro= 1;
        double dollar=1.18;
        double pounds=0.91;
        double won=1353.03;
        double yen=124.98;
        double ArgPesos=91.23;
        
        double result;
        
        switch(election){
            
            case "Euros":
                    
                result = value*euro;
                System.out.println("The value of the convert is: " + result);
                break;
                
            case "Dollar":
                
                result = value*dollar;
                System.out.println("The value of the convert is: " + result);
                break;
                    
            case "Pounds":
                
                result = value*pounds;
                System.out.println("The value of the convert is: " + result);
                break;
                    
            case "Won":
                
                result = value*won;
                System.out.println("The value of the convert is: " + result);
                break; 
                    
            case "Yen":
                
                result = value*yen;
                System.out.println("The value of the convert is: " + result);
                break;
                    
            case "ArgPesos":
                
                result = value*ArgPesos;
                System.out.println("The value of the convert is: " + result);
                break;  
                    
            default:
                System.out.println("Not exists");
                break;
        }
        
        
    }   

    
}
