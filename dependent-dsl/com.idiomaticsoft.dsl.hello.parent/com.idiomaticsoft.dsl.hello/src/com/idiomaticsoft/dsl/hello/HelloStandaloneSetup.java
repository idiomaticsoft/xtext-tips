/*
 * generated by Xtext 2.26.0
 */
package com.idiomaticsoft.dsl.hello;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class HelloStandaloneSetup extends HelloStandaloneSetupGenerated {

	public static void doSetup() {
		new HelloStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
