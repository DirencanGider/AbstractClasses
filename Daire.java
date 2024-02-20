public class Daire extends Sekil { //  15

    private int yaricap; //  18

    public Daire(String isim, int yaricap) { //  17
        super(isim);
        this.yaricap = yaricap; // yaricap'ı hem buraya hem de parantez içine sonradan ekledik.  //  19
    }

    @Override
    void alan_hesapla() { //  16

        System.out.println(getIsim() + " alanı " + (Math.PI * (yaricap * yaricap)) + " dir. "); //  20


    }





}
