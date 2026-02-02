package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, data, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(null);
		
		contractService.processContract(obj, n);
		
		
		System.out.println("Parcelas:");
		for(Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}
		
		
		
		sc.close();
	}

}
