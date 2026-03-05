import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class PracticeProblem {

	public static String readFile(String filename) {
		String a = "";
		try{
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				a += scanner.nextLine()+"\n";
			}
			scanner.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File not found.");
		}
		return a;
	}
	public static String backwardsReadFile(String filename) {
		String a = "";
		try{
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				a += scanner.nextLine()+"\n";
			}
			scanner.close();
		}
		catch(FileNotFoundException e){
			return "";
		}
		String reversed = "";
		for (int i = a.length()-1; i >= 0; i--){
			reversed += a.charAt(i);
		}
		return reversed;
	}
	

}
