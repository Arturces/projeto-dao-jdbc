package modelo.dao;

import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

import java.util.List;

public interface VendedorDao {
    void insert(Vendedor obj);
    void update(Vendedor obj);
    void deletarId(Integer id);
    Vendedor procurarId(Integer id);
    List<Vendedor> procurarTodos();
    List<Vendedor> procurarPorDepartamento(Departamento departamento);
}
