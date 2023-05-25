package pack_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading_From_A_File3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File file=new File("C:\\Users\\Administrator\\Desktop\\datta\\"+"notEmpty.txt");
	        if(file.canExecute())
	        {
	        	try {
	        		BufferedReader reader=new BufferedReader(new FileReader(file));
	        		System.out.println(reader.readLine());
	        	}catch(IOException e) {
	        		e.printStackTrace();
	        	}
	        }

	}

}
