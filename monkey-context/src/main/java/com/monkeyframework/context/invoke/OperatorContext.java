package com.monkeyframework.context.invoke;

import com.monkeyframework.model.Operator;

public interface OperatorContext {
	
	public static String KEY_ID 	= "opid";
	public static String KEY_NAME	= "opname";
	public static String KEY_TYPE 	= "optype";
	public static String KEY_EXTEND = "opextend";
	
	public void setOperator(Operator operator);
	
	public Operator getOperator();
			
}