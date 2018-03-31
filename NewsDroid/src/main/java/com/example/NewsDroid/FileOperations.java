package com.example.NewsDroid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileOperations {
	String dosyayolu;
	File dosya;
	BufferedWriter yaz;
	FileWriter yazici;

	ArrayList<String> newsDetail = new ArrayList<>();

	public FileOperations(String dosyayolu) {
		dosya = new File(dosyayolu);

		this.dosyayolu = dosyayolu;
	}

	public void fileWrite(String metin) throws IOException {

		yazici = new FileWriter(dosya, true);
		yaz = new BufferedWriter(yazici);
		yaz.write(metin);
		yaz.newLine();
		yaz.close();
		System.out.println("Ekleme İşlemi Başarılı");

	}

	public void FileRead(File path) throws IOException {

		FileReader fileReader = new FileReader(path);
		String line;

		BufferedReader br = new BufferedReader(fileReader);

		try {
			while ((line = br.readLine()) != null) {

				//System.out.println(line);
				newsDetail.add(line);

			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			br.close();
		}

	}

}
