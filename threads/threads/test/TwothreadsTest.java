package threads.test;

public class TwothreadsTest {

	public static void main(String args[]) {
		new SimpleThread("Jamaica").start();
		new SimpleThread("fiji").start();
		new SimpleThread("Marrakesh").start();
	}
}
