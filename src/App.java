import model.LuasKerucut;
import java.util.Scanner;
public class App {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String pesan = "Carissa Chandra";
        System.out.println(pesan);
        System.out.print("============================\n");
        
        Scanner keyboard = new Scanner(System.in);
        LuasKerucut luaskerucut1 = new LuasKerucut();
        System.out.print("Masukkan panjang radius = ");
        luaskerucut1.rad= keyboard.nextInt();
        System.out.print("Masukkan panjang garis pelukis = ");
        luaskerucut1.garpel= keyboard.nextInt();
        luaskerucut1.Kerucut();
    }
}