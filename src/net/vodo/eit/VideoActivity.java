package net.vodo.eit;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;



public class VideoActivity extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    	getWindow().setFormat(PixelFormat.TRANSLUCENT); 
    	VideoView videoHolder = new VideoView(this);
        videoHolder.setMediaController(new MediaController(this));
        setContentView(videoHolder);

//i tested and found that it works fine for .wmv, .3gp and .mp4
//      videoHolder.setVideoURI(Uri.parse("file:///sdcard/video.3gp"));
        videoHolder.setVideoURI(Uri.parse("http://commonsware.com/misc/test2.3gp"));
        videoHolder.requestFocus();
        videoHolder.start(); 
    	
    	
//    	VideoView mVideoView = (VideoView) findViewById(R.id.surface_view);
//    	Uri uri = Uri.parse("http://commonsware.com/misc/test2.3gp");
//    	mVideoView.setVideoURI(uri);
//		MediaController mediaController = new MediaController(VideoActivity.this);
//		mediaController.setAnchorView(mVideoView);
//        mVideoView.setMediaController(mediaController);
//		mVideoView.start();
//		mVideoView.requestFocus();
	
//
//    	  setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, VIDEOS));
//
//    	  ListView lv = getListView();
//    	  lv.setTextFilterEnabled(true);
//
//    	  lv.setOnItemClickListener(new OnItemClickListener() {
//    	    public void onItemClick(AdapterView<?> parent, View view,
//    	        int position, long id) {
//    	    	// 	When clicked, show a toast with the TextView text
////    	    	TextView selected_item = (TextView) view;
//    	    	Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
//    	    			Toast.LENGTH_SHORT).show();
//    	      
//    	    }
    	
	}
      
}