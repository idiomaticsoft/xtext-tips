/*
 * generated by Xtext 2.26.0
 */
package com.idiomaticsoft.dsl.block.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import com.idiomaticsoft.dsl.block.block.Block;
import com.idiomaticsoft.dsl.block.block.BlockPackage;

/**
 * This class contains custom scoping description.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class BlockScopeProvider extends AbstractBlockScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (reference.equals(BlockPackage.Literals.ALIAS__ALIAS)) {
			Block block = (Block) context.eContainer();
			return Scopes.scopeFor(block.getMembers(), p -> QualifiedName.create("this", p.getName()),
					super.getScope(context, reference));
		}
		return super.getScope(context, reference);
	}

}
