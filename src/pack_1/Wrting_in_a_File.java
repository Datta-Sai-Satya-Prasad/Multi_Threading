package pack_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Wrting_in_a_File {

	public static void main(String[] args)throws IOException {
         File file=new File("C:\\Users\\Administrator\\Desktop\\datta\\"+"notEmpty.txt");
         FileWriter writer=new FileWriter(file);
         writer.write("a Them to do see");
         writer.close();
	}

}
