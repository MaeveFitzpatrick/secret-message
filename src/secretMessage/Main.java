package secretMessage;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

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
		char character = 0;
		final int secretKey = 12;
		String fileContent = "";
		try {
			File inputFile = new File("\\Users\\jucar\\Desktop\\secretMessage\\src\\secretMessage\\input.txt");
			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int cha = 0;
			while((cha = bufferedReader.read()) != -1) {
				character = (char) cha;
				if (encodeDecode.equals("encode"))
					character = myCaesar.CaesarEncode(character, secretKey);
				if (encodeDecode.equals("decode"))
					character = myCaesar.CaesarDecode(character, secretKey);
				fileContent = fileContent + character;
			}
			FileWriter writer = new FileWriter("\\Users\\jucar\\Desktop\\secretMessage\\src\\secretMessage\\output.txt");
				for (int i =0; i < fileContent.length(); i++)
					writer.write(fileContent.charAt(i));
					writer.close();
				if (cha == -1) {
						fileReader.close();
				}
				}
				catch (FileNotFoundException ex) {
					System.out.println("Error. FileNotFound.");
				}
				
		return true;
	}
}