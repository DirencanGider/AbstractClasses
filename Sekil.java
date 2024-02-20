/*

Abstract classların içerisinde hem özelliklerimiz, hem normal metodlarımız hem de abstract metodlarımız bulunabiliyor.
Abstract metodlar gövdesiz metodlardır. Yani içeriği boş metodlardır. Abstract class'ın alt classlarında bu metodlar
kesinkez yazılmak zorundadır. Fakat abstract metodlar abstract classlarda içi boş olarak tanımlandığı için, alt classlarda
yazılırken iç kısımları (gövdeleri) kendi ihtiyaçları doğrultusunda farklı farklı doldurulabilir.
Örneğin biz bu projede abstract class içerisinde alan_hesapla() isimli bir abstract (gövdesiz) metod oluşturacağız.
Sonrasında da bu abstract class'a bağlı Kare ve Daire classları oluşturacağız. Haliyle bu alt classlarda alan_hesapla()
metodu zorunlu olarak kullanılacak. Fakat Kare ve Dairenin alanları farklı olduğu için metod gövdeleri farklı içeriklerle,
farklı formüllerle doldurulacak.

 */
public abstract class Sekil { // abstract anahtar kelimesiyle bu class'ı abstract class'a çevirmiş olduk. //  1

    // Bu class'ın içinde overwrite edilmesi gerekmeyen metodlar ve abstract metodlar bir arada bulunacak. //  2

    // Abstract classlara özellik eklenebiliyor. Aşağıda ekleyelim. //  3

    private String isim; //  4

    public Sekil(String isim) { // Constructor oluşturdu.  //  5
        this.isim = isim;
    }

    public void ismini_soyle () { // Abstract olmayan bir metod yazdık.  //  6

        System.out.println("Bu obje " + isim + " objesidir.");
    }

    /* Şimdi bir soyut metod yazaacağız. Bu soyut metodu (abstract (gövdesiz) metodu) buraya yazdığımızda, bu abstract
       class altında türettiğimiz alt sınıflar mutlaka kendilerine göre yazmak zorunda kalacaklar. */  //  7

    abstract void alan_hesapla(); // Bu metodu alt sınıfların hepsi yazmak zorunda kalacak.  //  8

    public String getIsim() { // Getter ve Setter metodları generate ettik.  //  9
        return isim;
    }

    public void setIsim(String isim) { // Getter ve Setter metodları generate ettik.  //  9
        this.isim = isim;
    }
}
