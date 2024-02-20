public class Kare extends Sekil { // Inheritance yaptık. Kare sınıfını şekil sınıfından türettik.  //  10

    private int kenar; // kenar özelliğini ekledik. Aşağıdaki constructor'a da ekledik.  //  13

    public Kare(String isim, int kenar) { /* Metod overridetan sonra yeniden hata aldık. Bu sefer de yine hata sembolüne tıklayarak
                                  abstract class constructorını oluşturduk. */  //  12
        super(isim);
        this.kenar = kenar;
    }



    @Override //  Şekild classını extends ettiğimizde hata çıktı. Hata üzerine tıklayarak abstract metodları override et dedik.  //  11
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı " + (kenar * kenar) + " dir. "); //  Metodun içini yazdık.  //  14

    }

    public void cevre_hesapla() { //  31

        System.out.println(getIsim() + " çevresi : " + (4 * kenar) );

    }
}
