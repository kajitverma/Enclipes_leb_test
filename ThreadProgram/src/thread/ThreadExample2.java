package thread;

public class ThreadExample2 {
	public ThreadExample2( String name)
	{
		super ();
	}
	public void run()
	{
		System.out.println("Thred Start");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample2 te = new ThreadExample2("My Thread");
		te.Start();
		System.out.println("te.getName()");
	}
	private void Start() {
		// TODO Auto-generated method stub
		
	}

}
