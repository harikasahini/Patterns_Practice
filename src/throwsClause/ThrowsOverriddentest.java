package throwsClause;

public class ThrowsOverriddentest extends SuperRead{
	public static void main(String[] args) {
		ThrowsOverriddentest t=new ThrowsOverriddentest();
		t.methodOfSuperClass();
	}
	@Override
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
		SuperRead r1=new SuperRead();
		r1.methodOfSuperClass();
        System.out.println("Unchecked exceptions can be overriden");
        
    }
	
}

class SuperRead
{
    void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("super class method with unchecked exception");
    }
}


class SubRead extends SuperRead
{
    @Override
    void methodOfSuperClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("overriding with other Unchecked Exceptions");
    }
}

class SubReadTwo extends SuperRead
{
    @Override
    void methodOfSuperClass() throws IOException
    {
        //Generated Compile time error while overriding with checked exception
    }
}
