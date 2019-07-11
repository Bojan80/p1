package p1;
import java.util.Random;
import javax.swing.*;

public class Exercise1 {
	
    /* Klassen innehåller lösningarna till uppgiften p1
     * Metoden berÃ¤knar totala biljettpriset och det genomsnittliga
     * biljettpriset fÃ¶r ett antal vuxna, barn och pensionÃ¤rer.
     **/	
	public void exercise1a() {
		// Initiering av variabler som används i programmet
		int adults = 110, children = 60, retired = 80, totalPrice = 0, 
		// Deklarering av variabler som används i programmet
		average, vuxen, barn, pensionarer; 
		
		// Användaren matar in antalet vuxna. Lagras i variabeln vuxen
		vuxen = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet vuxna: "));
		// Användaren matar in antalet barn. Lagras i variabeln barn
		barn = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet barn: "));
		// Användaren matar in antalet pensionärer. Lagras i variabeln pensionarer
		pensionarer = Integer.parseInt(JOptionPane.showInputDialog("Ange antalet pensionärer: "));
		// Totala priset räknas ut för samtliga och lagras i variabeln totalPrice
		totalPrice = (vuxen * adults) + (barn * children) + (pensionarer * retired);
		// Den genomsnittliga kostnaden per person räknas ut som heltal och lagras i variabeln average
		average = totalPrice / (vuxen + barn + pensionarer);
		// Ett meddalande visas om vad varje variabel innehåller	
		JOptionPane.showMessageDialog(null, "Totala priset är: " + totalPrice + "kr" + "\nGenomsnittspriset är: " + average + "kr");
		
	}
	/* Metoden skriver ut siffror från 1 - 100 med två steg mellan varje siffra
	 */
	public void exercise1b() {
		// For loopen loopar 100ggr med två steg mellan varje siffra
		int i;
		for( i = 1; i < 100; i = i + 2) {
			// variabeln i printas ut i konsolen
			System.out.print(i + " ");
		}
		
	}
	/* Metoden ber användaren att mata in ett tal. Programmet ska sedan avgöra om det är ett positivt eller negativt
	 * tal eller om talet är lika med 0. Inmatningen ska ske fyra ggr.
	 */
	 public void exercise1c() {
		// Deklarering av variabeln input och i som används i programmet
		int i;
		int input;
		// Anändaren frågas fyra ggr efter inmatning av ett tal som lagras i variabeln input. For loppen gör att uppmaningen
		// efter input sker fyra ggr. Resultatet skrivs ut i konsolen.
		for(i = 0; i <=3; i++) {
		input = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett tal: "));
		// Här görs ett statement att om variabeln input är mindre än noll ska utskrift ske att input är negativt 
		if(input < 0) {
		   System.out.println("Talet " + input + " är" + " negativt");
		}
		// Här görs ett statement att om variabeln input är större än noll ska utskrift ske att input är positivt 
		else if(input > 0) {
				System.out.println("Talet " + input + " är" + " positivt");
		}
		// Här görs ett statement att då variabeln input är lika med noll ska utskrift ske att input är noll 
		else {
			input = 0; 
	     	System.out.println("Talet " + input + " är " + " noll");
		}
				 
		} 
				 
	 }		 
	 /* Användaren uppmanas att ange ett minsta värde och ett max värde. Programmet ska sedan
	  * skriva ut dessa värden samt intervallet. 
	  */
	 public void exercise1d() {
		 // Variabler för programmet deklareras
		 int min, max;
		 // Variabler för programmet initieras
		 String comma ="";
		 String space ="      ";
		 // Programmet frågar användaren om ett minsta respektive ett högsta tal
		 min = Integer.parseInt(JOptionPane.showInputDialog("Ange minsta värdet: "));
		 max = Integer.parseInt(JOptionPane.showInputDialog("Ange högsta värdet: "));
		 // Titlar för programmet skrivs ut
		 System.out.print("Min     " + "Max    " + "  Körresultat\n");
		 // Värdet för variablerna min och max skrivs ut under respektive titel följt av strängen space som
		 // innehåller ett par mellansteg
		 System.out.print(min + space + max + space);
		 // En for loop som innebär att så länge min är mindre än max ska min ökas med 7
		 for(int i = min; min<=max; min = min + 7 ) {
			 // Den tomma strängen comma skrivs ut innan min 
			 System.out.print(comma + min);
			 // Den tomma strängen comma omvandlas till variabeln comma som innehåler ett kommatecken
			 comma = ", ";
		 }
	 }
	/* Programmet ritar ett fönster och hämtar en gubbe från katalogen images som placeras i
	 * fönstret. Vidare gör programmet att gubben rör sig vänster till höger utan att lämna
	 * fönstret.
	 */
	public void exercise1e() {
		// Här skapas ett nytt objekt 
		PaintWindow pw = new PaintWindow();
		// Här skapas ett nytt objekt 
		Random rand = new Random(); 
		// Här skapas ett nytt objekt 
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		// Hämtar bredden från klassen PaintWindow (pw-objektet skapades i rad 93)
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = -3; // hastighet på gubben åt vänster eftersom det är negativt tal
		int dy = 0;  // Rörelse i y-led är noll, innebär att gubbe.jpg inte rör sig ner eller uppåt
		int x = 250; // startposition på x-axeln
		int y = rand.nextInt(height-100);  // Bildens höjd är 100
		
		// Loopen gör att gubben rör sig inom fönstret
		while(true) {
			pw.showImage(image, x, y); // en metod av showImage som tar tre parametrar: image, x, y
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
			x += dx; 
			y += dy;
			if(x<0) {
				dx = -dx; // för varje x ska x gå tillbaka 
			}else if(x>width-100) {
				dx = -dx;
			
			}
		}
	}
	/* Programmet ritar ett fönster och hämtar en gubbe från katalogen images som placeras i
 	 * fönstret. Vidare gör programmet att gubben rör sig vänster till höger utan att lämna
 	 * fönstret. Denna gången rör sig gubben även i höjdled utan att lämna fönstret.
 	 */
	public void exercise1f() {
		PaintWindow pw = new PaintWindow();
		Random randNbr = new Random();
		ImageIcon image = new ImageIcon("images/gubbe.jpg");
		int width = pw.getBackgroundWidth();
		int height = pw.getBackgroundHeight();
		int dx = randNbr.nextInt( 7 )-3; // dx tilldelas en slumpmässig rörelse i x-led från -3 till 3
		int dy = randNbr.nextInt( 7 )-3; // dy tilldelas en slumpmässig rörelse i y-led från -3 till 3 
		int x = randNbr.nextInt( 501 );  // Slumpmässig startposition på x-axeln från 0 - 500
		int y = randNbr.nextInt(height-100);  // Bildens höjd är 100
		
		
		while(true) {
			pw.showImage(image, x, y);
			PaintWindow.pause(20); // pausa exekveringen i 20 ms innan nästa förflyttning
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
