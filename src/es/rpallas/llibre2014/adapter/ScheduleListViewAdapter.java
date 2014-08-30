package es.rpallas.llibre2014.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import es.rpallas.llibre2014.R;
import es.rpallas.llibre2014.models.Event;

public class ScheduleListViewAdapter extends ArrayAdapter<Event> {
	private List<Event> mEvents; 

	public ScheduleListViewAdapter(Context context, List<Event> events) {
		super(context, R.layout.fragment_schedule, events);
		this.mEvents = events;

	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Get the data item for this position
		Event event = getItem(position);    
		// Check if an existing view is being reused, otherwise inflate the view
		ViewHolder viewHolder; // view lookup cache stored in tag
		if (convertView == null) {
			viewHolder = new ViewHolder();
			LayoutInflater inflater = LayoutInflater.from(getContext());
			convertView = inflater.inflate(R.layout.fragment_schedule_item, parent, false);
			viewHolder.hour = (TextView) convertView.findViewById(R.id.itemHour);
			viewHolder.title = (TextView) convertView.findViewById(R.id.itemTitle);
			viewHolder.description = (TextView) convertView.findViewById(R.id.itemDescription);
			convertView.setTag(viewHolder);
			
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		// Populate the data into the template view using the data object

		viewHolder.hour.setText(event.getmHour());
		viewHolder.title.setText(event.getmTitle());
		viewHolder.description.setText(event.getDescription());

		// Return the completed view to render on screen
		return convertView;
	}


	/**
	 * ViewHolder pattern for improving perfomance
	 * https://github.com/thecodepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView
	 */
	private static class ViewHolder {
		TextView hour;
		TextView title;
		TextView description;
	}

}
