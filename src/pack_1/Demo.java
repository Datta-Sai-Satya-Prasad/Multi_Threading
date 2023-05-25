package pack_1;

class Mythread extends Thread{
	public void run(int j) {
		for(int i=1;i<=3;i++) {
			System.out.println("Child class");
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mythread t=new Mythread();
       t.start();
       for(int i=1;i<=3;i++) System.out.println("Main Child");
	}

}
