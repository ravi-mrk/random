package com.stocks.trading.reportengine.parser;

import java.util.List;

import com.stocks.trading.reportengine.dto.Instruction;
import com.stocks.trading.reportengine.exception.ApplicationException;

public interface IDataParser {

	public List<Instruction> parseInstructions() throws ApplicationException;
}
