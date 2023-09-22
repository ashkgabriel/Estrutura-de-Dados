public class TorreHanoi {

    public static void moverDisco(int nDiscos, char origem, char destino, char auxiliar) {
        if (nDiscos == 1) {
            System.out.println("Mover Disco " + nDiscos + " de " + origem + " para " + destino);
        } else {
            moverDisco(nDiscos - 1, origem, auxiliar, destino);
            System.out.println("Mover Disco " + nDiscos + " de " + origem + " para " + destino);
            moverDisco(nDiscos - 1, auxiliar, destino, origem);
        }
    }
}