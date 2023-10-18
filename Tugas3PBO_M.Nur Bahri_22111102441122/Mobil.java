import greenfoot.*;

public class Mobil extends Actor {
    protected boolean mesin;
    
    public Mobil() {
        mesin = false;
    }
    
    public void act() {
        // Logika yang ingin Anda lakukan dalam setiap siklus aksi (act) objek Mobil
    }
    
    public void nyalakanMesin() {
        mesin = true;
    }
    
    public void matikanMesin() {
        mesin = false;
    }
}