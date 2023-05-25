package pack_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Wrting_in_a_File2 {

	public static void main(String[] args) throws FileNotFoundException {
          File file=new File("C:\\Users\\Administrator\\Desktop\\datta\\"+"notEmpty.txt");
          FileOutputStream stream=new FileOutputStream(file);
          try {
        	  stream.write(97);
        	  stream.close();
          }catch (IOException e){
        	  e.printStackTrace();
          }
	}
}
