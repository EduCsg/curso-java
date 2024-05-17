package enumeracoes_e_composicao.exercicio1;

import java.text.SimpleDateFormat;
import java.util.Date;

import enumeracoes_e_composicao.exercicio1.entities.Department;
import enumeracoes_e_composicao.exercicio1.entities.HourContract;
import enumeracoes_e_composicao.exercicio1.entities.Worker;
import enumeracoes_e_composicao.exercicio1.enums.WorkerLevel;

public class Main {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Simula os inputs do usuário
		String[] datesList = { "20/08/2024", "13/06/2024", "25/08/2024" };
		double[] hoursList = { 50.0, 30.0, 80.0 };
		int[] hoursList2 = { 20, 18, 10 };
		String departmentName = "Design";
		String workerName = "Alex";
		String workerLevel = "MID_LEVEL";
		Double baseSalary = 1200.0;

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));

		try {
			for (int i = 0; i < datesList.length; i++) {
				Date contractDate = sdf.parse(datesList[i]);
				double valuePerHour = hoursList[i];
				int hours = hoursList2[i];

				HourContract contract = new HourContract(contractDate, valuePerHour, hours);
				worker.addContract(contract);
			}

			String monthAndYear = "08/2024";
			int month = Integer.parseInt(monthAndYear.substring(0, 2));
			int year = Integer.parseInt(monthAndYear.substring(3));

			System.out.println("Name: " + worker.getName());
			System.out.println("Department: " + worker.getDepartment().getName());
			System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
