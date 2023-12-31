package modal;
// Generated Nov 12, 2023 4:00:12 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name="customer"
    ,catalog="jsp_project"
)
public class Customer  implements java.io.Serializable {


     private String code;
     private String firstName;
     private String lastName;
     private String email;
     private String userName;
     private String password;
     private String confirmPassword;
     private boolean isactive;

    public Customer() {
    }

    public Customer(String code, String firstName, String lastName, String email, String userName, String password, String confirmPassword, boolean isactive) {
       this.code = code;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.userName = userName;
       this.password = password;
       this.confirmPassword = confirmPassword;
       this.isactive = isactive;
    }
   
     @Id 

    
    @Column(name="code", unique=true, nullable=false, length=20)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="email", nullable=false, length=100)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="user_name", nullable=false, length=45)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="password", nullable=false, length=200)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="confirm_password", nullable=false, length=45)
    public String getConfirmPassword() {
        return this.confirmPassword;
    }
    
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    
    @Column(name="isactive", nullable=false)
    public boolean isIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }




}


