package cryptic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		//set a password that you desire
		String passWord = "password";
		//if you have another file you would like encrypted
		//insert the file into the textFile folder and change 
		//"cpt.txt" to your file name
		String fileName = "cpt.txt";
	    String fileToEncrypt = "../crypt-demo/src/textfile/" + fileName;
	    File file = new File(fileToEncrypt);
		
	    
		Cryptic.Encrypt(passWord,file);
		//the method will encrypt your file and create a new file 
		//called "encryptedFile.txt" located in the textFiles folder
		//**note may need to refresh to see the file added**
		
		Cryptic.Decrypt();
		//this method will decrypt your encrypted file and create a new file
		//called "decryptedFile.txt" located in the textFiles folder
		//**note may need to refresh to see the file added**
		
	}

}
