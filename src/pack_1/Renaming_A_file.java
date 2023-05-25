package pack_1;

import java.io.File;

public class Renaming_A_file {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Administrator\\"+"Desktop\\datta\\textfile.txt");
		if(file.canExecute()) {
			File file2=new File("C:\\Users\\Administrator\\"+"Desktop\\datta\\textfile1.txt");
			System.out.println(file.renameTo(file2));
		}
	}

}
