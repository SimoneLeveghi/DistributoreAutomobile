import java.util.Random;

public class Automobile extends Thread {

    @Override
    public void run() {
        Random r = new Random();
        int tmp;

        while(true) {
            synchronized(Distributore.class) {
                if(Distributore.litriBenzina > 0) {
                    Distributore.litriBenzina -= Math.min((tmp = r.nextInt(31) + 20), Distributore.litriBenzina);
                    System.out.println(getName() + " ha estratto " + tmp + " litri di benzina");
                    System.out.println("Litri totali " + Distributore.litriBenzina);
                }
                else {
                    break;
                }
            }


        }
    }
}
