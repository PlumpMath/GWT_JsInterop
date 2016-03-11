package com.github.jimmyfm.client;

import java.util.Date;

import com.google.gwt.core.client.js.JsExport;

public class JSExportFieldTypes
{

	@JsExport
	public String stringField = "String Field";

	@JsExport
	public int intField = 42;

	@JsExport
	public Integer integerField = new Integer("18");

	@JsExport
	public double doubleField = 3.14;

	@JsExport
	public Double doubleObjField = new Double(2.71828);

	@JsExport
	public Date dateField = new Date();

	@JsExport
	public String[] stringArray = new String[] { "element1", "element2", "element3" };

}
