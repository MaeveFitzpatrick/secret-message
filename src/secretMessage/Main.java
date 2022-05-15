package secretMessage;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
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
		caesar myCaesar = new caesar();
		char ch = 0;
		String fileContent = "";
		try {
		//create input.txt file
		File inputFile = new File("\\Users\\jucar\\Desktop\\secretMessage\\src\\secretMessage\\input.txt");
		//a)read/scan through each line
		Scanner scan = new Scanner(inputFile);
		
		
		//while inputFile has another line, read/add next line.
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
			}
		//c)
		if (encodeDecode == "encode")
			myCaesar.CaesarEncode(ch, 0);
		//Are these the parameters?
		if (encodeDecode == "decode")
			myCaesar.CaesarEncode(ch, 0);
		
		//d) writer
		FileWriter writer = new FileWriter("\\Users\\jucar\\Desktop\\secretMessage\\src\\secretMessage\\output.txt");
		writer.write(fileContent);
		writer.close();
		//b)if end-of-file is reached, terminate.
		if (scan.hasNextLine() == false) {
				scan.close();
		}
		}
		catch (FileNotFoundException ex) {
			System.out.println("Error. FileNotFound.");
		}
		return true;
	}
}