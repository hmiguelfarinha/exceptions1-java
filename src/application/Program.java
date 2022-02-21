package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entitites.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//solução 1 - muito má!! lógica de validação no programa principal
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY): ");
		Date checkIn = sdf.parse(sc.next()); // pode gerar uma parse exception, quando se adiciona no main a excecao estamos a dizer que o metodo aceita a excecao e pode haver propagação
											// A solução para nao acrescentar ao main é tratar a excecao por exemplo com o try catch
		System.out.print("Check-out date (DD/MM/YYYY): ");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			System.out.println();
			System.out.println("Enter date to update the reservation: ");
			
			System.out.print("Check-in date (DD/MM/YYYY): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (DD/MM/YYYY): ");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkIn, checkOut); // recebe o resevation.updaDates para a String error para saber se deu erro ou não 
			if (error != null) { // teste se a String do error deu erro ou não 
				System.out.println("Error in reservation: " + error); //mostra o erro
			}
				else {
			System.out.println("Reservation: " + reservation); //não deu erro e mostra o update da reserva
			}
		
		}
		
		sc.close();
	}
}
