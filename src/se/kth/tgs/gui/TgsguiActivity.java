package se.kth.tgs.gui;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;



public class TgsguiActivity extends ListActivity {
	
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

