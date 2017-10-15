package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class ManipulateDna {
  /**
   * The program will change, delete char in DNA.
   *
   * @author YE Yuan
   */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Ye Yuan " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string" + dna);
    System.out.println("\n");
    System.out.println("Enter a string containing only C, G, T, and A: " + dna);
    // Compute the complement of the DNA String
    String dnaS = dna.replace("a","T");
    dnaS = dnaS.replace("t","A");
    dnaS = dnaS.replace("c","G");
    dnaS = dnaS.replace("g","C");
    dna = dna.toUpperCase();
    System.out.println("Complement of " + dna + " is " + dnaS);
    // Insert a randomly chosen DNA letter into the DNA String
    Random n1 = new Random();
    /* this creat random varibale n1
     * n1 will be used in future damdom letter producer
     */
    String need = "ATCG";
    char randomC = need.charAt(n1.nextInt(4));
    int pos = n1.nextInt(dna.length());
    String insertion = dna.substring(0, pos) + randomC + dna.substring(pos);
    System.out.println("Inserting " + randomC + " at position " + pos + " gives " + insertion);
    // Delete a DNA letter from a randomly chosen position in the DNA string
    int pos2 = n1.nextInt(dna.length());
    String delete = dna.substring(0, pos2) + dna.substring(pos2 + 1);
    System.out.println("Deleting from position " + pos2 + " gives " + delete);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int pos3 = n1.nextInt(dna.length());
    randomC = need.charAt(n1.nextInt(4));
    String random5 = dna.substring(0, pos3) + randomC + dna.substring(pos3 + 1);
    System.out.println("Changing position " + pos3 + " gives " + random5);
    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using the ManipulateDna program.");
    System.out.println("Have an awesome day.");
  }

}
