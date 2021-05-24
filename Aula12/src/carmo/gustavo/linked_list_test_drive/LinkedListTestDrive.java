package carmo.gustavo.linked_list_test_drive;

import carmo.gustavo.models.Conta;
import carmo.gustavo.models.Pessoa;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa("Midoria","999"));
        pessoas.add(new Pessoa("Bakugo","998"));
        pessoas.add(new Pessoa("Todoroki","997"));
        pessoas.add(0,new Pessoa("Uraraka","1000"));
        pessoas.addFirst(new Pessoa("All Might","001"));

        System.out.println("Peesoas:");
        pessoas.forEach(pessoa -> System.out.println(pessoa));

        LinkedList<Conta> contas = new LinkedList<>();
        contas.addAll(Arrays.asList(new Conta(10), new Conta(20), new Conta(25)));
        System.out.println("Passa pela lista de Contas:");
        contas.forEach(conta -> System.out.println(conta));

        System.out.println("Passando pelos elementos com o iterator:");
        Iterator<Conta> iterator = contas.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
