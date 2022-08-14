package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			
			fos.write(68);
			fos.write(69);
			fos.write(67);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");

	}

}
