
package sess03;

/**
 * 
 * @author vkoech
 */
public class EvenNumbersContinue {
    public static void main(String[] args){
        //Variable to be used in the program
        int num = 20;
        System.out.println("The even number between 20 to 50 are:");
        
        for(;num <= 50; num++){
            if(num % 2 == 1)
                continue;
            System.out.printf("%d\n", num);
        }
    }
}
