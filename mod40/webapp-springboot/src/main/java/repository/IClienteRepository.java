package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}