package br.com.bibOnline.demo.users.Service;

import br.com.bibOnline.demo.model.Users;
import br.com.bibOnline.demo.users.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private final UsersRepository repository;

    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }
    //CREATE
    public Users create(Users users){
        System.out.println(users.toString());
        return repository.save(users);
    }
    //READ
    public Users getById(Long idUsers){
        return repository.findById(idUsers).get();
    }
    //UPDATE
    public Users update(Users users){
        return repository.save(users);
    }
    //DELETE
    public void delete (Long idUsers){
        repository.deleteById(idUsers);
    }
    //READ LIST
    public List<Users> getAllUsers() {
        return repository.findAll();
    }



}

