package top.xzit;
//第一次写集合到文件程序
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class day01 {
	public static void main(String[] args) throws IOException{
		ArrayList<String> array = new ArrayList<String>();
		array.add("hello");
		array.add("world");
		array.add("java");
		
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("a.txt"));
		for(String s : array) {
			bw.write(s);
			bw.newLine();
			bw.flush();//著名的bw三连
		}
		bw.close();
	}
}
