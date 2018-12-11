package mate.academy;

import java.util.Arrays;
import java.util.Date;

public class RateTest {

	public static void main(String[] args) {
		

		String[][] rate = {{"#", "currency", "description", "rate"}, {"1", "USD", "American dollar", "28.15"},
				{"2", "EUR", "EU Euro", "32.3"}, {"3", "RUB", "Russian ruble", "0.35"}};
		
		System.out.println(rate.length);
		
		/*for (int i = 0; i < rate[i].length; i++) {
			for (int j = 0; j < rate[j].length; j++) {
				System.out.printf("|%s|%s|%s|%s|", ));

			}*/
		System.out.printf("|%s|%s|%s|%s|", "1", "USD", "American dollar", "28.15");

	}

}
