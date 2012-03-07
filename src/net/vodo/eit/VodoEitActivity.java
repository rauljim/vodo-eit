package net.vodo.eit;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class VodoEitActivity extends ListActivity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	  super.onCreate(savedInstanceState);

    	  setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, VIDEOS));

    	  ListView lv = getListView();
    	  lv.setTextFilterEnabled(true);


    	  
    	  
    	  lv.setOnItemClickListener(new OnItemClickListener() {
    	    public void onItemClick(AdapterView<?> parent, View view,
    	        int position, long id) {
    	    	// 	When clicked, show a toast with the TextView text
//    	    	TextView selected_item = (TextView) view;
    	    	Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
    	    			Toast.LENGTH_SHORT).show();

//        	   	getWindow().setFormat(PixelFormat.TRANSLUCENT); 
//            	VideoView videoHolder = new VideoView(VodoEitActivity.this);
//                videoHolder.setMediaController(new MediaController(VodoEitActivity.this));
//                setContentView(videoHolder);
////                videoHolder.setVideoURI(Uri.parse("file:///sdcard/DCIM/Camera/VID_20120307_104339.mp4"));
//                videoHolder.setVideoURI(Uri.parse("http://commonsware.com/misc/test2.3gp"));
//                videoHolder.requestFocus();
//                videoHolder.start(); 

    	    	//Start video
    	    	Intent intent = new Intent(VodoEitActivity.this, VideoActivity.class);
    	    	startActivity(intent);

    	    	
    	      
    	    }
    	  });
    	}
    static final String[] VIDEOS = new String[] {
       	"Video 1","Video 2","Video 3","Video 4","Video 5","Video 6","Video 7", 
       	"Video 1","Video 2","Video 3","Video 4","Video 5","Video 6","Video 7",
       	"Video 1","Video 2","Video 3","Video 4","Video 5","Video 6","Video 7",
       	"Video 1","Video 2","Video 3","Video 4","Video 5","Video 6","Video 7",
   };
      
}

