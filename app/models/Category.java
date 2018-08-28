package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// https://www.playframework.com/documentation/2.6.x/JavaEbean#Configuring-models
// https://www.playframework.com/documentation/2.6.0/api/java/play/data/validation/package-summary.html

@Entity
public class Category extends Model {

    // Properties
    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String category;

    @OneToMany
    private List<Product> products;


    // Constructors
    public Category() {

    }

    public Category(Long id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    //Generic query helper for entity Product with id type Long
    public static Finder<Long,Category> find = new Finder<>(Category.class);

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

    public List<Product> getProducts()	{
		return this.products;
	}

	public void setProducts(List<Product> products) {
	    this.products = products;
  }
  
  public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<>();

    // Get all categories from the DB and add to the options hash map
    for (Category c: Category.find.all()) {
      options.put(c.getId().toString(), c.getName());
    }
    return options;
  }

}