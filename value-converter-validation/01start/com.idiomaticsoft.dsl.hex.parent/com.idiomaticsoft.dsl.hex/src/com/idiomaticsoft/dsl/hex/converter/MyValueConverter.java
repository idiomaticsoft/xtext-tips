package com.idiomaticsoft.dsl.hex.converter;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class MyValueConverter extends DefaultTerminalConverters {

	@ValueConverter(rule = "HEX_VALUE")
	public IValueConverter<Integer> HexValue() {
		return new HexValueConverter();
	}

	public static class HexValueConverter implements IValueConverter<Integer> {

		@Override
		public Integer toValue(String string, INode node) throws ValueConverterException {
			return Integer.parseInt(string.substring(2), 16);
		}

		@Override
		public String toString(Integer value) throws ValueConverterException {
			return "0x" + Integer.toHexString(value);
		}
	}
}
