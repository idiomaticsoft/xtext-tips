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
			if (string.substring(2).length() != 2) {
				throw new ValueConverterException("The value " + string + " is invalid. Please use a value of the form '0xXX'.", node, null);
			}
			return Integer.parseInt(string.substring(2), 16);
		}

		@Override
		public String toString(Integer value) throws ValueConverterException {
			return "0x" + Integer.toHexString(value);
		}
	}
}
