package Guilherme.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import Guilherme.restapi.model.user;

public interface UserRepository extends CrudRepository<user, Integer>{

}