package top.xzit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class day01 {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(new 
				FileInputStream("a.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(new 
				FileOutputStream("b.txt"));
		int ch=0;
		while((ch=isr.read())!=-1) {
			osw.write(ch);
		}
		
		isr.close();
		osw.close();
		
	}
}
