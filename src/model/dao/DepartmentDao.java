package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao { //Interface

    void insert(Department obj); //essa operação é responsável por inserir no banco de dados o objeto do parâmetro, no caso Department
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id); //Retorna um Department pesquisando pelo id
    List<Department> findAll(); //Retronar todos os departamentos em uma lista

}
