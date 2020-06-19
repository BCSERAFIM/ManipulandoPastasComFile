package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Listar as sub pastas
		
		File [] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Listar os Arquivos
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files:");
		for (File file : files) {
			System.out.println(file);
		}
		
		// Criar sub pasta
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		
		sc.close();

	}

}
