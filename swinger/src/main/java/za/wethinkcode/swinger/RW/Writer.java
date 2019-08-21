package za.wethinkcode.swinger.RW;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer
{
    private static Writer Writer = null;
	private static File file = null;
	private static BufferedWriter bufferedWriter = null;
	private static FileWriter fileWriter = null;
	private Writer() {}
	public Writer(String path, boolean append) {}
	public static Writer getWriter() {
		if(Writer == null){
			try {
				Writer = new Writer();
				file = new File("Hero.txt");
				fileWriter = new FileWriter(file, true);
				bufferedWriter = new BufferedWriter(fileWriter);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return Writer;
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