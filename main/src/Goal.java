public class Goal {
    String nazwa;
    int rok;
    int bonus;
    int miesiac;
    int dzien;

    Goal(int rok, int miesiac, int dzien, String nazwa, int bonus){
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
        this.nazwa = nazwa;
        this.bonus = bonus;
    }

}
