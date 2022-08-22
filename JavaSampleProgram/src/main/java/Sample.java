import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Sample {

	public static void main(String[] args) {
		SimpleDateFormat DateFor=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date=DateFor.parse("09/08/2022");
			System.out.println("Date: "+date);
		}catch(ParseException e) {
			e.printStackTrace();		}
			}
	}
        