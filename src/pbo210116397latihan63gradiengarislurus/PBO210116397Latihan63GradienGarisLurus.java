/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Gradien Garis Lurus
 */
package pbo210116397latihan63gradiengarislurus;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat kdt1 = new Koordinat(2, 10, 5, 7);
        Koordinat kdt2 = new Koordinat(5, 1, 3, 12);

        System.out.println("Garis yang melalui titik (2,10) dan titik (5,7) memiliki gradien sebesar "
                + kdt1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan titik (3,12) memiliki gradien sebesar "
                + kdt2.hitungGradien());

    }
    
}
