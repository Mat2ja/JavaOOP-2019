package hr.fer.zemris.java.tecaj_1;

/**
 *
 * @author Matija
 */
public class Pravokutnik extends GeometrijskiLik {

    private int x, y, sirina, visina;

    public Pravokutnik(String ime, int x, int y, int sirina, int visina) {
        super(ime);
        this.x = x;
        this.y = y;
        this.sirina = sirina;
        this.visina = visina;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSirina() {
        return sirina;
    }

    public int getVisina() {
        return visina;
    }

    @Override
    public double getOpseg() {
        return 2 * (sirina * visina);
    }

    @Override
    public double getPovrsina() {
        return sirina * visina;
    }

    @Override
    public boolean sadrziTocku(int x, int y) {
        if (x < this.x || x >= this.x + sirina) {
            return false;
        }
        if (y < this.y || y >= this.y + sirina) {
            return false;
        }
        return true;
    }

}
