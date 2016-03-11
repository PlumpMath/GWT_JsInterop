package com.github.jimmyfm.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.js.JsExport;

class ComplexObject
{
	public final String name;
	public Integer value;

	public ComplexObject(String name, Integer value)
	{
		this.name = name;
		this.value = value;
	}

	public String getName()
	{
		return this.name;
	}

	public Integer getValue()
	{
		return this.value;
	}

	public void setValue(Integer value)
	{
		this.value = value;
	}


}

public class JSExportComplexObject
{

	@JsExport
	public String stringa = "Not a ComplexObject";

	@JsExport
	public List<String> differentlyComplex = new ArrayList<String>(20);

	@JsExport
	public ComplexObject answer = new ComplexObject("answer", 42);

	@JsExport
	public ComplexObject pi = new ComplexObject("pi", 314);
}
