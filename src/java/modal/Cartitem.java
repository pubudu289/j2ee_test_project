package modal;
// Generated Nov 12, 2023 4:00:12 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cartitem generated by hbm2java
 */
@Entity
@Table(name="cartitem"
    ,catalog="jsp_project"
)
public class Cartitem  implements java.io.Serializable {


     private Integer id;
     private Cart cart;
     private Item item;
     private int qty;
     private double unitprice;
     private double total;

    public Cartitem() {
    }

    public Cartitem(Cart cart, Item item, int qty, double unitprice, double total) {
       this.cart = cart;
       this.item = item;
       this.qty = qty;
       this.unitprice = unitprice;
       this.total = total;
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
    @JoinColumn(name="cart_id", nullable=false)
    public Cart getCart() {
        return this.cart;
    }
    
    public void setCart(Cart cart) {
        this.cart = cart;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="item_id", nullable=false)
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }

    
    @Column(name="qty", nullable=false)
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }

    
    @Column(name="unitprice", nullable=false, precision=22, scale=0)
    public double getUnitprice() {
        return this.unitprice;
    }
    
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    
    @Column(name="total", nullable=false, precision=22, scale=0)
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }




}

