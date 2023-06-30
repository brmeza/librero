public class Raices {
    private double a;
    private double b;
    private double c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices(double s1, double s2) {
        System.out.println("solucion 1: " + s1);
        System.out.println("solucion 2: " + s2);
    }

    public void obtenerRaiz(double su) {
        System.out.println("solucion unica: " + su);
    }

    public double getDiscriminante() {
        double resultado = this.b * this.b - 4.0 * this.a * this.c;
        return resultado;
    }

    public boolean tieneRaices() {
        double discriminante = this.getDiscriminante();
        return discriminante >= 0.0;
    }

    public boolean tieneRaiz() {
        double discriminante = this.getDiscriminante();
        return discriminante == 0.0;
    }

    public void calcular() {
        double discriminate = this.getDiscriminante();
        System.out.println(discriminate);
        boolean tr = this.tieneRaiz();
        boolean trs = this.tieneRaices();
        System.out.println("" + tr + "   " + trs);
        double s1;
        if (tr) {
            s1 = -this.b / (2.0 * this.a);
            this.obtenerRaiz(s1);
        } else if (trs) {
            s1 = (-this.b + Math.sqrt(discriminate)) / (2.0 * this.a);
            double s2 = (-this.b - Math.sqrt(discriminate)) / (2.0 * this.a);
            this.obtenerRaices(s1, s2);
        } else {
            System.out.println("no tiene solucion...");
        }

    }
}
