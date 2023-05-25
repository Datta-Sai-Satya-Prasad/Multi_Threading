package pack_1;

import java.io.File;
import java.io.IOException;

public class Creating_File2 {

	public static void main(String[] args) {

        File file=new File("C:\\Users\\Administrator\\"+"Desktop\\datta\\textfile2.txt");
//        try {
//			System.out.println(file.createNewFile());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        if(file.canExecute()) {
        	System.out.println("file can be accessed");
        	System.out.println("size pf the file is "+file.length());
        }
        //canExecute():-This method is used to check weather the file is exist or not.
        //length():-This method is used to check weather the Size of the file.
	}

}
