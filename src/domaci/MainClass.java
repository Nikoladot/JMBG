package domaci;

import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcija = 0;
		do {
		System.out.println("Unesite Vas JMBG: ");
		String JMBG = s.next();	
		
		if (JMBG.length()!=13)  {
			System.out.println("Vas JMBG nema odgovarajuci broj cifara.");
			}
		
		int dan = Integer.parseInt((JMBG).substring(0, 2));
		int mesec = Integer.parseInt((JMBG).substring(2, 4));
		int godina = Integer.parseInt((JMBG).substring(4, 7));
		int regija = Integer.parseInt((JMBG).substring(7, 9));
		int pol = Integer.parseInt((JMBG).substring(9, 12));
		int kC = Integer.parseInt((JMBG).substring(12, 13)); // kC je kontrolna cifra.
		
		int gzp = Integer.parseInt((JMBG).substring(5, 7)); // gzp(godina za ispis) promenljiva za ispis godine u konzoli.
		// gzp nema bas najjasniji prikaz godine, ima dosta propusta recimo ako je neko 2000 godiste ili ako je 2007 .. itd.
		
		boolean pG = ((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0); // pG je prestupna godina

		
		
		if (godina>= 0 & godina<=999) {
		}
		else {
			System.out.println("Uneli ste pogresnu godinu rodenja.");
			
		}
    	if (mesec==01 & (dan>= 01 & dan <= 31)) {
		System.out.println(dan + ".Januar." + gzp + ".");
			}
		else if ( mesec == 2 && ((pG && dan > 0 && dan <= 29) || (!pG && dan > 0 && dan <= 28)))   {
			System.out.println(dan + ".Februar." + gzp + ".");
				}
		else if (mesec==3 & (dan>=1 & dan <=31) ) {
			System.out.println(dan + ".Mart." + gzp + ".");
				}
		else if (mesec==4 & (dan>=1 & dan <= 30)) {
			System.out.println(dan + ".April." + gzp + ".");
				}
		else if (mesec==5 & (dan>=1 & dan <= 31)) { 
			System.out.println(dan + ".Maj." + gzp + ".");
				}
		else if (mesec==6 & (dan>=1 & dan <= 30)) {
			System.out.println(dan + ".Jun." + gzp + ".");
				}
		else if (mesec==7 & (dan>=1 & dan <= 31)) {
			
			System.out.println(dan + ".Jul." + gzp + ".");
				}
		else if (mesec==8 & (dan>=1 & dan <= 31)) {
			System.out.println(dan + ".Avgust." + gzp + ".");
				}
		else if (mesec==9 & (dan>=1 & dan <= 30)) {
			System.out.println(dan + ".Septembar." + gzp + ".");
				}
		else if (mesec==10 & (dan>=1 & dan <= 31)) {
			System.out.println(dan + ".Oktobar." + gzp + ".");
				}
		else if (mesec==11 & (dan>=1 & dan <= 30)) {
			System.out.println(dan + ".Novembar." + gzp + ".");
				}
		else if (mesec==11 & (dan>=1 & dan <= 31)) {
			System.out.println(dan + ".Decembar." + gzp + ".");
				}
		else {
			
			System.out.println("Uneli ste pogresan mesec ili dan rodjenja.");
		}

	if (regija >= 0 & regija <= 9 ) {
		System.out.println("Stranci bez državljanstva bivše SFRJ ili njenih naslednica.");
}
		else if (regija >= 10 & regija <= 19 ) {
		System.out.println("Drzavljanin Bosne i Hercegovine.");
		}
		else if (regija >= 20 & regija <= 29 ) {
			System.out.println("Drzavljanin Crne Gore.");
			}
		else if (regija >= 30 & regija <= 39 ) {
			System.out.println("Drzavljanin Hrvatske.");
			}
		else if (regija >= 40 & regija <= 49 ) {
			System.out.println("Drzavljanin Makedonije.");
			}
		else if (regija >= 50 & regija <= 59 ) {
			System.out.println("Drzavljanin Slovenije.");
			}
		else if (regija >= 60 & regija <= 69 ) {
			System.out.println("Nemamo informacije o drzavljanstvu.");
			}
		else if (regija >= 70 & regija <= 79 ) {
			System.out.println("Drzavljanin Srbije, Centralna Srbija.");
			}
		else if (regija >= 80 & regija <= 89 ) {
			System.out.println("Drzavljanin Srbije, Autonomna Pokrajina Vojvodina.");
			}
		else if (regija >= 90 & regija <= 99 ) {
			System.out.println("Drzavljanin Srbije, Autonomna Pokrajina Kosovo i Metohija.");
			}
		else {
			System.out.println("Uneta regija nije pronadjena.");
			
		}
	
	if (pol>= 0 & pol <=499) {
		System.out.println("Pol: Muski.");
	}
		else if(pol>=500 & pol <= 999) {
			System.out.println("Pol: Zenski.");
			}
		else {
			System.out.println("Nemamo informaciju za uneti broj.");
		}
	

	int A = Integer.parseInt((JMBG).substring(0, 1));
	int B = Integer.parseInt((JMBG).substring(1, 2));
	int V = Integer.parseInt((JMBG).substring(2, 3));
	int G = Integer.parseInt((JMBG).substring(3, 4));
	int D = Integer.parseInt((JMBG).substring(4, 5));
	int Đ = Integer.parseInt((JMBG).substring(5, 6));
	int E = Integer.parseInt((JMBG).substring(6, 7));
	int Ž = Integer.parseInt((JMBG).substring(7, 8));
	int Z = Integer.parseInt((JMBG).substring(8, 9));
	int I = Integer.parseInt((JMBG).substring(9, 10));
	int J = Integer.parseInt((JMBG).substring(10, 11));
	int K = Integer.parseInt((JMBG).substring(11, 12));
	int L = Integer.parseInt((JMBG).substring(12, 13));
	
	 kC = 11 - (( 7*(A+E) + 6*(B+Ž) + 5*(V+Z) + 4*(G+I) + 3*(D+J) + 2*(Đ+K) ) % 11);
	
		if (kC >= 0 & kC <= 9) {
			System.out.println("Kontrolni broj je: " + kC);
		}
		
		System.out.println("Ako zelite da cekirate sledeci JMBG unesite br 1, ako ne zelite unesite 0.");
		opcija = s.nextInt();
		
		} while(opcija==1);
	}
	
}
		
