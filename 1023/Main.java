import java.io.*;

public class Main {
	private static final String LINE_SEPARATOR = System.lineSeparator();
	public static String readFromFile(String fileName) {
		File file = new File(fileName);
		StringBuilder sb = new StringBuilder();

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append(LINE_SEPARATOR);
			}
			return sb.toString();
		} catch (FileNotFoundException e) {
			System.err.println(String.format("ファイルが見つかりません: %s",fileName));
			return null;
		} catch (IOException e) {
			System.err.println(String.format("ファイル読み込みに失敗しました: %s", fileName));
			return null;
		} finally {
			closeSilently(br);
			closeSilently(fr);
		}
	}

	private static boolean writeToFile(String fileName, String context) {
		File file = new File(fileName);
		try (
				FileWriter fw = FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				) {
			pw.println(context);
			return true;
				} catch (IOException e) {
					return false;
				}
	}

	private static void closeSilently(AutoCloseable taget) {
		if (target != null) {
			try {
				target.close();
			} catch (Exception e) {}
		}
	}
}
			
