public class Main { //  Burada deneme yapacağız. //  21

    public static void main(String[] args) {

        //Sekil sekil = new("Sekil"); // Hata verdi. Çünkü abstract classlardan tıpkı interfaceler gibi obje oluşturamayız. //  22

        Sekil sekil; // Abstract classtan bir referans ürettik. //  27
        sekil = new Kare("Kare2", 6); /* Abstract classtan ürettiğimimiz referans alt sınıflara referans
                                                    olarak eşitleyebiliyoruz. */ // 28

        Kare kare1 = new Kare("Kare1", 5); //  23
        Daire daire1 = new Daire("Daire1", 3); //  24

        kare1.alan_hesapla(); //  25
        daire1.alan_hesapla(); //  26
        sekil.alan_hesapla(); //  29

        // Son olarak alt classlardan Kare.java'da cevre_hesapla() adlı metodu ekliyoruz. //  30

        kare1.cevre_hesapla(); //  32

    }

}
