package mx.com.dmart.mybatis.config;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

import mx.com.dmart.mybatis.service.impl.UsuarioServiceImpl;
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return  new Class<?>[] {DataConfig.class, UsuarioServiceImpl.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {};
	}

	@Override
	protected Filter[] getServletFilters() {

	CharacterEncodingFilter characterEncodinfFilter= new CharacterEncodingFilter();
	characterEncodinfFilter.setEncoding("UTF-8");
	
	return new Filter[] {characterEncodinfFilter, new SiteMeshFilter()};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
