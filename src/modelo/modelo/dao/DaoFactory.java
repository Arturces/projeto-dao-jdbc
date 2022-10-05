package modelo.modelo.dao;

import db.DB;
import modelo.dao.VendedorDao;
import modelo.dao.modelo.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
    public static VendedorDao createVendedorDao(){
        return new VendedorDaoJDBC(DB.getConnection());
    }
}
