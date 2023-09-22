public class App {
    public static void main(String[] args) {
        System.out.println(Fatorial.iterativoFatorial(5)); 
        System.out.println(Fatorial.recursivoFatorial(5)); 

        System.out.println("==== Inicio ===");
        TorreHanoi.moverDisco(3, 'A', 'B', 'C');
        System.out.println("=== Fim ===");
    
    }
}
