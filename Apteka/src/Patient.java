import java.util.Objects;
import java.util.Scanner;

public class Patient {
    //id, wiek, imie, nazwisko
    private int wiek;
    private String name;
    private String surname;
    Scanner scanner = new Scanner(System.in);


    Patient () {

        name = "";
        surname = "";
        wiek = 0;

    }

    static boolean verifyPassword() {
        Scanner scanner2 = new Scanner(System.in);
        boolean b = false;

        System.out.println("Podaj haslo kasjera: ");
        String haslo = scanner2.nextLine();

        if (Objects.equals(haslo, "qwerty")) {
            b = true;
        } else {
            System.out.println("Bledne haslo!");
        }

        return b;
    }

     public void addPatient(){


        System.out.println("Podaj imie pacjenta: ");
        String a = scanner.nextLine();
        setName(a);

        System.out.println("Podaj nazwisko pacjenta: ");
        a = scanner.nextLine();
        setSurname(a);

        System.out.println("Podaj wiek pacjenta: ");
        Integer b = scanner.nextInt();
        setWiek(b);

    }

    void printPatient() {
        System.out.println("Pacjent " + getName() + " " + getSurname() + " ma " + getWiek() + " lat");
    }

    public String getName() {
         return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
