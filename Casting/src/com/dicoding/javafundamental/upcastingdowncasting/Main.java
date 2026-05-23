// Kelas superclass
class Hewan {
    public void makan() {
        System.out.println("Hewan sedang makan");
    }
}

// Kelas subclass
class Kucing extends Hewan {

    // Override method makan()
    @Override
    public void makan() {
        System.out.println("Kucing sedang makan");
    }

    // Method khusus milik Kucing
    public void meow() {
        System.out.println("Meow...");
    }
}

// Kelas utama
public class Main {
    public static void main(String[] args) {

        // Membuat objek Kucing
        Kucing anggora = new Kucing();

        // Upcasting secara implisit
        Hewan hewan = anggora;

        // Upcasting secara eksplisit
        hewan = (Hewan) anggora;

        // Memanggil method dari superclass
        hewan.makan();

        // Membuat objek Kucing dengan referensi Hewan
        Hewan hewan2 = new Kucing();

        // Downcasting dari Hewan ke Kucing
        ((Kucing) hewan2).meow();
    }
}