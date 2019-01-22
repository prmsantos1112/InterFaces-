package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class ProgramInterFace {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter Contract Data");
		System.out.print("Number: ");

		int number = sc.nextInt();

		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract Value: ");
		double totalValue = sc.nextDouble();
		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Enter Number of Installments: ");

		int n = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);
		System.out.println("Installments:");
		for (Installment x : contract.getInstallments()) {
			System.out.println(x);

		}
		sc.close();
	}

}
