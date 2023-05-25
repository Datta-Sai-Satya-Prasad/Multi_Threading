package pack_1;

class A{
	public synchronized void d1(B b) {
		System.out.println("d1 method from A class");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException w) {}
		System.out.println("A class is calling B class last method");
		b.last();
	}
	public synchronized void last() {
		System.out.println("A last method");
	}
}
class B{
	public void d2(A a) {
		System.out.println("d2 method from B class");
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException w) {}
		System.out.println("B class is calling A class last method");
		a.last();
	}
	public void last() {
		System.out.println("B last method");
	}
}
class MyThreadsa extends Thread{
	A a=new A();
	B b=new B();
	 public void m1() {
		 this.start();
		 a.d1(b);
	 }
	 public void run() {
		 b.d2(a);
	 } 
	
}
public class Demo3 {

  public static void main(String[] args) {
	  MyThreadsa t=new MyThreadsa();
	t.m1();
}
}