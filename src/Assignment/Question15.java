package Assignment;

import java.io.*;
import java.util.*;

public class Question15 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1=new File("File1");
		File f2=new File("File2");
		File fout=new File("Output");
		
		BufferedReader br1=new BufferedReader(new FileReader(f1));
		BufferedReader br2=new BufferedReader(new FileReader(f2));
		BufferedWriter bw=new BufferedWriter(new FileWriter(fout));
		
		String str1=br1.readLine();
		List<String> list=new ArrayList<String>();
		
		while(str1!=null) {
			list.add(str1);
			str1=br1.readLine();
		}
		
		String str2=br2.readLine();
		
		List<String> list1=new ArrayList<String>();
		
		while(str2!=null) {
			list1.add(str2);
			str2=br2.readLine();
		}
		
		int i=0,j=0;
		int s1=list.size();
		int s2=list1.size();
		
		StringBuilder sb=new StringBuilder();
		
		while(i<s1 && j<s2) {
			sb.append(list.get(i++)+"\n");
			sb.append(list1.get(j++)+"\n");
		}
		
		if(j>=s2) {
			while(i<s1)
			{
				sb.append(list.get(i++)+"\n");
			}
		}
		if(i>=s1) {
			while(j<s2)
			{
				sb.append(list1.get(j++)+"\n");
			}
		}
		
		bw.append(sb);
		br1.close();
		br2.close();
		bw.close();
	}
}