
package dian;

public class Dian1 {
    
    int ang1;
    int ang2;
    int penjumlahan;
    int perkalian;
    int pengurangan;
    int pembagian;

    public int getAng1() {
        return ang1;
    }

    public void setAng1(int ang1) {
        this.ang1 = ang1;
    }

    public int getAng2() {
        return ang2;
    }

    public void setAng2(int ang2) {
        this.ang2 = ang2;
    }
    
    public int getPenjumlahan (){
        penjumlahan = ang1 + ang2; 
        return penjumlahan;
    }
    public void setPenjumalahan(int penjumlahan){
        this.penjumlahan = penjumlahan;
    }
    
    public int getPerkalian(){
        perkalian = ang1 * ang2;
        return perkalian;
    }
    public void setPerkalian(int perkalian){
        this.perkalian=perkalian;
    }
    public int getPengurangan(){
        pengurangan = ang1 - ang2;
        return pengurangan;
    }
    public void setPengurangan (int pengurangan){
        this.pengurangan=pengurangan;
    }
    public int getPembagian (){
        pembagian = ang1 / ang2;
        return pembagian;
    }
    public void setPembagian (int pembagian){
        this.pembagian=pembagian;
    }

}
