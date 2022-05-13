package secretMessage;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main (String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter key: ");
		String key = input.nextLine();
		System.out.println("Hello! Would you like to encode or decode a message?");
		String encodeDecode = input.nextLine();
		System.out.println("What is the name of the input file?");
		String inputFileName = input.nextLine();
		System.out.println("What is the name of output file?");
		String outputFileName = input.nextLine();
		Process myProcess = new Process();
		myProcess.processFile(key, encodeDecode, inputFileName, outputFileName);
	}
}
class Process {
	public boolean processFile(String key, String encodeDecode, String inputFileName, String outputFileName) throws Exception {
		FileReader myFile = new FileReader("/secretMessage/src/secretMessage/input.txt");
		StringBuilder content = new StringBuilder();
		int i;
		if ((i = myFile.read()) != -1) {
			content.append((char) i);
		if (i == -1)
			return false;
		}
		
		System.out.println(content.toString());
		try {
			System.out.println(inputFileName);
		}
		catch(Exception ex) {
			
		}
		return true;
	}

}