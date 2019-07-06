
import java.io.*;
import java.util.Scanner;

public class TestProgram {
	public static void main(String[] args) throws IOException {// reads text from a character-input stream (file)

		StringTree tree = new StringTree(); // instance of the StringTree class

		try {
			Scanner textFile = new Scanner(new File("FruitsAndVegetables.txt"));
			System.out.println("Adding fruit and vegetable items to the binary tree: ");
			while (textFile.hasNext()) {

				tree.adding(textFile.next());
				// System.out.print(textFile.next() + "\t\n");

			}

		} catch (FileNotFoundException filenotfoundexception) // Catches file not found exception
		{
			System.out.println("File not found.");
		}
		System.out.println("\nFruits and vegetables sorted alphabetically: ");
		tree.inOrderTraversal(tree.root);
		
	}

}