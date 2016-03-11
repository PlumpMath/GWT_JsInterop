# GWT JSInterop Experiment

Annotation | Types
---:| ---
JsExport | JsExport marks a constructor, static method, or static field as creating a an unobfuscated alias in the global scope.
JsNamespace | Provides a default namespace for @JsExport annotations which don't specify a value.
JsNoExport	| JsExport marks a constructor, static method, or static field as creating a an unobfuscated alias in the global scope.
JsProperty | JsProperty marks a method in a JsType as a property accessor and recognizes JavaBean style naming convention.
JsType | JsType is used to describe the interface of a Javascript object, either one that already exists from the external Javascript environment, or one that will be accessible to the external Javascript environment.