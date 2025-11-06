package com.example.crud.service.Impl;

import com.example.crud.entity.Producto;
import com.example.crud.repository.ProductoRepository;
import com.example.crud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repository;

    @Override
    public List<Producto> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Producto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
