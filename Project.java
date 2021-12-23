
public class Project {
    
    private String name;
    private String description; 
    private double intialCost;
    private String startUpCost;

    public Project(){
        this("Placeholder Project", "This is a test, and will be the default value if a description isn't given when creating an instance of this Project Class.", 0.00);
    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double cost){
        this.name = name;
        this.description = description;
        this.intialCost = cost;
    }
    
    public Project(String name, String description, String startUpCost){
        this.name = name;
        this.description = description;
        this.startUpCost = startUpCost;
    }
    
    // setter methods 
    public void setProjectName(String input){
        name = input;
    }
    public void setProjectDesc(String input){
        description = input;
    }
    public void setProjectCost(double input){
        intialCost = input;
    }
    public void setProjectStartUp(String input){
        startUpCost = inputl;
    }

    // getter methods
    public String getProjectName(){
        return name;
    }
    public String getProjectDescription(){
        return description;
    }
    public double getProjectInitialCost(){
        return intialCost;
    }
    public String getProjectStartUp(){
        return startUpCost;
    }


    public String elevatorPitch(){
        return "Project name " + "(" + intialCost + "): "  + name + "\nDescription: " + description;
    }

    // Overloaded elevatorPitch methods 
    public static void elevatorPitch(String name, String description, double intialCost){
        System.out.println("Project name " + "(" + intialCost + "): " + name + "\nDescription: " + description);
    }
    public static void elevatorPitch(String name, String description, String startUpCost){
        System.out.println("Project name " + "(" + startUpCost + "): " + name + "\nDescription: " + description);
    }



    public void projectMethod(Project altObject){
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(altObject));
    }

}
