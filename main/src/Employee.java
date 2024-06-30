import java.util.ArrayList;

public class Employee{
    String Imie;
    String Nazwisko;
    String Adres;
    String email;
    String Pesel;
    int rokZatrudnienia;
    int salary = 300;
    ArrayList<Employee> employees = new ArrayList<>();

    public Employee(String Imie,String Nazwisko,String Adres,String email,String Pesel,int rokZatrudnienia) {
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Adres = Adres;
        this.email = email;
        this.Pesel = Pesel;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    public int calculateSalary(){
        int pensjaPodstawowa = salary;
        int rok = 2024;
        int miesiac = 4;
        int przepracowal = rok - rokZatrudnienia;

        System.out.println(przepracowal);
        for(int i = 0; i<przepracowal; i++){
            pensjaPodstawowa+=1000;
        }
        if(this instanceof Developer){
            Developer developer = (Developer) this;
            for(Technology technology : developer.technologies){
                pensjaPodstawowa+= technology.bonus;
            }
        }
        else if(this instanceof Tester){
            Tester tester = (Tester) this;
            pensjaPodstawowa += (300*tester.tests.size());
        }
        else if(this instanceof Manager){
            Manager manager = (Manager) this;
            for(Goal goal :manager.goals){
                if(goal.rok == rok && goal.miesiac == miesiac){
                    pensjaPodstawowa += goal.bonus;
                }
            }
        }

        return pensjaPodstawowa;
    }
}
