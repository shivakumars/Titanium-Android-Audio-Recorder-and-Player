/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

/** This is generated, do not edit by hand. **/

#include <jni.h>

#include "Proxy.h"

		namespace in {
		namespace shivakumars {
		namespace audiorecorder {


class AudiorecorderModule : public titanium::Proxy
{
public:
	explicit AudiorecorderModule(jobject javaObject);

	static void bindProxy(v8::Handle<v8::Object> exports);
	static v8::Handle<v8::FunctionTemplate> getProxyTemplate();
	static void dispose();

	static v8::Persistent<v8::FunctionTemplate> proxyTemplate;
	static jclass javaClass;

private:
	// Methods -----------------------------------------------------------
	static v8::Handle<v8::Value> stopRec(const v8::Arguments&);
	static v8::Handle<v8::Value> startPlay(const v8::Arguments&);
	static v8::Handle<v8::Value> stopPlay(const v8::Arguments&);
	static v8::Handle<v8::Value> startRec(const v8::Arguments&);
	static v8::Handle<v8::Value> isPlayerPlaying(const v8::Arguments&);

	// Dynamic property accessors ----------------------------------------

};

		} // audiorecorder
		} // shivakumars
		} // in
