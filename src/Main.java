public class Main {

    private String nome;

    /*public static void main (String[] args) {
        String var = "gabsxsss";
        imprimeFormatado(var);
    }*/

    public Main () {
        this.nome = "";
    }

    public void setNome (String nome) {
        this.nome += nome;
    }

    public String getNome () {
        return this.nome;
    }

    public static void imprimeFormatado (String var) {

        for (int count = 0; count != var.length(); count++) {
            System.out.print(var.charAt(count));
            System.out.print("\n");
            for (int count1 = 0; count1 <= count; count1++) {
                System.out.print(" ");
            }
        }

    }

    public String voltaFormatado (String var) {

        for (int count = 0; count != var.length(); count++) {
            setNome(String.valueOf(var.charAt(count)));
            setNome("\n");
            for (int count1 = 0; count1 <= count; count1++) {
                setNome(" ");
            }
        }

        return this.nome;
    }

}
