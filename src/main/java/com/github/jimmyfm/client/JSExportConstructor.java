package com.github.jimmyfm.client;

import com.google.gwt.core.client.js.JsExport;

@JsExport
public class JSExportConstructor
{
	public String var;

	@JsExport
	public JSExportConstructor()
	{
		var = "value";
	}

}
