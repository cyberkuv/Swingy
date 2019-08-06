package za.wethinkcode.swingy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	private static WriteFile writeFile = null;
	private static File file = null;
	private static BufferedWriter bufferedWriter = null;
	private static FileWriter fileWriter = null;
	private WriteFile() {}
	public WriteFile(String path, boolean append) {}
	public static WriteFile getwritefile() {
		if(writeFile == null){
			try {
				writeFile = new WriteFile();
				file = new File("Heros.txt");
				fileWriter = new FileWriter(file, true);
				bufferedWriter = new BufferedWriter(fileWriter);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return writeFile;
	}
	public void writetofile(String string){
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			bufferedWriter.write(string + "\n");
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}