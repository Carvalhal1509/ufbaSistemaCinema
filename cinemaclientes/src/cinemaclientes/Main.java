package cinemaclientes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pc = 1;
        ArrayList<Parimpar> listaCinema = new ArrayList<Parimpar>();
        Scanner sc = new Scanner(System.in);
        while (pc < 2) { System.out.println("============================================="
                + System.lineSeparator()
                +"Efetuar compra de ingresso Cinema Cinemark "
                + pc +":"
                + System.lineSeparator());
            System.out.println("Digite seu nome: ");
            String idade = sc.next();
            System.out.println("Digite a sua idade: ");
            String nome = sc.next();
            System.out.println("O ingresso é numero par?(true ou false): ");
            boolean parImpar = sc.nextBoolean();
            
            
            
            if(pc > 2) { listaCinema.add(new Parimpar(nome, idade, parImpar));
            }else { Parimpar novoCinema = new Parimpar();
                novoCinema.setNome(nome);
                novoCinema.setIdade(idade);
                novoCinema.setPcUsado(parImpar);
                listaCinema.add(novoCinema);
            } pc++;
        } sc.close();
        System.out.println(Parimpar.imprimir(listaCinema.get(0), listaCinema.get(1), listaCinema.get(2), listaCinema.get(3))); 
    }
}
