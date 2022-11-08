package ThreadTwice;

public class ThreadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTwicetester t1=new ThreadTwicetester();
		try {	
		t1.start();
		//Starting thread again
		t1.start();
		}
		finally {
			t1.interrupt();
		}

	}

}
