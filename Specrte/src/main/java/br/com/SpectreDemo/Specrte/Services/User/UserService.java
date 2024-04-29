package br.com.SpectreDemo.Specrte.Services.User;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.SpectreDemo.Specrte.Domain.User.UserDomain;
import br.com.SpectreDemo.Specrte.Handlers.Exeptions.UserNotFindException;
import br.com.SpectreDemo.Specrte.Repositories.User.UserRepositories;


@Service
public class UserService {

    @Autowired
    private UserRepositories userRepositories;

    public UserDomain CreateUser(UserDomain user){
        return userRepositories.save(user);
    }
    public List<UserDomain>  GetAllUsers(){
        return userRepositories.findAll();
    }
    public  void DeleteUser(long userId){
        userRepositories.deleteById(userId);
    }
    public Optional<UserDomain> FindUserById(long userId){
        return userRepositories.findById(userId);
    }
    //Essa exeção sera tratada dentro de Handle/Exeptions
    public UserDomain UpdateUser(Long userId,UserDomain user) throws UserNotFindException{
        if (userRepositories.existsById(userId)) {
            user.setUserId(userId);
            return userRepositories.save(user);            
        } else {throw new UserNotFindException("user não foi encontrado em nosso banco de dados");}
    }


}
