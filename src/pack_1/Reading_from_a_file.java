package pack_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Reading_from_a_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file=new File("C:\\Users\\Administrator\\Desktop\\datta\\"+"notEmpty.txt");
        if(file.canExecute())
        {
//        	try {
//        		FileReader fileReader=new FileReader(file);
//        	//	int i=fileReader.read();
//           // 	System.out.println((char)i);
//        		/*int i=0;
//        		while(true) {
//        			i=fileReader.read();
//        			System.out.println((char)i);
//        			if(i==-1) break;
//        		}*/
//        		int i=0;
//        		while((i=fileReader.read())!=-1)
//        			System.out.println((char)i);
//        	
//        	}catch (IOException e){
//        		e.printStackTrace();
//        	}
//     ***************Another Method to read**************
        	try {
        		FileInputStream stream=new FileInputStream(file);
        		int i=0;
        		while((i=stream.read())!=-1)
        			System.out.println((char)i);
        	}catch (IOException e){
        		e.printStackTrace();
        	}
        }
	}

}
