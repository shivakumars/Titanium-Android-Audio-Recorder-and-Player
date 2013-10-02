Titanium-Android-Audio Recorder
===============================

Audio recorder and player for Titanium Android

##Change Log

  Version 0.1
    
  - Records and stores in SD Card
    
Version 0.2
    
  - Ability to store in Data Directory
    


##Installation

Please note that this Module is under development. You can download the zip from [here](http://bit.ly/19Zh1NP)

###1. Add this to your manifest:

* Add this into Android Manifest.

        <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
        <uses-permission android:name="android.permission.RECORD_AUDIO" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>


###2. Now add Module to your project using steps below:

* Include the Module in TiApp.xml and



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
        win.add(button2);

        win.open();

        // TODO: write your module tests here
        var audiorecorder = require('in.shivakumars.audiorecorder');
        Ti.API.info("module is => " + audiorecorder);

        var path='';
        button1.addEventListener('click',function(e){
	        if(button1.title=='Record')
	        {
		        button1.title='Stop Recording';
		        audiorecorder.startRec('sample.mp4',true);
	        }
	        else
	        {
		        button1.title='Record';
		        path=audiorecorder.stopRec();
	        }
        });

        button2.addEventListener('click',function(e){
	        if(button2.title=='Play')
	        {
		        button2.title='Stop';
		        audiorecorder.startPlay(path);
	        }
	        else
	        {
		        button2.title='Play';
		        path=audiorecorder.stopPlay();
	        }
        });
        
## License

    Apache License
    Version 2.0, January 2004
    http://www.apache.org/licenses/LICENSE-2.0