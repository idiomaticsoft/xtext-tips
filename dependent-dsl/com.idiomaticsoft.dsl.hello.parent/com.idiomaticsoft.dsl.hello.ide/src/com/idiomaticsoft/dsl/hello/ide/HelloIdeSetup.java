/*
 * generated by Xtext 2.26.0
 */
package com.idiomaticsoft.dsl.hello.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.idiomaticsoft.dsl.hello.HelloRuntimeModule;
import com.idiomaticsoft.dsl.hello.HelloStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class HelloIdeSetup extends HelloStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new HelloRuntimeModule(), new HelloIdeModule()));
	}
	
}
