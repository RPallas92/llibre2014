package es.rpallas.llibre2014.adapter;

import java.util.Locale;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import es.rpallas.llibre2014.AboutFragment;
import es.rpallas.llibre2014.LlibreFragment;
import es.rpallas.llibre2014.R;
import es.rpallas.llibre2014.ScheduleFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

	/**
	 * First day of the agenda
	 */
	private static final int BASE_DAY = 12 - 1; 
	
	/**
	 * Number of pages in the ViewPager
	 */
	private static final int NUMBER_OF_PAGES = 6;
	
	/**
	 * Activity context
	 */
	private Context context;
	
	
	public SectionsPagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		this.context = context;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		switch (position) {
		case 0:
			return new LlibreFragment();
		case 5:
			return new AboutFragment();
		default:
			return ScheduleFragment.newInstance(position + BASE_DAY);

		}
	}

	@Override
	public int getCount() {
		return NUMBER_OF_PAGES;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {

		case 0:
			return context.getString(R.string.title_portada).toUpperCase(l);
		case 1:
			return context.getString(R.string.title_dia12).toUpperCase(l);
		case 2:
			return context.getString(R.string.title_dia13).toUpperCase(l);
		case 3:
			return context.getString(R.string.title_dia14).toUpperCase(l);
		case 4:
			return context.getString(R.string.title_dia15).toUpperCase(l);
		case 5:
			return context.getString(R.string.title_about).toUpperCase(l);
		}
		return null;
	}


}


