package com.github.jimmyfm.client;

import com.google.gwt.core.client.js.JsExport;

public class JSExportField
{
	@JsExport
	public String plain = "public string";
	@JsExport("ExportValue")
	public String plainWithValue = "public string with @JsExport(\"ExportValue\")";
	@JsExport
	public static String staticField = "static field";
	@JsExport
	public static final String staticFinalField = "static final field";
	@JsExport
	public final String staticFinal = "static final";
}
