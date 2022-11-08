package Java8Features;

public class SingletonClass {

    // Using a private static variable to store the instance.
    private static SingletonClass one_instance = null;
  
    // Declaring a variable of type String
    public String s;
  
    // Making the constructor private
    private SingletonClass()
    {
        s = "I belong to Singleton class";
    }
  
    // Static method
    // Static method to create instance of Singleton class
    public static SingletonClass getInstance()
    {
        if (one_instance == null)
        	one_instance = new SingletonClass();
        return one_instance;
    }
    
}
