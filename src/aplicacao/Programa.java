package aplicacao;

import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

import java.util.Date;

public class Programa {

    public static void main(String[] args) {

        Departamento obj = new Departamento(1,"Livros");

        Vendedor vendedor = new Vendedor(20,"Artur","artur@gmail.com", new Date(), 2000.0, obj);

        System.out.println(vendedor);
    }
}
