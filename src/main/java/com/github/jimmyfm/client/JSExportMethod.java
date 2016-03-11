package com.github.jimmyfm.client;

import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;

@JsNamespace("culo")
public class JSExportMethod
{
	@JsExport
	public static String method(String input)
	{
		return input;
	}

}
