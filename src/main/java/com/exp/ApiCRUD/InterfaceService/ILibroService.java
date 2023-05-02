package com.exp.ApiCRUD.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.exp.ApiCRUD.Model.Libro;

public interface ILibroService {
    public List<Libro>listar();
    public Optional<Libro>listarId(int id);
    public int save(Libro l);
    public void delete(int id); 
}
