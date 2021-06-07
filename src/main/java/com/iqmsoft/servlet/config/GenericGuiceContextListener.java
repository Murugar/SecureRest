package com.iqmsoft.servlet.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.iqmsoft.servlet.modules.BootstrapServletModule;


public class GenericGuiceContextListener extends GuiceServletContextListener{

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new BootstrapServletModule());
	}

	
}
