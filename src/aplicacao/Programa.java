package aplicacao;

import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;
import modelo.modelo.dao.DaoFactory;

import java.util.Date;

public class Programa {

    public static void main(String[] args) {

        VendedorDao vendedorDao = DaoFactory.createVendedorDao();

        System.out.println("=== TESTE 1: Procurar vendedor pelo ID ===");
        Vendedor vendedor = vendedorDao.procurarId(3);
        System.out.println(vendedor);
    }
}
