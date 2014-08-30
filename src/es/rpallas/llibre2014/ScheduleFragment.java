package es.rpallas.llibre2014;

import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import es.rpallas.llibre2014.adapter.ScheduleListViewAdapter;
import es.rpallas.llibre2014.data.MockData;
import es.rpallas.llibre2014.models.Event;

public class ScheduleFragment extends Fragment {

	/**
	 * Constants representing the day of the fragment
	 */
	private static final int DAY_12 = 12;
	private static final int DAY_13 = 13;
	private static final int DAY_14 = 14;
	private static final int DAY_15 = 15;

	/**
	 * The fragment argument representing the day number for this fragment.
	 */
	private static final String ARG_DAY_NUMBER = "day_number";

	/**
	 * List containing the day events
	 */
	private List<Event> mEvents;

	/**
	 * Adapter for the arrayList
	 */
	private ScheduleListViewAdapter mAdapter;

	/**
	 * ListView containing the events
	 */
	private ListView mListView;

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static ScheduleFragment newInstance(int sectionNumber) {
		ScheduleFragment fragment = new ScheduleFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_DAY_NUMBER, sectionNumber);
		fragment.setArguments(args);
		return fragment;
	}

	public ScheduleFragment() {

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int day = getArguments().getInt(ARG_DAY_NUMBER, DAY_12);
		switch (day) {
		case DAY_12:
			mEvents = MockData.get12DayEvents();
			break;
		case DAY_13:
			mEvents = MockData.get13DayEvents();
			break;
		case DAY_14:
			mEvents = MockData.get14DayEvents();
			break;
		case DAY_15:
			mEvents = MockData.get15DayEvents();
			break;

		default:
			mEvents = MockData.get12DayEvents();
			break;
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_schedule, container,
				false);
		mListView = (ListView) rootView.findViewById(R.id.scheduleList);
		mAdapter = new ScheduleListViewAdapter(getActivity(), mEvents);
		mListView.setAdapter(mAdapter);

		mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				Event event = mEvents.get(position);
				//Show Dialog displaying event's info
				showDialog(event);


			}
		});
		return rootView;
	}


	private void showDialog(Event event){
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				getActivity());

		// set title
		alertDialogBuilder.setTitle(event.getmTitle());

		// set dialog message
		alertDialogBuilder
		.setMessage(event.getDescription())
		.setCancelable(false)
		.setPositiveButton(R.string.aceptar,new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				dialog.dismiss();
			}
		});

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
	}

}