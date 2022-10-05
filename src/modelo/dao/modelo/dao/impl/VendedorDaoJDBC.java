package modelo.dao.modelo.dao.impl;

import db.DB;
import db.DbException;
import modelo.dao.VendedorDao;
import modelo.entidades.Departamento;
import modelo.entidades.Vendedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class VendedorDaoJDBC implements VendedorDao {

    private Connection conn; //fazendo uma depencia de conexao para o JDBC para ultilzar dentro das proprias operaçoes

    public VendedorDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Vendedor obj) {

    }

    @Override
    public void update(Vendedor obj) {

    }

    @Override
    public void deletarId(Integer id) {

    }

    @Override
    public Vendedor procurarId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE seller.Id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Departamento dep = new Departamento();
                dep.setId(rs.getInt("DepartmentId"));
                dep.setNome(rs.getString("DepName"));
                Vendedor obj = new Vendedor();
                obj.setId(rs.getInt("Id"));
                obj.setNome(rs.getString("Name"));
                obj.setEmail(rs.getString("Email"));
                obj.setSalarioBase(rs.getDouble("BaseSalary"));
                obj.setAniversario(rs.getDate("BirthDate"));
                obj.setDepartamento(dep);
                return obj;
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Vendedor> procurarTodo() {
        return null;
    }
}
