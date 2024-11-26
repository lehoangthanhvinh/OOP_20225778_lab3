
package AimsPackage;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private int id;
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		id=nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		id=nbDigitalVideoDisc;
		nbDigitalVideoDisc++;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
}
