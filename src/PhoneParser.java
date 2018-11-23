import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneParser {
	public static final String phonesFile = "phone-data.txt";

	/*
	 * Parses a phone data string, in the following format:
	 * 
	 * model screenSize batteryCapacity
	 * 
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
		// TODO: parse the phone data string, and return a Phone object.
		// you may use string manipulation, a regex, or a Scanner
		String[] phoneData = data.split(" ");
		Phone newphone = new Phone(phoneData[0].replaceAll("_", " "),
									Double.parseDouble(phoneData[1]),
									Integer.parseInt(phoneData[2]));
		return newphone;
	}

	/*
	 * Returns a PhoneList by parsing a text file containing the phone data.
	 */
	public static PhoneList parseFile(String phonesFile) throws IOException {
		// TODO: create a PhoneList

		// TODO: create a BufferedReader to read from the file

		// TODO: for each line, parse it as a Phone and add it to the list
		PhoneList phoneList = new PhoneList();
		BufferedReader file = new BufferedReader(new FileReader(phonesFile));
		while (true) {
			String line = file.readLine();
			if (line == null) {
				break;
			} else {
				phoneList.addPhone(parse(line));
			}
		}
		file.close();
		return phoneList;
	}
}
