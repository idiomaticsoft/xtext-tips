/*
 * generated by Xtext 2.26.0
 */
package com.idiomaticsoft.dsl.block.validation;

import org.eclipse.xtext.validation.Check;

import com.idiomaticsoft.dsl.block.block.BlockPackage;
import com.idiomaticsoft.dsl.block.block.Member;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class BlockValidator extends AbstractBlockValidator {

	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkField(Member member) {
		if (!Character.isUpperCase(member.getName().charAt(0))) {
			warning("Name should start with a capital", BlockPackage.Literals.MEMBER__NAME, INVALID_NAME);
		}
	}

}
