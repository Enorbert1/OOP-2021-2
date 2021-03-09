package impendingdoom;

import java.util.Scanner;

public class Szemely {
	private String nev;
	private int suly;
	private double meret;
	private double tti;
	private String eredmeny;

	public Szemely() {
		NevMegad();
		NevVissza();
		SulyMegad();
		SulyVissza();
		MeretMegad();
		MeretVissza();
		Tti();
		TtiVissza();
		TtiEredVissza();
	}

	// Nevével foglalkozunk
	public void NevMegad() {
		Scanner input = new Scanner(System.in);
		System.out.println("Kerek egy nevet.");
		String nev = input.nextLine();
		this.nev = nev;
	}

	public String NevVissza() {
		String ujnev = "";
		ujnev = this.nev;
		return ujnev;
	}
	// Név vége

	// Súlyával foglalkozunk
	public void SulyMegad() {
		Scanner input = new Scanner(System.in);
		boolean hiba = true;
		int suly = 0;
		System.out.println("Kerem a sulyat.");
		while (hiba) {
			if (input.hasNextInt())
				suly = input.nextInt();
			else {
				System.out.println("Nem jo, ujra!");
				input.next();
				continue;
			}
			hiba = false;
		}
		this.suly = suly;
	}

	public int SulyVissza() {
		int ujsuly = 0;
		ujsuly = this.suly;
		return ujsuly;
	}
	// Súlya vége

	// Magasságával foglalkozunk

	public void MeretMegad() {
		Scanner input = new Scanner(System.in);
		boolean hiba = true;
		double meret = 0.0;
		System.out.println("Kerem a magassagat.");
		while (hiba) {
			if (input.hasNextDouble())
				meret = input.nextDouble();
			else {
				System.out.println("Nem jo, ujra!");
				input.next();
				continue;
			}
			hiba = false;
		}
		this.meret = meret;
		input.close();
	}

	public double MeretVissza() {
		double ujmeret = 0.00;
		ujmeret = this.meret;
		return ujmeret;
	}
	// Magassága vége

	// Testtömeg index
	public void TtiCore() {
		this.tti = (double) Math.round(this.suly / Math.pow(this.meret, 2) * 100) / 100;

	}

	public void Tti() {
		String eredmeny;
		TtiCore();
		if (this.tti > 25.0)
			eredmeny = "Kover";
		else if (this.tti < 18.5)
			eredmeny = "Sovany";
		else
			eredmeny = "Normal";
		this.eredmeny = eredmeny;
	}

	public String TtiEredVissza() {
		String ujtti = "";
		ujtti = this.eredmeny;
		return ujtti;
	}

	public double TtiVissza() {
		double ujtti = 0.00;
		ujtti = this.tti;
		return ujtti;
	}
	// Testtömeg index vége

	/*
	 * public Szemely Feltolt(Szemely ember) { ember.nev = this.nev; ember.suly =
	 * this.suly; ember.meret = this.meret; ember.tti = this.tti; return ember; }
	 * 
	 * public String Osszefuzott() {
	 * 
	 * return this.nev + this.suly + this.meret + this.tti; }
	 */
}
