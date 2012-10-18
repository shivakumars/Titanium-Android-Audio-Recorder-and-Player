Titanium-Android-Audio Recorder
===============================

Audio recorder and player for Titanium Android

##Installation

Please note that this Module is under development.

###1. Add this to your manifest:

* Add this into Android Manifest.

<pre class="prettyprint">
&ltuses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
&ltuses-permission android:name="android.permission.RECORD_AUDIO" />
</pre>

###2. Now add Module to your project using steps below:

* Include the Module in TiApp.xml and

<pre class="prettyprint">
// open a single window
var win = Ti.UI.createWindow({
  backgroundColor:'white',
  layout:'vertical'
});
var button1 = Ti.UI.createButton({
	title:'Record'
});
win.add(button1);

var button2 = Ti.UI.createButton({
	title:'Play'
});
win.add(button1);

win.open();

var audiorecorder = require('in.shivakumars.audiorecorder');
Ti.API.info("module is => " + audiorecorder);

var path='';
button1.addEventListener('click',function(e){
	if(button1.title=='Record')
	{
		button1.title='Stop Recording';
		audiorecorder.startRec('sample.mp4');
	}
	else
	{
		button1.title='Record';
		path=audiorecorder.stopRec();
	}
});

button2.addEventListener('click',function(e){
	if(button1.title=='Play')
	{
		button1.title='Stop';
		audiorecorder.startPlay(path);
	}
	else
	{
		button1.title='Play';
		path=audiorecorder.stopPlay();
	}
});
</pre>