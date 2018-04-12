package com.stocks.trading.reportengine.operations;

import java.time.LocalDate;
import java.util.function.Predicate;

import com.stocks.trading.reportengine.dto.Instruction;

public class InstructionPredicate {
	
	public static Predicate<Instruction> isForSettlement(LocalDate currentDate) {
		return instruction -> instruction.getSettlementDate().equals(currentDate);
	}
}
