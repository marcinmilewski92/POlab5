import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapyScanner {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> mapa = new HashMap<String, String>();


        String login;
        String haslo;

        while(true) {

            System.out.print("Wprowadź login: ");
            login = scanner.nextLine();

            if(login.equals("q")) {
                break;
            }


            System.out.print("Wprowadź hasło: ");
            haslo = scanner.nextLine();

            mapa.put(login, haslo);



        }

        System.out.print("Podaj jeden z wcześniej podanych loginów: ");
        String passChecker = scanner.nextLine();

        if(mapa.containsKey(passChecker)) {
            System.out.println("Hasło do przyporządkowane do tego loginu: " + mapa.get(passChecker));
        } else {
            System.out.println("Podany login nie istnieje");
        }

        scanner.close();



    }




}
