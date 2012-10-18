/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2011-2012 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */

package in.shivakumars.audiorecorder;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollInvocation;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.KrollProxySupport;
import org.appcelerator.kroll.KrollRuntime;

import org.appcelerator.kroll.common.TiConfig;

import org.appcelerator.kroll.runtime.rhino.KrollBindings;
import org.appcelerator.kroll.runtime.rhino.KrollGeneratedBindings;
import org.appcelerator.kroll.runtime.rhino.Proxy;
import org.appcelerator.kroll.runtime.rhino.ProxyFactory;
import org.appcelerator.kroll.runtime.rhino.RhinoRuntime;
import org.appcelerator.kroll.runtime.rhino.TypeConverter;
import org.appcelerator.kroll.common.Log;

import java.util.HashMap;

import in.shivakumars.audiorecorder.AudiorecorderModule;

import org.appcelerator.kroll.KrollModulePrototype;


public class AudiorecorderModulePrototype extends KrollModulePrototype
{
	// GENERATE_SUID

	private static final boolean DBG = TiConfig.LOGD;
	private static final String TAG = "AudiorecorderModulePrototype";
	private static final String CLASS_TAG = "AudiorecorderModule";
	private static AudiorecorderModulePrototype audiorecorderModulePrototype;


	public static AudiorecorderModulePrototype getProxyPrototype()
	{
		return audiorecorderModulePrototype;
	}

	public static void dispose()
	{
		if (DBG) {
			Log.d(TAG, "dispose()");
		}
		audiorecorderModulePrototype = null;
	}

	public AudiorecorderModulePrototype()
	{
		if (audiorecorderModulePrototype == null && getClass().equals(AudiorecorderModulePrototype.class)) {
			audiorecorderModulePrototype = this;
			KrollGeneratedBindings.registerUsedPrototypeClass(getClass());
		}

		isModule = true;
	}

	public Scriptable getPrototype()
	{
		if (this == audiorecorderModulePrototype) {
			return KrollModulePrototype.getProxyPrototype();
		}
		return audiorecorderModulePrototype;
	}

	protected Class<? extends Proxy> getParent()
	{
		return KrollModulePrototype.class;
	}

	protected KrollProxySupport createProxy(String creationUrl, Object[] args)
	{
		return KrollProxy.createProxy(AudiorecorderModule.class, getRhinoObject(), args, creationUrl);
	}

