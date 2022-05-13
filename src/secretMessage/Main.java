package secretMessage;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello! Would you like to encode or decode a message?");
		String codeResponse = input.nextLine();
		System.out.println("What is the name of the input file?");
		String inputFileName = input.nextLine();
		System.out.println("What is the name of output file?");
		String outputFileName = input.nextLine();
	}
	public static boolean processFile(String key, String encodeDecode, String inputFileName, String outputFileName) throws Exception {
		try {
			System.out.println(inputFileName);
		}
		catch(Exception ex) {
			
		}
		return true;
	}

}
