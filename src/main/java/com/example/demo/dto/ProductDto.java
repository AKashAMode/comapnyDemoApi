package com.example.demo.dto;


public class ProductDto {
    private Long id;
    private String productName;
    private String description;
    private double price;      
    private CategoryDto category;

    
    public ProductDto() {
    	
    }
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

  
    
    
    public CategoryDto getCategory() {
    	return category; 
    	}
    
    public void setCategory(CategoryDto category) { 
    	this.category = category; 
    	}
 

}
