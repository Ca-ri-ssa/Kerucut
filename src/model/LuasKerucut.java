package model;
public class LuasKerucut {
    public int rad, garpel;
    public double phi = 3.14;
    public void Kerucut() 
    {
        double luas = phi*rad+(rad+garpel);
        System.out.println("Luas Kerucut = " + luas + " cm");
    }
}