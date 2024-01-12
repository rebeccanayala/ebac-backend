package dao.jpa;

import dao.generic.jpa.IGenericJapDAO;
import domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
