package es.rpallas.llibre2014.models;

import java.util.Date;

public class Event {

	private String mTitle;
	private Date mDate;
	private String mHour;
	private String description;
	private long mLat;
	private long mLon;

	/**
	 * @param mTitle
	 * @param mDate
	 * @param mHour
	 * @param description
	 * @param mLat
	 * @param mLon
	 */
	public Event(String mTitle, Date mDate, String mHour, String description,
			long mLat, long mLon) {
		super();
		this.mTitle = mTitle;
		this.mDate = mDate;
		this.mHour = mHour;
		this.description = description;
		this.mLat = mLat;
		this.mLon = mLon;
	}
	/**
	 * @param mTitle
	 * @param mHour
	 * @param description
	 */
	public Event(String mTitle, String mHour, String description) {
		super();
		this.mTitle = mTitle;
		this.mHour = mHour;
		this.description = description;
	}


	public String getmTitle() {
		return mTitle;
	}
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
	public String getmHour() {
		return mHour;
	}
	public void setmHour(String mHour) {
		this.mHour = mHour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getmLat() {
		return mLat;
	}
	public void setmLat(long mLat) {
		this.mLat = mLat;
	}
	public long getmLon() {
		return mLon;
	}
	public void setmLon(long mLon) {
		this.mLon = mLon;
	}

}
