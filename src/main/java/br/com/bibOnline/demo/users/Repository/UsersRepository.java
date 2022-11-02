package br.com.bibOnline.demo.users.Repository;

import br.com.bibOnline.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository< Users, Long> {

}
