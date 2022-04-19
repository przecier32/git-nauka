import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apteka {


    public static void main(String[] args) {

        PharmacistAccount.printPharm();

        List<Patient> pacjent = new ArrayList<Patient>();
        Scanner scan = new Scanner(System.in);
        int switchNum;

        System.out.println("MENU");
        System.out.println("1. Dodaj pacjenta.");
        System.out.println("2. Napisz cos.");
        System.out.println("3. Tu jeszcze nic nie ma.");
        System.out.println();
        switchNum = scan.nextInt();

        switch (switchNum) {
            case 1:
                if (Patient.verifyPassword()) {

                    for (int i = 0; i < 2; i++) {

                        Patient patient = new Patient();

                        patient.addPatient();
                        pacjent.add(patient);


                    }
                };
                for (Patient p : pacjent) p.printPatient();

                break;
            case  2:
                System.out.println("Instrukcja 2.");
                break;
            default:
                System.out.println("Cos nie pyklo :(");

        }





    }
}
