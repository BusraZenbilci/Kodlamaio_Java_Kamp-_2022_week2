public class Main {

    public static void main(String[] args) {


    }

    public static void sayiBulmaca(){
        int [] sayilar = new int [] {1,2,3,4,5};
        int aranacak = 6;
        boolean varMi=false;

        for(int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
            if(varMi) {
                mesajVer("Sayı mevcut: " + aranacak);

            }
            else{
                mesajVer("Sayı mevcut değildir: " + aranacak);
            }


    }

    public static void mesajVer (String mesaj) {
        System.out.println( mesaj );
    }
}
