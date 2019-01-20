package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrazilTaxService;
import model.service.RentalService;

public class ProgramInterFace_1 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

		System.out.println("Enter Rental Data");
		System.out.print("Car Model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy hh:ss): ");
		Date finish = sdf.parse(sc.nextLine());
		System.out.println();

		CarRental car = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter Price Per Hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter Price Per Day: ");
		double pricePerDay = sc.nextDouble();
		System.out.println();

		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(car);

		System.out.println("INVOICE:");
		System.out.println();
		System.out.println("Basic Payment: " + String.format("%.2f", car.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", car.getInvoice().getTax()));
		System.out.println("Total Payment: " + String.format("%.2f", car.getInvoice().getTotalPayment()));

		sc.close();

	}

}
