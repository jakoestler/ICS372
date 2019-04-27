package ourClasses;


import java.util.ArrayList;

/**
 * Study is a class that keeps track of sites and readings for a particular study
 * In addition, it records the study name and ID
 */
public class Study {
	// Each study has three components to it, listed below
	ArrayList<Site> siteList;
	ArrayList<Reading> readingList;
	String studyName;
	String studyID;
	/*
	 * Study() is a constructor that initializes the study object
	 */
	public Study( ) {
		siteList = new ArrayList<Site>();
		readingList = new ArrayList<Reading>();
		studyName = null;
		studyID = null;
	}
	// Getters and setters for the Sitelist object that occurs in Study()
	public ArrayList<Site> getSiteList(){
		return siteList;
	}
	public void setSiteList( ArrayList<Site> theSiteList ){
		theSiteList = siteList;
	}
	// Getter and setter for the list of readings associated with a study
	public ArrayList<Reading> getReadingList(){
		return readingList;
	}
	public void setReadingList( ArrayList<Reading> theReadingList ){
		theReadingList = readingList;
	}
	// Getter and setter for the Study's name
	public String getStudyName(){
		return studyName;
	}
	public void setStudyName( String theStudyName ){
		theStudyName = studyName;
	}
	// Getter and setter for the Study's ID
	public String getStudyID(){
		return studyID;
	}
	public void setStudyID( String theStudyID ){
		theStudyID = studyID;
	}
	/*
	 * addSite allows us to add a particular site to a study, should we need to
	 * It accepts a site and returns void
	 */
	public void addSite( Site s ) {
		siteList.add( s );
	}
	/*
	 * addReading allows us to add a particular reading to a study, should we need to
	 * It accepts a reading and returns void
	 */
	public void addReading( Reading r ){
		readingList.add( r );
	}
	/*
	 * Overwrite of the toString method that reports the contents of a study
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = "Study with its sites.\n";
		if ( siteList.size() > 0 ) {
			for( Site n : siteList ) {
				// Print node info
				String t = "\nSite " + n.getSiteName() + ", ID " + n.getSiteID() + "\n";
				s = s.concat(t);
			}
			s = s.concat("\n");
		}

		return s;
	}

}
