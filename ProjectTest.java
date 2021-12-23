import java.util.*;
import java.text.NumberFormat;

public class ProjectTest {
    
    public static void main(String[] args) {

        
        // --- Default Test ---
        Project placeholder = new Project();
        System.out.println(placeholder.elevatorPitch());
        System.out.println("-------------");

        // --- Test --- 
        Project test = new Project();
        // setter method call
        test.setProjectName("Test Project");
        test.setProjectDesc("Sample Test to confirm setter Methods work.");
        // getter method call
        String testName = test.getProjectName();
        String testDesc = test.getProjectDescription();
        // calling and printing elevatorPitch. 
        System.out.println(test.elevatorPitch());
        System.out.println("-------------");

        // --- Static method test --- 
        Project.elevatorPitch("Big Fish", "Fishing app for mobile phones", 100.00);
        System.out.println("-------------");

        // -- Number Format requires a string so I created an overloaded method for it to work.
        NumberFormat currency = NumberFormat.getCurrencyInstance(); 
        String price = currency.format(15000.91);
        Project.elevatorPitch("Food Truck", "Truck that can roll around to sell food", price);


        
    }
}
