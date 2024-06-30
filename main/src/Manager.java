import java.util.ArrayList;

public class Manager extends Employee{
    public Manager(String Imie,String Nazwisko,String Adres,String email,String Pesel,int rokZatrudnienia){
        super(Imie, Nazwisko, Adres, email, Pesel, rokZatrudnienia);
    }

    public ArrayList<Goal> goals = new ArrayList<>();

    public void addGoals(Goal goals){
        this.goals.add(goals);
    }
}
