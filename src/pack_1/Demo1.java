package pack_1;

class T1 extends Thread{
	public void start() {
		super.run();
		System.out.println("child class");
	}
}

public class Demo1 {
   public static void main(String[] args) {
	     T1 t=new T1();
	     t.start();
	     
      }
}
