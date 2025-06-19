package fundamentos;

import java.lang.reflect.AnnotatedArrayType;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario

        // Tipos numéricos inteiros

        byte anosDeEmpresa = 23; // De -128 à 127.

        short numerosDeVoos = 542; // De -32768 à 32767.

        int id = 56789; // De -2.147.483.648 à 2.147.483.647.

        long pontosAcumulados = 3_234_845_223L; // De -9.223.372.036.854.775.808 à 9.223.372.036.854.775.807. É necessario um "L" no final para identificar um valor LONG.

        // Tipos numéricos reais

        float salario = 11_445.44F; // É necessário colocar um "F" no final para identificar o valor FLOAT.

        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano

        boolean estaDeFerias =  false; // true ou false

        // Tipo caractere

        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numerosDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println("O id " + id + "ganha --> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
