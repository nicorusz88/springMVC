package ar.com.springmvc.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ar.com.springmvc.dao.ArticuloDao;
import ar.com.springmvc.entities.Articulo;

@Service("articuloDao")
@Scope("singleton")
public class ArticuloDaoImpl extends GenericDaoImpl<Articulo, Long> implements ArticuloDao{

}
