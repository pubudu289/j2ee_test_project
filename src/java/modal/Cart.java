package modal;
// Generated Nov 12, 2023 4:00:12 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cart generated by hbm2java
 */
@Entity
@Table(name="cart"
    ,catalog="jsp_project"
)
public class Cart  implements java.io.Serializable {


     private Integer id;
     private Cartstatus cartstatus;
     private Employee employee;
     private Date date;
     private double total;
     private boolean isactive;
     private String createduser;
     private Date createddatetime;
     private String lastupdateuser;
     private Date lastupdatedatetime;
     private Set<Cartitem> cartitems = new HashSet<Cartitem>(0);

    public Cart() {
    }

	
    public Cart(Cartstatus cartstatus, Employee employee, Date date, double total, boolean isactive, String createduser, Date createddatetime, String lastupdateuser, Date lastupdatedatetime) {
        this.cartstatus = cartstatus;
        this.employee = employee;
        this.date = date;
        this.total = total;
        this.isactive = isactive;
        this.createduser = createduser;
        this.createddatetime = createddatetime;
        this.lastupdateuser = lastupdateuser;
        this.lastupdatedatetime = lastupdatedatetime;
    }
    public Cart(Cartstatus cartstatus, Employee employee, Date date, double total, boolean isactive, String createduser, Date createddatetime, String lastupdateuser, Date lastupdatedatetime, Set<Cartitem> cartitems) {
       this.cartstatus = cartstatus;
       this.employee = employee;
       this.date = date;
       this.total = total;
       this.isactive = isactive;
       this.createduser = createduser;
       this.createddatetime = createddatetime;
       this.lastupdateuser = lastupdateuser;
       this.lastupdatedatetime = lastupdatedatetime;
       this.cartitems = cartitems;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cartstatus", nullable=false)
    public Cartstatus getCartstatus() {
        return this.cartstatus;
    }
    
    public void setCartstatus(Cartstatus cartstatus) {
        this.cartstatus = cartstatus;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="employee_id", nullable=false)
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date", nullable=false, length=19)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="total", nullable=false, precision=22, scale=0)
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }

    
    @Column(name="isactive", nullable=false)
    public boolean isIsactive() {
        return this.isactive;
    }
    
    public void setIsactive(boolean isactive) {
        this.isactive = isactive;
    }

    
    @Column(name="createduser", nullable=false, length=45)
    public String getCreateduser() {
        return this.createduser;
    }
    
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="createddatetime", nullable=false, length=19)
    public Date getCreateddatetime() {
        return this.createddatetime;
    }
    
    public void setCreateddatetime(Date createddatetime) {
        this.createddatetime = createddatetime;
    }

    
    @Column(name="lastupdateuser", nullable=false, length=45)
    public String getLastupdateuser() {
        return this.lastupdateuser;
    }
    
    public void setLastupdateuser(String lastupdateuser) {
        this.lastupdateuser = lastupdateuser;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="lastupdatedatetime", nullable=false, length=19)
    public Date getLastupdatedatetime() {
        return this.lastupdatedatetime;
    }
    
    public void setLastupdatedatetime(Date lastupdatedatetime) {
        this.lastupdatedatetime = lastupdatedatetime;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cart")
    public Set<Cartitem> getCartitems() {
        return this.cartitems;
    }
    
    public void setCartitems(Set<Cartitem> cartitems) {
        this.cartitems = cartitems;
    }




}


