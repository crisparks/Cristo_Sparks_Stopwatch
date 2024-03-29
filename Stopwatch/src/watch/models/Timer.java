package watch.models;




import java.util.Date;



public class Timer {

	private Date start;
	private Date stop;
	private long difference;
	
	public Timer() {
		
	}

	public Date getStart() {
		return start;
	}

	public Date getStop() {
		return stop;
	}

	public long getDifference() {
		return difference;
	}


	public Timer(Date start, Date stop) {
		this.start = start;
		this.stop = stop;
		this.difference = getDifference(this.stop, this.start);
	}

	public static long getDifference(Date endDate, Date startDate) {
		return endDate.getTime() - startDate.getTime();
	}
}