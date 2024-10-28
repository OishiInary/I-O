package Main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			File file = new File("C:/test/test.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < 5; i++) {
				bw.write("すでに" + i +  "回、昇天しました。");
				bw.newLine();
			}
			bw.close();
		}catch (IOException e) {
			System.out.println(e);
		}
		try {
			File file = new File("C:/test/test.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
