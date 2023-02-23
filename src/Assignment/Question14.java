package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Question14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("abc");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String str=br.readLine();
		int count=0;
		StringTokenizer tokens;
		while(str!=null) {
			tokens=new StringTokenizer(str);
			count=count+tokens.countTokens();
			str=br.readLine();
		}
		System.out.println(count);
		br.close();

	}

}
