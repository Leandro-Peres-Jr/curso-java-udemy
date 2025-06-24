package fundamentos;

public class PrimitivoVsObjeto {
    public static void main(String[] args) {

        String s = "texto";
        s.toUpperCase();

        // Wrappers são a versão objeto dos tipos primitivos
        int a = 123;
        System.out.println(a);

        // Tudo dentro de java é objeto exceto os 8 tipos primitivos byte, short, int, long, float, double, char, boolean.
    }
}
