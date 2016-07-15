package ar.com.springmvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ar.com.springmvc.entities.Articulo;
import ar.com.springmvc.service.ArticuloService;

@Controller
public class ArticulosController {

	@Autowired
	private ArticuloService articuloService;

	@RequestMapping(value = "/articulos", method = RequestMethod.GET)
	public String init(ModelMap model) {

		model.addAttribute("articulo", new Articulo());

		List<Articulo> articulos = articuloService.listarArticulos();
		model.addAttribute("articulos", articulos);

		return "articulos";
	}

	@RequestMapping(value = "/agregarArticulo", method = RequestMethod.POST)
	public ModelAndView agregarArticulo(@ModelAttribute("articulo") @Valid Articulo articulo, BindingResult result) {

		ModelAndView model = new ModelAndView("articulos");

		if (result.hasErrors()) {
			return model;
		}

		articuloService.salvarArticulo(articulo);
		List<Articulo> articulos = articuloService.listarArticulos();

		model.addObject("articulos", articulos);

		return model;
	}
	
	@RequestMapping(value = "/articulosjson", method = RequestMethod.GET)
	public @ResponseBody List<Articulo> articulosJson(ModelMap model) {

		model.addAttribute("articulo", new Articulo());

		List<Articulo> articulos = articuloService.listarArticulos();
		return articulos;
	}
}
