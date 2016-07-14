package ar.com.springmvc.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ar.com.springmvc.dao.FacturaDao;
import ar.com.springmvc.entities.Factura;


@Service("facturaDao")
@Scope("singleton")
public class FacturaDaoImpl extends GenericDaoImpl<Factura, Long> implements FacturaDao {

}
