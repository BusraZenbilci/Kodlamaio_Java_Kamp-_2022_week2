public class Main {

    public static void main(String[] args) {
     String mesaj ="Weather is cold today. ";
     String yenimesaj = mesaj.substring(0,5);
        System.out.println(yenimesaj);

        int sayi = topla(5,7);
        System.out.println(sayi);

        int toplam = topla2(2,3,4,5,6,7,10);
        System.out.println(toplam);

    }

    public static void ekle(){
        System.out.println("Eklendi.");
    }

    public static void sil(){
        System.out.println("Silindi.");
    }
    public static void guncelle(){
        System.out.println("Güncellendi.");
    }

    public static int topla(int a , int b){
        return 5;
    }

    public static String sehirVer(){
        return "Ankara";
    }

    public static int topla2 (int... sayilar) { //variable arguments
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }


}
