package carmo.gustavo.array_test_drive;

import carmo.gustavo.models.Conta;

public class ArrayTestDrive {
    public static void main(String[] args) {
        //Array para tipos primitivos
        int [] numeros = new int[5];
        numeros[0] = 6;
        numeros[1] = 5;
        numeros[2] = 67;
        numeros[3] = 68;
        numeros[4] = 96;

        System.out.println("Passa pelos elementos: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição:"+i+" Valor:"+numeros[i]);
        }

        //Array para objetos
        Conta[] contas = new Conta[]{
                new Conta(15.),
                new Conta(89.),
                new Conta(),
                null,
                new Conta(900.)};

        System.out.println("===================");
        System.out.println("Passa pelas contas:");
        for (Conta conta: contas) {
            System.out.println(conta);

        }
    }
}
