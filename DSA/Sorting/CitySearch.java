/*
 *	PRN: 260847320048
	Name: Swapnil Sunil Nimbalkar
	Email Id: swapniln1612@gmail.com
 */

package assignment4;
import java.util.Scanner;

public class CitySearch {

    static Scanner sc = new Scanner(System.in);

    static void searchCity(String city[], String key) {

        for (int i = 0; i < city.length; i++) {

            if (city[i].equalsIgnoreCase(key)) {
                System.out.println("City found at position: " + (i + 1));
                return;
            }
        }

        System.out.println("City not found");
    }

    public static void main(String[] args) {

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        String city[] = new String[n];

        System.out.println("Enter city names:");

        for (int i = 0; i < n; i++) {
            city[i] = sc.next();
        }

        System.out.print("Enter city to search: ");
        String key = sc.next();

        searchCity(city, key);
    }
}