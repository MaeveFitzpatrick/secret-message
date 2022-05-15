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
		
		
		callCaesar.CaesarDecode(0, 0);
	}
}
class Process {
	public boolean processFile(String key, String encodeDecode, String inputFileName, String outputFileName) throws Exception {
		caesar callCaesar = new caesar();
		//read file
		//creates the file
		java.io.File myFile = new java.io.File("input.txt");
		//creates a scanner for the file
		Scanner myInput = new Scanner(myFile);
		
		return true;
	}

}