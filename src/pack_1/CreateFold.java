package pack_1;

import java.io.File;
import java.io.IOException;

public class CreateFold {

	public static void main(String[] args) throws IOException {
          File f=new File("C:\\Users\\Administrator\\Desktop\\Eclipse.lnk");
          System.out.println(f.mkdir());//false
          System.out.println(f.canExecute());//true
          System.out.println(f.createNewFile());//false
	}

}
