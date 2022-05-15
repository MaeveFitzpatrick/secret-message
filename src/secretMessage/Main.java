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
		//create file
		File file = new File("\\Users\\jucar\\Desktop\\secretMessage\\src\\secretMessage\\input.txt");
		//read/scan through each line
		Scanner scan = new Scanner(file);
		//for as long as there is a next line, print the next line
		String fileContent = "";
		while (scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		//writer
		FileWriter writer = new FileWriter("\\Users\\jucar\\Desktop\\secretMessage\\src\\secretMessage\\output.txt");
		writer.write(fileContent);
		writer.close();
		return true;
		
		
	}

}