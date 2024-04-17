package org.lessons.java.security;

import java.util.Scanner;

public class ClassPasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//recupero il nome
		System.out.println("il tuo nome");
		
		String nome = input.nextLine();
		
		//recupero il cognome		
		System.out.println("inserisci il tuo cognome");
		
		String cognome = input.nextLine();
		
		//recupero il colore preferito
		System.out.println("inserisci il tuo colore preferito");
		
		String colore = input.nextLine();
		
		//recupero la data di nascita 
		//recupero il giorno di nascita
		System.out.println("inserisci il giorno di nascita");
		
		int giorno = input.nextInt();
		
		//recupero il mese di nascita
		System.out.println("inserisci il mese di nascita");
		
		int mese = input.nextInt();		
		
		//recupero l'anno di nascita
		System.out.println("inserisci l'anno di nascita");
		
		int anno = input.nextInt();
		
		//creo la somma di giorno mese anno
		int data = giorno + mese + anno;
		
		
		//genero la password
		String password = nome + "-" + cognome + "-" + colore + "-" + data;
		
		
		//stampo il risutato
		System.out.println("Ciao " + nome + " " + cognome + " la tua password è " + password);
		
	}

}