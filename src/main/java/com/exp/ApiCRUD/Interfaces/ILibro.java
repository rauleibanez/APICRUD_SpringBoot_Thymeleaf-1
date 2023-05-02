package com.exp.ApiCRUD.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exp.ApiCRUD.Model.Libro;

@Repository
public interface ILibro extends CrudRepository<Libro, Integer>{
    
}
