import java.io.IOException;
import java.util.Collection;

public class FindBestPhones {
	public static String PHONES_FILE = "phone-data.txt";
	
	public static void main(String[] args) {
		// TODO: use the parseFile method to get the phone data from the file
		
		// TODO: print the model names of all the best phones
		
		// TODO: handle I/O failures by printing an error message
		
		try {
			Collection<Phone> listOfBestPhones=PhoneParser.parseFile(PHONES_FILE).getBestPhones();
			for(Phone phone:listOfBestPhones) {
				System.out.println("Model:"+phone.getModel() + " Screen:"+phone.getScreenSize()+ " Battery:"+phone.getBatteryCapacity());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Occured");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Screensize or battery capacity cannot be negative");
			
		}
		
		
	}
}
