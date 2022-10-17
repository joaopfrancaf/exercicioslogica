import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicios {

    public static void main (String[] args) {
        ArrayList<Jogador> listadejogadores = new ArrayList<>();
        ArrayList<Jogador> jogadormaiordeidade = new ArrayList<>();;

        for (int i = 0; i <=10; i++) {
            int randomNumIdade = ThreadLocalRandom.current().nextInt(10, 20 + 1);
            double randomaltura = ThreadLocalRandom.current().nextDouble(1.5, 1.10 + 1);
            Jogador obj = new Jogador(randomaltura, randomNumIdade, "");
            listadejogadores.add(obj);
        }

        //separa quantos maiores de idade (18)
        for (int i = 0; i <=10; i++) {
            if (listadejogadores.get(i).getIdade() >= 18 ) {
                jogadormaiordeidade.add(listadejogadores.get(i));
            }
        }

        System.out.println("quantos maiores de idade: " + jogadormaiordeidade.toArray().length);
    }
}
