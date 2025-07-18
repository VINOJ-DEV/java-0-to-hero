// Class is a blueprint or template for creating the objects, it defines structure and behavior of the object
// memory is allocated only when Object is created from the Class

// Objects are instances of the Class , created to use Attributes and methods of the Class

// root(i.e main) class must be default private or use "public" as key word , NO other type can be used
//  class oops is public, should be declared in a file named oops.java , so change to ninteen

public class ninteen{
    int learnt = 90;
    String skill = "on process";
    
    public static void main(String args[])
    {
        // creating object (instance)
        ninteen vinoj =  new ninteen();
        System.out.println(vinoj.learnt);

        ninteen harish = new ninteen();
        System.out.println(harish.skill);
    }
}