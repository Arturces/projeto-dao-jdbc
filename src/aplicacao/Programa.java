package aplicacao;

import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;
import modelo.modelo.dao.DaoFactory;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        VendedorDao vendedorDao = DaoFactory.createVendedorDao();

        System.out.println("=== TESTE 1: Procurar vendedor pelo ID ===");
        Vendedor vendedor = vendedorDao.procurarId(3);
        System.out.println(vendedor);

        System.out.println("\n=== TESTE 2: Procurar vendedor pelo DEPARTAMENTO ===");
        Departamento departamento = new Departamento(2, null);
        List<Vendedor> list = vendedorDao.procurarPorDepartamento(departamento);
        for (Vendedor obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: Procurar todos os vendedores ===");
        list = vendedorDao.procurarTodos();
        for (Vendedor obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 4: Inserir vendedores ===");
        Vendedor novoVendedor = new Vendedor(null, "Rafa", "rafa@gmail.com", new Date(), 4000.0, departamento);
        vendedorDao.insert(novoVendedor);
        System.out.println("Inserido! Novo id = " + novoVendedor.getId());

        System.out.println("\n=== TESTE 5: Atualizar vendedores ===");
        vendedor = vendedorDao.procurarId(1);
        vendedor.setNome("Jogador numero 1");
        vendedorDao.update(vendedor);
        System.out.println("Atualização completa!");

        System.out.println("\n=== TESTE 6: Deletando vendedores ===");
        System.out.println("Entre com o ID para a deleção: ");
        int id = entrada.nextInt();
        vendedorDao.deletarId(id);
        System.out.println("Deleção comleta!");

        entrada.close();
    }

}

