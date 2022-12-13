public class Feedback {
    private int star;
	private String message;
	
	public Feedback() {
		star = 0;
		message = null;
	}
	
	public Feedback(int starNo, String msg) {
		star = starNo;
		message = msg;
	}
}
