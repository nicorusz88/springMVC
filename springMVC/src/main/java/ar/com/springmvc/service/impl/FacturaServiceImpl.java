package ar.com.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ar.com.springmvc.dao.FacturaDao;
import ar.com.springmvc.entities.Factura;
import ar.com.springmvc.service.FacturaService;

@Service(value = "facturaService")
@Scope(value = "prototype")
public class FacturaServiceImpl implements FacturaService {

	@Autowired
	private FacturaDao facturaDao;

	public FacturaDao getFacturaDao() {
		return facturaDao;
	}

	public void setFacturaDao(FacturaDao facturaDao) {
		this.facturaDao = facturaDao;
	}

	@Override
	public Factura crearFactura(Factura factura) {
		factura.setId((Long) facturaDao.save(factura));
		return factura;
	}

	@Override
	public List<Factura> listarFacturas() {
		return facturaDao.findAll();
	}

}
