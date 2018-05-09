package com.monkeyframework.context.utils;

import com.monkeyframework.context.invoke.ThreadLocalOperatorContext;
import com.monkeyframework.core.utils.ReflectionUtility;
import com.monkeyframework.model.Operator;
import com.monkeyframework.model.OperatorUser;

public class ContextOperatorUtility {
	
	public static void fillOperatorForCreate(Object object) {
		Operator operator = ThreadLocalOperatorContext.getInstance().getOperator();
		if(null != operator) {
			try {
				Integer type = operator.getType().getIndex();
				ReflectionUtility.setFieldValue(object, "createType", type);
			} catch (Exception e) {
			}
			try {
				OperatorUser user = operator.getUser();
				ReflectionUtility.setFieldValue(object, "createBy", user.toString());
			} catch (Exception e) {
			}			
		}
	}
	
	public static void fillOperatorForUpdate(Object object) {
		Operator operator = ThreadLocalOperatorContext.getInstance().getOperator();
		
		if(null != operator) {
			try {
				Integer type = operator.getType().getIndex();
				ReflectionUtility.setFieldValue(object, "updateType", type);
			} catch (Exception e) {
			}
			try {
				OperatorUser user = operator.getUser();
				ReflectionUtility.setFieldValue(object, "updateBy", user.toString());
			} catch (Exception e) {
			}			
		}
	}
	
}