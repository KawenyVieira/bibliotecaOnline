package br.com.bibOnline.demo.users.Controller;

import br.com.bibOnline.demo.model.Users;
import br.com.bibOnline.demo.users.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    //READ LIST...
    @GetMapping("/users/list")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }
    //READ
    @GetMapping("/users/{idUsers}")
    public Users getById(@PathVariable("idUsers") long idUsers) {
        Users response = usersService.getById(idUsers);
        return response;
    }
    //CREATE
    @PostMapping("/users")
    public Users create(@RequestBody final Users users) {
        return usersService.create(users);
    }
    //UPDATE
    @PutMapping("/users")
    public Users update(@RequestBody Users users) {
        Users response = usersService.update(users);
        return response;
    }
    //DELETE
    @DeleteMapping("/users/{idUsers}")
    public void delete(@PathVariable("idUsers") long idUsers){
        usersService.delete(idUsers);
    }

}
