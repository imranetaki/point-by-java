public class point {
    private int abcisse;
    private int ordonne;

    public point() {
        this.abcisse = 0;
        this.ordonne = 0;
    }

    public point(int abcisse, int ordonne) {
        this.abcisse = abcisse;
        this.ordonne = ordonne;
    }

    public int getAbcisse() {
        return abcisse;
    }

    public void setAbcisse(int value) {
        this.abcisse = value;
    }

    public int getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(int value) {
        this.ordonne = value;
    }

    public double distance(point point) {
        double d = Math.sqrt(Math.pow(this.abcisse - point.abcisse, 2) + Math.pow(this.ordonne - point.ordonne, 2));
        return d;
    }

    public double norm() {
        double n = Math.sqrt(Math.pow(this.abcisse, 2) + Math.pow(this.ordonne, 2));
        return n;
    }


}
