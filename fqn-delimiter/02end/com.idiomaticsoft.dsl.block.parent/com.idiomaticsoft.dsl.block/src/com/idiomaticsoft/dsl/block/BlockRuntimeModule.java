/*
 * generated by Xtext 2.26.0
 */
package com.idiomaticsoft.dsl.block;

import org.eclipse.xtext.naming.IQualifiedNameConverter;

import com.google.inject.Binder;
import com.idiomaticsoft.dsl.block.scoping.BlockQualifiedNameConververImpl;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class BlockRuntimeModule extends AbstractBlockRuntimeModule {

	
	@Override
	public void configure(Binder binder) {
		binder.bind(IQualifiedNameConverter.class).to(BlockQualifiedNameConververImpl.class);
		super.configure(binder);
	}

}
