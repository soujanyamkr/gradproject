/**
 * 
 */
package edu.missouristate.domain;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Soujanya
 *
 */
@Entity
@Table(name = "inventory")
public class InventoryEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SKU")
	private Integer sku;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "PRICE")
	private Float price;

	@Column(name = "TAXABLE")
	private Boolean taxable;

	public Integer getSku() {
		return sku;
	}

	public void setSku(Integer sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getTaxable() {
		return taxable;
	}

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}
}
