public class oop {
        //deklarasi property
        double panjang, lebar,alas, tinggi ;
        double luas_persegi;

    public static void main(String[] args) {
//pembuatan objek baru
        oop bangun_ruang = new oop();
//memanggil void
        bangun_ruang.isi();
        bangun_ruang.operasi();
        bangun_ruang.tampil();
    }
    //mengisi property
    void isi(){
        panjang=23;
        lebar=2;
    }
    //mengoperasikan komponen
    void operasi(){
        luas_persegi=panjang*lebar;
    }
    //menampilkan hasil
    void tampil(){
        System.out.print("hasil="+luas_persegi);
    }
}
