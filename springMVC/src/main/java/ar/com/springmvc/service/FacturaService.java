package ar.com.springmvc.service;

import java.util.List;

import ar.com.springmvc.entities.Factura;

public interface FacturaService {
	
	public Factura crearFactura(Factura factura);
	
	public List<Factura> listarFacturas();
	
}
