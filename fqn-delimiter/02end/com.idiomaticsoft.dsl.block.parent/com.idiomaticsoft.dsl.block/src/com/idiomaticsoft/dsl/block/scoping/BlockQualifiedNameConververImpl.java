package com.idiomaticsoft.dsl.block.scoping;

import org.eclipse.xtext.naming.IQualifiedNameConverter.DefaultImpl;

public class BlockQualifiedNameConververImpl extends DefaultImpl {
	@Override
	public String getDelimiter() {
		return "->";
	}
}
