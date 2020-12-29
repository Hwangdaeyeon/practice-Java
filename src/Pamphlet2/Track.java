package Pamphlet2;

public class Track {
	
	private String titleImage; // 제목부분
	private String startImage; // 선택 이미지

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
