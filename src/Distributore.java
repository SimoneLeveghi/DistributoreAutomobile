public class Distributore {
    protected static int litriBenzina = 2000;

    public static void main(String[] args) {
        Automobile a1 = new Automobile();
        Automobile a2 = new Automobile();
        Automobile a3 = new Automobile();
        Automobile a4 = new Automobile();

        a1.start();
        a2.start();
        a3.start();
        a4.start();
    }
}