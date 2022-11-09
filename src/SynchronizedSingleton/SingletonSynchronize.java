package SynchronizedSingleton;

public class SingletonSynchronize {
	   private static SingletonSynchronize instance = null;

	   private SingletonSynchronize() {}

	   public static synchronized SingletonSynchronize getInstance() {
	       if (instance == null) {
	           instance = new SingletonSynchronize();
	       }

	       return instance;
	   }
	   
	   public static void main(String[] args) {
		   SingletonSynchronize instance1=SingletonSynchronize.getInstance();
		   SingletonSynchronize instance2=SingletonSynchronize.getInstance();
		   
		   System.out.println(instance1.toString());
		   System.out.println(instance2.toString());
		   
	   }
	}


