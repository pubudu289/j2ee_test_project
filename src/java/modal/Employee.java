package modal;
// Generated Nov 12, 2023 4:00:12 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="employee"
    ,catalog="jsp_project"
)
public class Employee  implements java.io.Serializable {


     private int id;
     private String employeeno;
     private String firstname;
     private String lastname;
     private String mobileno;
     private String email;
     private Double salary;
     private String createduser;
     private Date createddatetime;
     private String lastupdateuser;
     private Date lastupdatedatetime;
     private Set<Cart> carts = new HashSet<Cart>(0);
     private Set<Login> logins = new HashSet<Login>(0);

    public Employee() {
    }

	
    public Employee(int id, String employeeno) {
        this.id = id;
        this.employeeno = employeeno;
    }
    public Employee(int id, String employeeno, String firstname, String lastname, String mobileno, String email, Double salary, String createduser, Date createddatetime, String lastupdateuser, Date lastupdatedatetime, Set<Cart> carts, Set<Login> logins) {
       this.id = id;
       this.employeeno = employeeno;
       this.firstname = firstname;
       this.lastname = lastname;
       this.mobileno = mobileno;
       this.email = email;
       this.salary = salary;
       this.createduser = createduser;
       this.createddatetime = createddatetime;
       this.lastupdateuser = lastupdateuser;
       this.lastupdatedatetime = lastupdatedatetime;
       this.carts = carts;
       this.logins = logins;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="employeeno", nullable=false, length=16)
    public String getEmployeeno() {
        return this.employeeno;
    }
    
    public void setEmployeeno(String employeeno) {
        this.employeeno = employeeno;
    }

    
    @Column(name="firstname", length=100)
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    @Column(name="lastname", length=100)
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    @Column(name="mobileno", length=15)
    public String getMobileno() {
        return this.mobileno;
    }
    
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    
    @Column(name="email", length=225)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="salary", precision=22, scale=0)
    public Double getSalary() {
        return this.salary;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    
    @Column(name="createduser", length=100)
    public String getCreateduser() {
        return this.createduser;
    }
    
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createddatetime", length=19)
    public Date getCreateddatetime() {
        return this.createddatetime;
    }
    
    public void setCreateddatetime(Date createddatetime) {
        this.createddatetime = createddatetime;
    }

    
    @Column(name="lastupdateuser", length=100)
    public String getLastupdateuser() {
        return this.lastupdateuser;
    }
    
    public void setLastupdateuser(String lastupdateuser) {
        this.lastupdateuser = lastupdateuser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastupdatedatetime", length=19)
    public Date getLastupdatedatetime() {
        return this.lastupdatedatetime;
    }
    
    public void setLastupdatedatetime(Date lastupdatedatetime) {
        this.lastupdatedatetime = lastupdatedatetime;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Cart> getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Login> getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set<Login> logins) {
        this.logins = logins;
    }




}


