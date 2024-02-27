package calc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class FileDemo
{
	public void create()
	{
		File f=new File("D:/intern.txt");
		try
		{
		if(f.exists())
		{
			System.out.println("File Name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("Length: "+f.length());
		}
		else if(f.createNewFile())
			System.out.println("File Created with the name: " +f.getName());
		else
			System.out.println("File is not created");
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class FileHandling {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("D:/intern.txt");
		fw.write("Welcome");
		System.out.println("Written to a file");
		//fw.flush();
		fw.close();
		FileReader fr=new FileReader("D:/student.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.println((char)i);
		}
		fr.close();
	}

}
