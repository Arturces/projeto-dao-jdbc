package aplicacao;

import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;
import modelo.modelo.dao.DaoFactory;

import java.util.List;

public class Programa {

    public static void main(String[] args) {

        VendedorDao vendedorDao = DaoFactory.createVendedorDao();

        System.out.println("=== TESTE 1: Procurar vendedor pelo ID ===");
        Vendedor vendedor = vendedorDao.procurarId(3);
        System.out.println(vendedor);

        System.out.println("\n=== TESTE 2: Procurar vendedor pelo DEPARTAMENTO ===");
        Departamento departamento = new Departamento(2, null);
        List<Vendedor> list = vendedorDao.procurarPorDepartamento(departamento);
        for (Vendedor obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: Procurar tos os vendedores ===");
        list = vendedorDao.procurarTodos();
        for (Vendedor obj : list){
            System.out.println(obj);
        }

    }
}
