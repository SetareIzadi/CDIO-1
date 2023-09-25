import java.util.Random;
public class Terninger {

    public static void main(String[] args) {
        // Opret et Random objekt
        Random random = new Random();

        // Simuler kast med to terninger
        int førsteTerning = random.nextInt(6) + 1;
        int andenTerning = random.nextInt(6) + 1;

        // Udskriv resultaterne
        System.out.println("Første terning: " + førsteTerning);
        System.out.println("Anden terning: " + andenTerning);
    }
}


