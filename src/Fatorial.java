public class Fatorial {

    // Método recursivo

    public static int recursivoFatorial (int n) {
        if (n > 1) {
            return n * recursivoFatorial(n - 1);
        }
        else {
            return 1;
        }
    }

    // Método iterativo
    
    public static int iterativoFatorial (int n) {
        int fatorial = 1;
        for (int i = 1; i <=n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

}