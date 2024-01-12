import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {


        Pessoa renan = new Pessoa("Renanzin", 33);
      //  renan.setNome("Renanzin");
      // renan.setIdade(33);

        Pessoa juliane = new Pessoa();
        juliane.setNome("Juliane");
        juliane.setIdade(33);

        Pessoa luca =  new Pessoa();
        luca.setNome("Luca");
        luca.setIdade(1);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(renan);
        listaDePessoas.add(juliane);
        listaDePessoas.add(luca);


        System.out.println("Tamanho da Lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista Completa: " + listaDePessoas);






    }
}