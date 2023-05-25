package pack_1;

import java.io.File;
/*File Handling- the process of creating,updating,delecting file using java program is knowing as file handling.
 * File Handling also includes reading from a file and writing a file.
 * File is class from java.io package.
 * To create a folder in a specified location we need to provide location followed by "\\folder name" as a string argument to the constructor of file.
 * After this we need to call mkdir() method from file class.
 * 
 * */

public class Creating_Folder {

	public static void main(String[] args) {
        File file=new File("C:\\Users\\Administrator\\Desktop\\datta");
        System.out.println(file.mkdir());
        /*mkdir():-It is a non Static method from file class which is use to create a folder of boolean value true if folder is created flase if folder is already exist
         * */
	}
}
