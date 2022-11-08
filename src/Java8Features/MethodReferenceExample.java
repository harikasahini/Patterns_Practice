package Java8Features;
   
interface defaultI {
       void display();
}
class derived_class{
 
    public void classMethod(){  
            System.out.println("used reference method");  
    }
}
public class MethodReferenceExample {
     public static void main(String[] args){
        derived_class obj1 = new derived_class();
        defaultI  ref = obj1::classMethod; 
        ref.display();
    }
}

