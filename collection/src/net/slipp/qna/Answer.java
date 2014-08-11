package net.slipp.qna;

public class Answer {
	private String title;
	private String contents;
	
	public Answer(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContents() {
		return contents;
	}
}
