package com.github.jimmyfm.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Module implements EntryPoint
{
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{

		log(JSExportConstructor.class.getSimpleName());
		log(new JSExportConstructor());
		log(JSExportMethod.class.getSimpleName());
		log(new JSExportMethod());
		log(JSExportField.class.getSimpleName());
		JSExportField x = new JSExportField();
		log(x);
		x.plain = "updated value";
		log(x);
		log(JSExportFieldTypes.class.getSimpleName());
		log(new JSExportFieldTypes());
		log(JSExportClass.class.getSimpleName());
		log(new JSExportClass());
		log(JSExportComplexObject.class.getSimpleName());
		JSExportComplexObject exportComplexObject = new JSExportComplexObject();
		log(exportComplexObject);

		log("getProperties result");
		Object[] oa = getProperties(exportComplexObject);
		log(oa);

		log("ComplexObject properties");
		for (Object o : oa)
		{
			if (o instanceof ComplexObject)
			{
				ComplexObject co = (ComplexObject) o;
				log(co.getName() + " : " + co.getValue());
			}
		}
	}

	public static final native Object[] getProperties(Object o)/*-{
		var res = [];
		Object.getOwnPropertyNames(o).forEach(function(name) {
			res.push(o[name]);
		});
		return res;
	}-*/;

	public static final native void log(Object o)/*-{
		console.log(o);
	}-*/;
}
