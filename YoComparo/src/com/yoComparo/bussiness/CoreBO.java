package com.yoComparo.bussiness;

import java.util.List;

import com.yoComparo.model.Producto;

public class CoreBO {
	private String id;
	private String descripci�n;
	private List<Producto> productos;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripci�n() {
		return descripci�n;
	}
	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void compararProductos(String id){
		
	}
	
	public boolean validarProducto(List<Producto> productos) throws Exception{
		boolean result = false;
				
		return  result;
	}
}
