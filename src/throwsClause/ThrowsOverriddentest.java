package throwsClause;

import java.io.IOException;

public class ThrowsOverriddentest{
	public static void main(String[] args) {
		ThrowsOverriddentest t=new ThrowsOverriddentest();
		t.methodOfClass();
	}
	
	
	void methodOfClass() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("super class method with unchecked exception");
    }
	
}



class SubRead extends ThrowsOverriddentest
{
    @Override
    void methodOfClass() throws NumberFormatException, NullPointerException, RuntimeException
    {
        System.out.println("overriding with other Unchecked Exceptions");
    }
}

class SubReadTwo extends ThrowsOverriddentest
{
	//throws error
    @Override
    void methodOfClass() throws IOException
    {
        //Generated Compile time error while overriding with checked exception
    }
}
