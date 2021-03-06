package co.nubetech.crux.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.nubetech.crux.model.Datastore;
import co.nubetech.crux.model.Function;
import co.nubetech.crux.model.ValueType;

public class TestFunctionView {
	
	@Test
	public void testFunctionView(){
		Datastore dataStore = new Datastore();
		dataStore.setId(1212);
		dataStore.setName("DataStore");
		
		ValueType valueType = new ValueType(1,dataStore,"Type","class2",
				"className1", true);
		ValueType returnValueType = new ValueType(2,dataStore,"ReturnType","class3",
				"className1", false);
		
		
		Function function = new Function();
		function.setId(12345);
		function.setFunctionName("fun");
		function.setFunctionClass("class1");
		function.setAggregate(false);
		function.setValueType(valueType);
		function.setReturnValueType(returnValueType);
						                                             
		FunctionView functionView = new FunctionView(function);
		
		assertEquals(functionView.getFunctionName(),"fun");
		assertEquals(functionView.getValueType(),"Type");
		assertEquals(functionView.getReturnType(),"ReturnType");
		
	}

}
