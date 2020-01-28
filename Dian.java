
package dian;

public class Dian {

   
    public static void main(String[] args) {
        Dian1 dian = new Dian1();

        dian.setAng1(10);
        dian.setAng2(2);

        System.out.println("Ang   1 :" + dian.getAng1());
        System.out.println("Angka 2  :" + dian.getAng2());

        System.out.println("Hasil Penjumlahan :" + dian.getPenjumlahan());
        System.out.println("Hasil Pengurangan :" + dian.getPengurangan());
        System.out.println("Hasil Perkalian   :" + dian.getPerkalian());
        System.out.println("Hasil Pemabagian :" + dian.getPembagian());
    }
    
}
