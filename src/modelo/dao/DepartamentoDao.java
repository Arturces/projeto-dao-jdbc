package modelo.dao;

import modelo.entidades.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void insert(Departamento obj);
    void update(Departamento obj);
    void deletarId(Integer id);
    Departamento procurarId(Integer id);
    List<Departamento> procurarTodo();

}
