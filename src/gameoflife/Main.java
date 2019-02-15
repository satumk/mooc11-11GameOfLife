package gameoflife;


public class Main {

    public static void main(String[] args) {
        // voit tehdä tänne testikoodia

        // Jos ohjelmassa on useampi luokka, joka sisältää main-metodin, voi
        // halutun main metodin käynnistää valitsemalla luokka vasemmalla
        // olevasta projektilistauksesta ja painamalla oikealla
        // hiirennapilla "Run File".
        GameOfLife gol = new GameOfLife(4, 4);

int[][] taulukko = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}};

System.out.println(gol.elossaOleviaNaapureita(taulukko, 0, 0));
System.out.println(gol.elossaOleviaNaapureita(taulukko, 1, 1));
System.out.println(gol.elossaOleviaNaapureita(taulukko, 2, 2));
System.out.println(gol.elossaOleviaNaapureita(taulukko, 3, 3));
    }

}
