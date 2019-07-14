package kr.kta.blackjack;

public class Card {

	public static final String[] shapes = { "spade", "heart", "clover", "diamond" };
	public static final String[] markers = { "A", "J", "Q", "K" };
	public static final int MAX_NO = 13;

	private String shape; // spade, heart, clover, diamond
	private String marker; // A, 2~10, K, Q, J
	private int score; // 1~10

	public Card(String shape, int no) {
		setShape(shape);
		createMarkerScore(no);
	}
	
	
	
	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {

		String shp;

		for (int i = 0; i < shapes.length; i++) {
			if (shape.contentEquals(shapes[i])) {
				this.shape = shape;
				return;
			}
		}
		this.shape = "";

	}

	public String getMarker() {
		return marker;
	}

	private void createMarkerScore(int no) {
		if(no == 1) {
			setMarker("A");
			setScore(no);
		} else if (no >= 2 && no <= 10) {
			String sNo = Integer.toString(no);
			setMarker(sNo);
			setScore(no);
		} else if (no < 14) {
			setScore(10);
			
			if (no == 11) {//J
				setMarker("J");
			} else if (no == 12) {
				setMarker("Q");
			} else if (no == 13) {
				setMarker("K");
			}
		} else {
			setScore(0);
			setMarker("");
			
		}	
				
	}
	private void setMarker(String marker) {
		
		this.marker =  marker;
	}

	public int getScore() {
		return score;
	}

	private void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return shape + " : " + marker + ":" + score;
	}
	

}
