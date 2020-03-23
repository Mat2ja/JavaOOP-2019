package hr.fer.zemris.java.tecaj_1;

/**
 *
 * @author Matija
 */
public class Slika {

    private int sirina, visina;
    private boolean[][] elementi;

    public Slika(int sirina, int visina) {
        this.sirina = sirina;
        this.visina = visina;
        elementi = new boolean[visina][sirina];
    }

    public int getSirina() {
        return sirina;
    }

    public int getVisina() {
        return visina;
    }

    public void upaliElement(int x, int y) {
        elementi[y][x] = true;
    }

    public void ugasiElement(int x, int y) {
        elementi[y][x] = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder((sirina + 1) * visina);

        for (int y = 0; y < visina; y++) {
            for (int x = 0; x < sirina; x++) {
                sb.append(elementi[y][x] ? 'x' : '.');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public void crtaj(SadrziocTocaka lik) {
        for (int y = 0; y < visina; y++) {
            for (int x = 0; x < sirina; x++) {
                if (lik.sadrziTocku(x, y)) {
                    upaliElement(x, y);
                }

            }
        }
    }
}
