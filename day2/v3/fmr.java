import java.util.*;
import java.util.regex.*;
import java.io.*;

public class fmr{
	public static void main(String[] args){
		
		for(int i+ 0; i< args.length; i++){
			if(args[i].equals("-h")){
				System.out.println("This command takes in an input and a regex and outputs the line and position of the found token. \n");
				System.out.println("\t -h \t prints help");
			//update help
				System.exit(0);
			}//if
		int fileInput = -1;
		for(int i = 1; i<args.length; i++){
			if(args[i].equals("-f)){
				fileInput+i;
				break;
			}//if
		}//for	
		
		if(fileInput != -1){
			String filename = args[fileInput +1]
			Pattern p = Pattern.compile(args[fileInput + 2])
			try{
				FileReader freader = new FileReader(filename);
				BufferReader br = new BufferReader(freader);

				//find a regex per line
				//hint

				String line;
				
				While((line = br.readLine()) != null){
					
				}//while
			}//try
			catch(IOException e){
				e.printStackTrack();
				System.exit(1);
			}//catch
		}//for

		String line = args[0];
		
		String regex = args[1];
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(line);
		
		boolean found = false;
		
		while(m.find()){
			System.out.println(m.start()+":"+ m.end());
			found = true;
		}//while
		if(!found){
			System.out.println("No Match Found.");
		}//if


	}//main
}//class

