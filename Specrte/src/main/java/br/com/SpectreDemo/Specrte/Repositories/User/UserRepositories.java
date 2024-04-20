package br.com.SpectreDemo.Specrte.Repositories.User;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.SpectreDemo.Specrte.Domain.User.UserDomain;


public interface UserRepositories extends JpaRepository<UserDomain , Long>{
    
}
