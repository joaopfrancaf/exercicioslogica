import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios01 {
    public static void main (String[] args) throws IOException {
        String estrela = "";
        int num = 5;

        for (int cont = 0; cont < num; cont++ ) {
            estrela += "*\n";

            for (int cont2 = 0;cont2 <= cont ;cont2++) {
                estrela += " ";
            }
        }

        System.out.println(estrela);

        Scanner scanner = new Scanner (System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa menoraltura = new Pessoa();
        Pessoa sexdamaioraltura = new Pessoa();
        int numhomems = 0;

        for (int cont = 0; cont <= 2; cont++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("entre o sexo da pessoa:" + cont);
            pessoa.setSexo((char)System.in.read());
            System.out.println("entre a altura da pessoa:" + cont);
            pessoa.setAltura(scanner.nextDouble());

            pessoas.add(pessoa);

            //if menor pessoa
            if (pessoas.get(cont).getAltura() <= pessoas.get(0).getAltura()) {
                menoraltura = pessoas.get(cont);
            }
            //quantos masculinos
            if (pessoas.get(cont).getSexo() == 'm') {
                numhomems++;
            }
            //o sex da pessoa mais alta
            if (pessoas.get(cont).getAltura() >= pessoas.get(0).getAltura()) {
                sexdamaioraltura = pessoas.get(cont);
            }

        }

        System.out.println("a menor altura do arraylist é:" + menoraltura.getAltura());

        System.out.println("quantidade de homens:" + numhomems);

        System.out.println("o sex da pessoa mais alta" + sexdamaioraltura.getSexo());
    }
}
