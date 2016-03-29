/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zifutongji;

/**
 *
 * @author lenovo
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class zifutongji {
	 public static void main(String[] args){
		 try {
			 	int n=0,m=0,d=0,f=0;
			 	int v=0;
	            Scanner in = new Scanner(new File("c:/B.txt"));
	            while (in.hasNextLine()) {
	                String str = in.nextLine();
	                for(int i=0;i<str.length();i++){
	                	 char b=str.charAt(i);
	                	 if((b>=97&&b<=122)||(b>=65&&b<=90))
	                	 {
	                		 v++;
	                		 if((i==str.length()-1))
	                		 {
	                			 m++;
	                			 v=0;
	                		 }
	                	 }
	                	 else
	                	 {
	                		 if(v>0)
	                		 {
	                			 m++;
	                			 v=0;
	                		 }
	                	 }
	                	   n=i+1;
	                }
	                n+=f;
	                d++;
	            }
	            System.out.println("字符数为："+n);
	            System.out.println("单词数为："+m);
	            System.out.println("行数为："+d);
	       } catch (FileNotFoundException e) {
	        	System.out.print("请把文件夹中的B.txt复制到C盘中");
	            //e.printStackTrace();
	        }

	 }
}
