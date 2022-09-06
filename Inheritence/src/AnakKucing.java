/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class AnakKucing extends IndukKucing { 
    double nilaimax=99.9;
    
    String nama ="Cici";
    String hobi = "tidur";
    
    public void Cetak() {
        System.out.println("Kucing ini adalah jenis " + super.Jenis);
        System.out.println("Memiliki nama " + nama);
        System.out.println("Mempunyai berat badan " + super.BB);
        System.out.println("Kucing ini memiliki hobi" + hobi );
        super.makanan();
    }
}
    

