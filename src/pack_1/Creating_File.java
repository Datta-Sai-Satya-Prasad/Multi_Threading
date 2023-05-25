package pack_1;

import java.io.File;
import java.io.IOException;
/*Creating File:- Give a file name with file extenction as a String argument from the constructor 
 * 
 * Step-2:-call create new file method from file class.
 * */
/*Create NewFile Method:- This method is from file class and it is  use to creaate a new file.
 * This method returns boolean value.true if the file is created
 * false if somthing want wrong or file already created.
 * */
public class Creating_File {

	public static void main(String[] args) {
          File file=new File("C:\\Users\\Administrator\\"+"Desktop\\datta\\textfile2.txt");
          try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
