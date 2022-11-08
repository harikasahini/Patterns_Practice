package ThreadCreation;

public class ThreadRunnableDriver{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnable t1=new ThreadRunnable();
		
		Thread tr1=new Thread(t1);
		tr1.start();
		
		ThreadExtended tr2=new ThreadExtended();
		tr2.start();
	}


}

