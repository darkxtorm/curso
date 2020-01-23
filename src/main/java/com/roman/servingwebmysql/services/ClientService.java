package com.roman.servingwebmysql.services;

import com.roman.servingwebmysql.model.Cliente;
import com.roman.servingwebmysql.repositories.ClientRepository;
import com.roman.servingwebmysql.repositories.ICRUD;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements ICRUD<Cliente> {
    ClientRepository repository;

    @Override
    public List<Cliente> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Cliente getById(Integer id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public void save(Cliente obj) {
        repository.save(obj);
    }

    @Override
    public void update(Cliente obj, Integer id) {
        obj.setId(id);
        repository.save(obj);
    }

    @Override
    public void deleteById(Cliente obj, Integer id) {
        repository.deleteById(id);
    }
}
