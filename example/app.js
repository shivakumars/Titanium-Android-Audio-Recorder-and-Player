// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var win = Ti.UI.createWindow({
	backgroundColor:'white'
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

// TODO: write your module tests here
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