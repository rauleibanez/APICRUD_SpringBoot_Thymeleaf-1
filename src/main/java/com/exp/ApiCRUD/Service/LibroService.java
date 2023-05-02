package com.exp.ApiCRUD.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.ApiCRUD.InterfaceService.ILibroService;
import com.exp.ApiCRUD.Interfaces.ILibro;
import com.exp.ApiCRUD.Model.Libro;

@Service
public class LibroService implements ILibroService{

    @Autowired
    private ILibro data;
    @Override
    public List<Libro> listar() {
        return (List<Libro>)data.findAll();
    }

    @Override
    public Optional<Libro> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Libro l) {
        int res = 0;
        Libro libro = data.save(l);
        if (!libro.equals(null)){
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
    
}
