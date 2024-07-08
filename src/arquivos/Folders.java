package arquivos;

import java.io.File;

public class Folders {

	public static void main(String[] args) {
		String strPath = "C:\\dev\\";
		File path = new File(strPath);

		for (File folder : path.listFiles(File::isDirectory)) {
			System.out.println(folder);
		}

		System.out.println();

		for (File file : path.listFiles(File::isFile)) {
			System.out.println(file);
		}

		System.out.println();

		boolean success = new File(strPath + "\\subdir").mkdir();
		if (success)
			System.out.println("Diretório criado com sucesso!");

	}

}
