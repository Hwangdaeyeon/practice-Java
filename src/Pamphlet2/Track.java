package Pamphlet2;

public class Track {
	
	private String titleImage; // ����κ�
	private String startImage; // ���� �̹���

	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public Track(String titleImage, String startImage) {
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
	}
	
}
