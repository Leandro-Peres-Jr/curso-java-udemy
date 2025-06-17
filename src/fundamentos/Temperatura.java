package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        //(ºF -32) * 5.0/9.0 = ºC
        final double n = 32;
        final double divisao = 5/9.0;
        double ºF = 100;
        double ºC = (ºF - n) * divisao;
        System.out.println(ºC + "ºC");
    }
}
