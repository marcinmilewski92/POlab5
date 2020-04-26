import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> mapa = new HashMap<String, String>();


        String login;
        String haslo;

        while(true) {

            System.out.print("Wprowadź login: ");
            login = reader.readLine();

            if(login.equals("q")) {
                break;
            }


            System.out.print("Wprowadź hasło: ");
            haslo = reader.readLine();

            mapa.put(login, haslo);



        }

        System.out.print("Podaj jeden z wcześniej podanych loginów: ");
        String passChecker = reader.readLine();

        if(mapa.containsKey(passChecker)) {
            System.out.println("Hasło do przyporządkowane do tego loginu: " + mapa.get(passChecker));
        } else {
            System.out.println("Podany login nie istnieje");
        }





    }




}
