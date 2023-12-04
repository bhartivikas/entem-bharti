package ai.entem.game.repository;

import org.springframework.data.repository.CrudRepository;

import ai.entem.game.entity.User;


public interface UserRepository extends CrudRepository<User, String>{

}
