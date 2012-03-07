package net.vodo.eit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class VideoInfoActivity extends Activity {
	
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.video_info);
    	
    	Bundle extras = getIntent().getExtras();
    	final Integer pos = extras.getInt("video_pos", 0);
    	
     	String title = "TT";
    	String description = "DD";
    	
    	switch (pos) {
    		case 0: 
    			title =  (String) getResources().getText(R.string.v1_title);
    			description =  (String) getResources().getText(R.string.v1_description);
    			break;
    		case 1:
    			title =  (String) getResources().getText(R.string.v2_title);
    			description =  (String) getResources().getText(R.string.v2_description);
    			break;
    		case 2:
    			title =  (String) getResources().getText(R.string.v3_title);
    			description =  (String) getResources().getText(R.string.v3_description);
    			break;
    	}
    	
    	TextView t = (TextView) findViewById(R.id.title);
    	t.setText(title);
    	t = (TextView) findViewById(R.id.description);
    	t.setText(description);

    	Button b_play = (Button) findViewById(R.id.b_play);
  	  
    	b_play.setOnClickListener(new OnClickListener() {
      	    public void onClick(View view) {
      	    	//Start video
      	    	Intent intent = new Intent(getBaseContext(), VideoActivity.class);
    	    	intent.putExtra("video_pos", pos);

      	    	startActivity(intent);

       	    	
      	      
      	    }
      	  });
      	}
      
}