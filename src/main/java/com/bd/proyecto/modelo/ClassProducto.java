package com.bd.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_productocl3")
public class ClassProducto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductocl3;
	private String nombrecl3;
	private double precioventacl3; 
	private double preciocompracl3;
	private int stockcl3;
	private String estadocl3; 
	private String descripcioncl3;
	public ClassProducto() {
		
	}
	public int getIdproductocl3() {
		return idproductocl3;
	}
	public void setIdproductocl3(int idproductocl3) {
		this.idproductocl3 = idproductocl3;
	}
	public String getNombrecl3() {
		return nombrecl3;
	}
	public void setNombrecl3(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}
	public double getPrecioventacl3() {
		return precioventacl3;
	}
	public void setPrecioventacl3(double precioventacl3) {
		this.precioventacl3 = precioventacl3;
	}
	public double getPreciocompracl3() {
		return preciocompracl3;
	}
	public void setPreciocompracl3(double preciocompracl3) {
		this.preciocompracl3 = preciocompracl3;
	}
	public int getStockcl3() {
		return stockcl3;
	}
	public void setStockcl3(int stockcl3) {
		this.stockcl3 = stockcl3;
	}
	public String getEstadocl3() {
		return estadocl3;
	}
	public void setEstadocl3(String estadocl3) {
		this.estadocl3 = estadocl3;
	}
	public String getDescripcioncl3() {
		return descripcioncl3;
	}
	public void setDescripcioncl3(String descripcioncl3) {
		this.descripcioncl3 = descripcioncl3;
	}
	
	
}
