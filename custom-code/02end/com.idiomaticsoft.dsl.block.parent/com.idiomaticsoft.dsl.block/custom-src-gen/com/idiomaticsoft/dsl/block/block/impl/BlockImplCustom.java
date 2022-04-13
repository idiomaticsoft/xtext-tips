package com.idiomaticsoft.dsl.block.block.impl;

public class BlockImplCustom extends BlockImpl {

	@Override
	public int getNumberOfFields() {
		return getMembers().size();
	}

}
