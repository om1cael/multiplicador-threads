public class Main {
    public static void main(String[] args) throws InterruptedException {
        Mult mult = new Mult();

        Thread thread = new Thread(() -> mult.multiplicar(5));
        Thread thread2 = new Thread(() -> mult.multiplicar(5));
        Thread thread3 = new Thread(() -> mult.multiplicar(5));
        Thread thread4 = new Thread(() -> mult.multiplicar(5));

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class Mult {
    private int valor = 1;

    public synchronized void multiplicar(int fator) {
        this.valor *= fator;
        this.getValor();
    }

    public synchronized void getValor() {
        System.out.println(this.valor);
    }
}