	// Methods
	public Object stopRec(Context context, Scriptable thisObj, Object[] args)
	{
		if (DBG) {
			Log.d(TAG, "stopRec()");
		}

		try {
		AudiorecorderModule proxy = (AudiorecorderModule) ((Proxy) thisObj).getProxy();

		java.lang.String javaResult = proxy.stopRec();

		String rhinoResult = (String) javaResult;
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}

	public void startPlay(Context context, Scriptable thisObj, Object[] args)
	{
		if (DBG) {
			Log.d(TAG, "startPlay()");
		}

		try {
		AudiorecorderModule proxy = (AudiorecorderModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("startPlay: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.startPlay(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void stopPlay(Context context, Scriptable thisObj, Object[] args)
	{
		if (DBG) {
			Log.d(TAG, "stopPlay()");
		}

		try {
		AudiorecorderModule proxy = (AudiorecorderModule) ((Proxy) thisObj).getProxy();

		proxy.stopPlay();
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public void startRec(Context context, Scriptable thisObj, Object[] args)
	{
		if (DBG) {
			Log.d(TAG, "startRec()");
		}

		try {
		AudiorecorderModule proxy = (AudiorecorderModule) ((Proxy) thisObj).getProxy();
		if (args.length < 1) {
			throw new IllegalArgumentException("startRec: Invalid number of arguments. Expected 1 but got " + args.length);
		}
		java.lang.String arg0;
		arg0 = (java.lang.String) TypeConverter.jsObjectToJavaString(args[0], thisObj) ;

		proxy.startRec(arg0);
	

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			
		}
	}

	public Object isPlayerPlaying(Context context, Scriptable thisObj, Object[] args)
	{
		if (DBG) {
			Log.d(TAG, "isPlayerPlaying()");
		}

		try {
		AudiorecorderModule proxy = (AudiorecorderModule) ((Proxy) thisObj).getProxy();

		java.lang.Boolean javaResult = proxy.isPlayerPlaying();

		Object rhinoResult = (Object) TypeConverter.javaObjectToJsObject(javaResult, this);
	
			return rhinoResult;

		} catch (Throwable throwable) {
			Context.throwAsScriptRuntimeEx(throwable);
			return Undefined.instance;
		}
	}


	// Dynamic properties

// #string_id_map#

	// Prototype IDs
	private static final int
		Id_constructor = 1
,		// Property IDs
		// Method IDs
		Id_stopRec = 2,
		Id_startPlay = 3,
		Id_stopPlay = 4,
		Id_startRec = 5,
		Id_isPlayerPlaying = 6
;
		

	public static final int MAX_PROTOTYPE_ID = 6;

	protected int getMaxPrototypeId()
	{
		return MAX_PROTOTYPE_ID;
	}

	@Override
	protected int findPrototypeId(String s)
	{
		int id = 0;
// #generated# Last update: 2012-10-18 13:10:23 GMT+05:30
        L0: { id = 0; String X = null; int c;
            L: switch (s.length()) {
            case 7: X="stopRec";id=Id_stopRec; break L;
            case 8: c=s.charAt(2);
                if (c=='a') { X="startRec";id=Id_startRec; }
                else if (c=='o') { X="stopPlay";id=Id_stopPlay; }
                break L;
            case 9: X="startPlay";id=Id_startPlay; break L;
            case 11: X="constructor";id=Id_constructor; break L;
            case 15: X="isPlayerPlaying";id=Id_isPlayerPlaying; break L;
            }
            if (X!=null && X!=s && !X.equals(s)) id = 0;
            break L0;
        }
// #/generated#
		return id;
	}

// #/string_id_map#

	@Override
	protected void initPrototypeId(int id)
	{
		String name;
		int arity;
		switch (id) {
			case Id_constructor:
				arity = 0;
				name = "constructor";
				break;
			case Id_stopRec:
				arity = 0;
				name = "stopRec";
				break;
			case Id_startPlay:
				arity = 1;
				name = "startPlay";
				break;
			case Id_stopPlay:
				arity = 0;
				name = "stopPlay";
				break;
			case Id_startRec:
				arity = 1;
				name = "startRec";
				break;
			case Id_isPlayerPlaying:
				arity = 0;
				name = "isPlayerPlaying";
				break;
			default:
				super.initPrototypeId(id);
				return;
		}
		initPrototypeMethod(CLASS_TAG, id, name, arity);
	}

	@Override
	public Object execIdCall(IdFunctionObject f,
		Context cx, Scriptable scope, Scriptable thisObj, Object[] args)
	{
		if (!f.hasTag(CLASS_TAG)) {
			return super.execIdCall(f, cx, scope, thisObj, args);
		}

		while (thisObj != null && !(thisObj instanceof AudiorecorderModulePrototype)) {
			thisObj = thisObj.getPrototype();
		}

		AudiorecorderModulePrototype proxy = (AudiorecorderModulePrototype) thisObj;
		int id = f.methodId();
		switch (id) {
			case Id_constructor:
				return jsConstructor(scope, args);
			case Id_stopRec:
				return stopRec(cx, thisObj, args);
				
			case Id_startPlay:
				 startPlay(cx, thisObj, args);
				return Undefined.instance;
			case Id_stopPlay:
				 stopPlay(cx, thisObj, args);
				return Undefined.instance;
			case Id_startRec:
				 startRec(cx, thisObj, args);
				return Undefined.instance;
			case Id_isPlayerPlaying:
				return isPlayerPlaying(cx, thisObj, args);
				
			default:
				throw new IllegalArgumentException(String.valueOf(id));
		}
	}



	public static final int MAX_INSTANCE_ID = -1;


	@Override
	public String getClassName()
	{
		return CLASS_TAG;
	}
}
