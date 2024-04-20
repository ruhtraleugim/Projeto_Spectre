package br.com.SpectreDemo.Specrte.Controllers.User;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.SpectreDemo.Specrte.Domain.User.*;
import br.com.SpectreDemo.Specrte.Services.User.UserService;


@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDomain> GetAllUsers(){
        return userService.GetAllUsers();
    }
    @GetMapping("/{UserById}")
    public Optional<UserDomain> GetUserId(@PathVariable long UserId){
        return userService.FindUserById(UserId);
    }
    @PostMapping
    public UserDomain PostUser(@RequestBody UserDomain user){
        return userService.CreateUser(user);
    }
    @DeleteMapping("/{UserById}")
    public void DeleteUser(@PathVariable Integer userId){
        userService.DeleteUser(userId);
    }
    @PutMapping("/{UserById}")
    public UserDomain PutUser(@RequestBody UserDomain user, @PathVariable Long userId) throws Exception {
        return userService.UpdateUser(userId,null);
    }



}
