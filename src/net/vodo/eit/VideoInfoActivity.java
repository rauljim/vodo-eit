package net.vodo.eit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class VideoInfoActivity extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.video_info);
    	
    	Button b_play = (Button) findViewById(R.id.b_play);
  	  
    	  b_play.setOnClickListener(new OnClickListener() {
      	    public void onClick(View view) {
      	    	//Start video
      	    	Intent intent = new Intent(VideoInfoActivity.this, VideoActivity.class);
      	    	startActivity(intent);

       	    	
      	      
      	    }
      	  });
      	}
      
}