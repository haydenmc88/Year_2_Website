package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// https://www.playframework.com/documentation/2.6.x/JavaEbean#Configuring-models
// https://www.playframework.com/documentation/2.6.0/api/java/play/data/validation/package-summary.html

@Entity
public class Product extends Model {

    // Properties
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @ManyToOne
    private Category category;

    @Constraints.Required
    private String description;

    @Constraints.Min(0)
    private int stock;

    @Constraints.Min(0)
    private double price;

    // Constructors
    public Product() {

    }

    public Product(Long id, String name, Category category, String description, int stock, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    //Generic query helper for entity Product with id type Long
    public static Finder<Long,Product> find = new Finder<>(Product.class);

    // Accessor Methods
    public Long getId()	{
		return this.id;
	}

	  public void setId(Long id)	{
		this.id = id;
    }
    
    public String getName()	{
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
    }

    public Category getCategory()	{
		return this.category;
	}

	public void setCategory(Category category) {
	    this.category = category;
	}
    
    public String getDescription()	{
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
    }
    
    public int getStock() {
		return this.stock;
	}

	public void setStock(int stock)	{
		this.stock = stock;
    }
    
    public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
	    this.price = price;
  }
}