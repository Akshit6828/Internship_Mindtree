
/*
Encapulation is the process of hiding the implementation details of a class.
Uses:
1)  Setting the constrain on input, so that user only fills the valid input.
2) Changing the access modifier of the variables at the place where it is initialized / implemented and NOT changing at every place it is used.
3) To provide READ-ONLY and WRITE-ONLY access to data of a class by Adding/ Deleting the Getters and Setters and making the things private.
*/ 
public class Encapsulation {
    public static void main(String[] args) {
    plant Rose = new plant();
    Rose.setColor("Red");
    Rose.setType("Rose");
    Rose.setHasFlowers(true);
    Rose.setHeight(20);
    
    // Creating second object for testing the getters and setters.
    plant Tulip = new plant();
    Tulip.setColor("Yellow");
    Tulip.setType("Tulip");
    Tulip.setHasFlowers(false);
    Tulip.setHeight(10);

    // Checking the getters and setters of both objects.
    System.out.println("ROSE OBJECT DETAILS\n");
    System.out.println("Type  = " +Rose.getType() + "\nColor  = " + Rose.getColor() + "\nHeight = " + Rose.getHeight() + "\nHas flower = " + Rose.getHasFlowers() + "\n"); 
    System.out.println("TULIP OBJECT DETAILS\n");
    System.out.println("Type  = " +Tulip.getType() + "\nColor  = " + Tulip.getColor() + "\nHeight = " + Tulip.getHeight() + "\nHas flower = " + Tulip.getHasFlowers()); 
    }    
}


class plant{
    private int height;
    private String type;
    // USE 2: Changing the type of variable without even changing its type in 'Encapsulation' class (where used deals with the input).
    // From (int) color --> (Color) color
    private Color color;
    private boolean hasFlowers;

    public int getHeight() {
        return this.height;
    }

    // Use 1: Setting constrain on input to check the validity.
    public void setHeight(int height) {
        if(height < 100){
            this.height = height;
        }
        else{
            System.out.println("Height is too high");
        }
    }

    public String getType() {
        return type;
    }

    // Use: 3) Deleting this would only allow us to read the data.
    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {

        /*
        OLDER CODE --------------------------------------------------
        'name' is accessible as it isnt private.
        ------------------------------------------------------------
        */
        // return color.name;

        /* NEW MODIFIED CODE with Getters and Setters*/
        return color.getName(); // Syntax: ClassVariableName.attribute
    }

    public void setColor(String passedInColorName) {
        
        Color obj = new Color(); // Creating object for new type
        /*
        OLDER CODE: -------------------------------------------------------------------------------------------
        Modifying new value from object of 'Color' class here only as the attributes 'name' and 'id' of class 'Color' as they were public.
        Once they are private, they can't be accessed from outside the class. As obj.name and obj.id would create error.
        */

        // obj.name = passedInColorName;
        // obj.id = 12;
        /* Assigning the object to the class variable */
        // this.color = obj;  // Updating the new value to the class variable of 'Color' class.
        
        // -------------------------------------------------------------------------------------------------
        
        /* New Modified code with use of getters and setters.*/
        obj.setName(passedInColorName);
        obj.setId(12);
        color = obj;  // Reassing the object to the current class variable so that it could be accessed by getters method via that instanteous calling object.

        /* NOTE: We cant do here something like:
        obj.setName(passedInColorName);
        obj.setId(12);

        in order to avoid 'color = obj' as it would access the methods 'setName' and 'setId' of the object 'color' which is null currently.
        */
    }

    public boolean getHasFlowers() {
        return hasFlowers;
    }

    public void setHasFlowers(boolean hasFlowers) {
        this.hasFlowers = hasFlowers;
    }

}


class Color {

    // Here changing the modifier to 'private' and in the above class 'obj.name' and 'obj.id' becomes inaccessible.
    // Thus rather providing getters and setters can help us to access these members.
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}