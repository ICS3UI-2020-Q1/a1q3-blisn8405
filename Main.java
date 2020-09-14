import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  // create a Scanner for user input
  Scanner input = new Scanner(System.in);
    
   
    //initialize a number that needs to be added to another number

        // declare a variable for chromebook chargers
  double chromebookCharger = (34.99*3);

  // declare a variable for motherboards
  double motherboards = (127.5*2);

//declare a variable for mouses
  double mouse = (18*5);

// declare and initialize the total cost 
 System.out.println("The answer is " + (chromebookCharger + motherboards + mouse));

 // declare and initialize the tax
 System.out.println("The tax is " + (chromebookCharger + motherboards + mouse)*.13);
 
double total = (chromebookCharger + motherboards + mouse) + (chromebookCharger + motherboards + mouse)*.13;

// the total with tax
 System.out.println("The total is " + total);
  }
}
