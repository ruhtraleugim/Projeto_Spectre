package br.com.SpectreDemo.Specrte.Domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UserDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;
    private String UserName;
    private String UserPassaword;
    private String UserEmail;
    private Enum<UserStatus> UserStatus;



    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getUserPassaword() {
        return UserPassaword;
    }
    public void setUserPassaword(String userPassaword) {
        UserPassaword = userPassaword;
    }
    public String getUserEmail() {
        return UserEmail;
    }
    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }
    public Enum<UserStatus> getUserStatus() {
        return UserStatus;
    }
    
    public void setUserStatus(Enum<UserStatus> userStatus) {
        UserStatus = userStatus;
    }
    public Long getUserId() {
        return UserId;
    }
    public void setUserId(Long userId) {
        UserId = userId;
    }
    

}