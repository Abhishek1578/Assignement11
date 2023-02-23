package filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filereaderdemo {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\eclipsprogram\\filehandling\\abhi.txt");//create a file
		Scanner reader = new Scanner(file);//Scan the file
		while(reader.hasNext()) {			//read the file till there is no text
			String str=reader.next();
			if(str.length()>5) { //to check lenth of word
				System.out.println(str);  //prin it 
			}
		}

	}

}
