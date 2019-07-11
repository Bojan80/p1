package p1;
import java.util.Random;
import javax.swing.*;

public class Exercise1 {
	
    /* Klassen inneh�ller l�sningarna till uppgiften p1
     * Metoden beräknar totala biljettpriset och det genomsnittliga
     * biljettpriset för ett antal vuxna, barn och pensionärer.
     **/	
	public void exercise1a() {
		// Initiering av variabler som anv�nds i programmet
		int adults = 110, children = 60, retired = 80, totalPrice = 0, 
		// Deklarering av variabler som anv�nds i programmet
		average, vuxen, barn, pensionarer; 
		
		// Anv�ndaren matar in antalet vuxna. Lagras i variabeln vuxen
		vuxen = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet vuxna: "));
		// Anv�ndaren matar in antalet barn. Lagras i variabeln barn
		barn = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet barn: "));
		// Anv�ndaren matar in antalet pension�rer. Lagras i variabeln pensionarer
		pensionarer = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet pension�rer: "));
		// Totala priset r�knas ut f�r samtliga och lagras i variabeln totalPrice
		totalPrice = (vuxen * adults) + (barn * children) + (pensionarer * retired);
		// Den genomsnittliga kostnaden per person r�knas ut som heltal och lagras i variabeln average
		average = totalPrice / (vuxen + barn + pensionarer);
		// Ett meddalande visas om vad varje variabel inneh�ller	
		JOptionPane.showMessageDialog(null, "Totala priset �r: " + totalPrice + "kr" + "\nGenomsnittspriset �r: " + average + "kr");
		
	}
	/* Metoden skriver ut siffror fr�n 1 - 100 med tv� steg mellan varje siffra
	 */
	public void exercise1b() {
		// For loopen loopar 100ggr med tv� steg mellan varje siffra
		int i;
		for( i = 1; i < 100; i = i + 2) {
			// variabeln i printas ut i konsolen
			System.out.print(i + " ");
		}
		
	}
	/* Metoden ber anv�ndaren att mata in ett tal. Programmet ska sedan avg�ra om det �r ett positivt eller negativt
	 * tal eller om talet �r lika med 0. Inmatningen ska ske fyra ggr.
	 */
	 public void exercise1c() {
		// Deklarering av variabeln input och i som anv�nds i programmet
		int i;
		int input;
		// An�ndaren fr�gas fyra ggr efter inmatning av ett tal som lagras i variabeln input. For loppen g�r att uppmaningen
		// efter input sker fyra ggr. Resultatet skrivs ut i konsolen.
		for(i = 0; i <=3; i++) {
		input = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett tal: "));
		// H�r g�rs ett statement att om variabeln input �r mindre �n noll ska utskrift ske att input �r negativt 
		if(input < 0) {
		   System.out.println("Talet " + input + " �r" + " negativt");
		}
		// H�r g�rs ett statement att om variabeln input �r st�rre �n noll ska utskrift ske att input �r positivt 
		else if(input > 0) {
				System.out.println("Talet " + input + " �r" + " positivt");
		}
		// H�r g�rs ett statement att d� variabeln input �r lika med noll ska utskrift ske att input �r noll 
		else {
			input = 0; 
	     	System.out.println("Talet " + input + " �r " + " noll");
		}
				 
		} 
				 
	 }		 
	 /* Anv�ndaren uppmanas att ange ett minsta v�rde och ett max v�rde. Programmet ska sedan
	  * skriva ut dessa v�rden samt intervallet. 
	  */
	 public void exercise1d() {
		 // Variabler f�r programmet deklareras
		 int min, max;
		 // Variabler f�r programmet initieras
		 String comma ="";
		 String space ="      ";
		 // Programmet fr�gar anv�ndaren om ett minsta respektive ett h�gsta tal
		 min = Integer.parseInt(JOptionPane.showInputDialog("Ange minsta v�rdet: "));
		 max = Integer.parseInt(JOptionPane.showInputDialog("Ange h�gsta v�rdet: "));
		 // Titlar f�r programmet skrivs ut
		 System.out.print("Min     " + "Max    " + "  K�rresultat\n");
		 // V�rdet f�r variablerna min och max skrivs ut under respektive titel f�ljt av str�ngen space som
		 // inneh�ller ett par mellansteg
		 System.out.print(min + space + max + space);
		 // En for loop som inneb�r att s� l�nge min �r mindre �n max ska min �kas med 7
		 for(int i = min; min<=max; min = min + 7 ) {
			 // Den tomma str�ngen comma skrivs ut innan min 
			 System.out.print(comma + min);
			 // Den tomma str�ngen comma omvandlas till variabeln comma som inneh�ler ett kommatecken
			 comma = ", ";
		 }
	 }
	/* Programmet ritar ett f�nster och h�mtar en gubbe fr�n katalogen images som placeras i
	 * f�nstret. Vidare g�r programmet att gubben r�r sig v�nster till h�ger utan att l�mna
	 * f�nstret.
	 */
	public void exercise1e() {
		// H�r skapas ett nytt objekt 
		PaintWindow pw = new PaintWindow();
		// H�r skapas ett nytt objekt 
		Random rand = new Random(); 
		// H�r skapas ett nytt objekt 
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		// H�mtar bredden fr�n klassen PaintWindow (pw-objektet skapades i rad 93)
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -3; // hastighet p� gubben �t v�nster eftersom det �r negativt tal
		int dy = 0;  // R�relse i y-led �r noll, inneb�r att gubbe.jpg inte r�r sig ner eller upp�t
		int x = 250; // startposition p� x-axeln
		int y = rand.nextInt(height-100);  // Bildens h�jd �r 100
		
		// Loopen g�r att gubben r�r sig inom f�nstret
		while(true) {
			pw.showImage(image, x, y); // en metod av showImage som tar tre parametrar: image, x, y
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan n�sta f�rflyttning
			x += dx; 
			y += dy;
			if(x<0) {
				dx = -dx; // f�r varje x ska x g� tillbaka 
			}else if(x>width-100) {
				dx = -dx;
			
			}
		}
	}
	/* Programmet ritar ett f�nster och h�mtar en gubbe fr�n katalogen images som placeras i
 	 * f�nstret. Vidare g�r programmet att gubben r�r sig v�nster till h�ger utan att l�mna
 	 * f�nstret. Denna g�ngen r�r sig gubben �ven i h�jdled utan att l�mna f�nstret.
 	 */
	public void exercise1f() {
		PaintWindow pw = new PaintWindow();
		Random randNbr = new Random();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = randNbr.nextInt( 7 )-3; // dx tilldelas en slumpm�ssig r�relse i x-led fr�n -3 till 3
		int dy = randNbr.nextInt( 7 )-3; // dy tilldelas en slumpm�ssig r�relse i y-led fr�n -3 till 3 
		int x = randNbr.nextInt( 501 );  // Slumpm�ssig startposition p� x-axeln fr�n 0 - 500
		int y = randNbr.nextInt(height-100);  // Bildens h�jd �r 100
		
		
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan n�sta f�rflyttning
			x += dx;
			y += dy;
			if(y<0) {
				dy = -dy; 
			}
			else if(y>width-300) {
				dy = -dy;
			}
			else if(x<0) {
				dx = -dx;
			}
			else if(x>width-100) {
					dx = -dx;
			}
		}
	}
}	
