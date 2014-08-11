package net.slipp.qna;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {
	private int id;
	private String title;
	private String contents;
	
	private Set<Tag> tags = new HashSet<Tag>();
	private List<Answer> answers = new ArrayList<Answer>();
	
	public Question(int id, String title, String contents) {
		this.id = id;
		this.title = title;
		this.contents = contents;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContents() {
		return contents;
	}

	public void update(Question question) {
		this.title = question.title;
		this.contents = question.contents;
		this.tags = question.tags;
	}

	public int sizeOfTags() {
		return tags.size();
	}

	public int sizeOfAnswers() {
		return answers.size();
	}

	public void addTag(Tag tag) {
		tags.add(tag);		
	}

	public void addAnswer(Answer answer) {
		answers.add(answer);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contents == null) ? 0 : contents.hashCode());
		result = prime * result + id;
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (contents == null) {
			if (other.contents != null)
				return false;
		} else if (!contents.equals(other.contents))
			return false;
		if (id != other.id)
			return false;
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
}
