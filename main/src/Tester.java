import java.util.ArrayList;

public class Tester extends Employee{

    public Tester(String Imie,String Nazwisko,String Adres,String email,String Pesel,int rokZatrudnienia){
        super(Imie,Nazwisko, Adres, email, Pesel, rokZatrudnienia);
    }

    public ArrayList<String> tests = new ArrayList<>();

    public void addTestType(String test){
        this.tests.add(test);
    }
}
