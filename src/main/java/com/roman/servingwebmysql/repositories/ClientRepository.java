package com.roman.servingwebmysql.repositories;

import com.roman.servingwebmysql.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Cliente,Integer> {
}
