package Java8Features;
   
interface interfaceWithDefaultMethod {
     default void default_method(){
         System.out.println("Inside default method in interface");
    }
}
class exampleClass implements interfaceWithDefaultMethod{
 
}
public class DefaultmethodsInterface {

   public static void main(String[] args){
	   exampleClass I1 = new exampleClass();
	   I1.default_method();
    }
}


