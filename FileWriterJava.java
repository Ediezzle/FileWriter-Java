import java.io.*;

class FileWriterJava{
	public static void main(String[] args) throws FileNotFoundException, IOException{
		File f = new File("myFile.txt");
		FileWriter fw = new FileWriter(f, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.append("\nMy file");
		pw.close();
	}
}