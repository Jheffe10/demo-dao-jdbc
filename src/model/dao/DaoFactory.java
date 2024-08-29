package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {//Classe auciliar responsável por instanciar os meus Daos
    //Operações/Métodos estaticas para instanciar o Dao. Não preciso instanciar a classe DaoFactory para instanciar os métodos dessa classe, basta chamar o nome da classe.nome metodo


    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());//Retorna um metodo da interface SellerDao, mas internamente instancia a classe SellerDaoJDBC, pois é ela que contém a implemntação dos métodos
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
