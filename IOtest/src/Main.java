import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//写文件
//		try {
//			//追加写如文件
//			FileWriter fileWriter = new FileWriter("/Users/yuebinbin/test.txt", true);
//			fileWriter.write("test test test");
//			fileWriter.write("hahahahah");
//			fileWriter.write("sunyingying");
//			fileWriter.close();
//			System.out.println("finish");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			BufferedWriter bufferW = new BufferedWriter(new FileWriter("/Users/yuebinbin/test.txt", true));
//			bufferW.newLine();
//			bufferW.write("this is bufferedWriter");
//			bufferW.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		//读文件
		
		int c = 0;
		try {
			FileReader reader = new FileReader("/Users/yuebinbin/test.txt");
			c = reader.read();
			while(c != -1){
				System.out.println((char)c);
				c = reader.read();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String line;
		
		try {
			BufferedReader bufferR = new BufferedReader(new FileReader("/Users/yuebinbin/test.txt"));
			line = bufferR.readLine();
			while(line != null){
				System.out.println(line);
				line = bufferR.readLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
