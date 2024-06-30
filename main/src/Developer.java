import java.util.ArrayList;

public class Developer extends Employee{

    public ArrayList<Technology> technologies = new ArrayList<>();

    public Developer(String Imie,String Nazwisko,String Adres,String email,String Pesel,int rokZatrudnienia){
        super(Imie,Nazwisko, Adres, email, Pesel, rokZatrudnienia);
    }

    public void addTechnology(Technology technology){
        this.technologies.add(technology);
    }
}
