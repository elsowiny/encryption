package cryptic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.jasypt.util.text.BasicTextEncryptor;

public class Cryptic {
	
	static BasicTextEncryptor cryptor = new BasicTextEncryptor();
	static String encryptedFilePath = "../crypt-demo/src/textfile/encryptedFile.txt";
	static String decryptedFilePath = "../crypt-demo/src/textfile/decryptedFile.txt";
	
	
	//ENCRYPTION
	public static void Encrypt(String passWord, File file) throws IOException {
		System.out.println("Preparing to encrypt your file...");
		cryptor.setPassword(passWord);
		Scanner scan = new Scanner(file);
		String encryptFileContent = "";
			while(scan.hasNextLine()) {
				encryptFileContent = encryptFileContent.concat(cryptor.encrypt(scan.nextLine())+ "\n");
			}
		FileWriter writer = new FileWriter(encryptedFilePath);
		writer.write(encryptFileContent);
		writer.close();
		scan.close();
		System.out.println("Your file has been encrypted.");
	}

	//DECRYPTION
	public static void Decrypt() throws IOException {
		System.out.println("Preparing to decrypt your file...");
		File decryptFile = new File(encryptedFilePath);
		Scanner decryptScan = new Scanner(decryptFile);
		String decryptedFileContent = "";
			while(decryptScan.hasNext()) {
				decryptedFileContent = decryptedFileContent.concat(cryptor.decrypt(decryptScan.nextLine()) + "\n");
			}
		FileWriter decryptWriter = new FileWriter(decryptedFilePath);
		decryptWriter.write(decryptedFileContent);
		decryptWriter.close();
		decryptScan.close();
		System.out.println("Your file has been decrypted.");
	}

	

}
