<<<<<<< HEAD
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Raices r1 = new Raices(1.0, 4.0, 4.0);
        r1.calcular();
=======
import java.io.PrintStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Libro lib1 = new Libro();
        Libro lib2 = new Libro();
        lib1.setAutor("CAROLINA");
        lib1.setIsbn("SDWAQ123");
        lib1.setTitulo("MI MENTE MI PEOR ENEMIGA");
        lib1.setNum_pag(332);
        lib2.setAutor("NATHALIA ");
        lib2.setIsbn("12QWAQ1");
        lib2.setTitulo("EL ANGEL DE MI NOVIO");
        lib2.setNum_pag(2876);
        System.out.println(lib1.toString());
        System.out.println(lib2.toString());
        PrintStream var10000;
        String var10001;
        if (lib1.getNum_pag() > lib2.getNum_pag()) {
            var10000 = System.out;
            var10001 = lib1.getTitulo();
            var10000.println("el libro " + var10001 + " tiene mas paginas que el libro " + lib2.getTitulo());
        } else {
            var10000 = System.out;
            var10001 = lib2.getTitulo();
            var10000.println("el libro " + var10001 + " tiene mas paginas que el libro " + lib1.getTitulo());
        }

>>>>>>> 0437fe3240428e86484ce932daad1d60766545fe
    }
}