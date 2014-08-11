package net.slipp.qna;

import java.util.List;

import junit.framework.TestCase;

public class QnAServiceTest extends TestCase {
	private QnAService service;
	
	@Override
	protected void setUp() throws Exception {
		service = new QnAService();
		createQuestion(1, "test title1", "this is contents1", "java,oop,java");
		createQuestion(21, "java title21", "this is contents21", "java,test,테스트");
		createQuestion(2, "class title2", "this is contents2", "java,test,테스트");
		createQuestion(11, "oop title11", "this is contents11", "java,oop,java");
		createQuestion(3, "object title3", "this is contents3", "refactoring,class,object");
	}

	private void createQuestion(int id, String title, String contents, String tags) {
		Question question = new Question(id, title, contents);
		service.create(question, tags);
	}
	
	public void testCreateWhenNoTags() throws Exception {
		Question question = new Question(1000, "this is title", "this is contents");
		service.create(question, "");
		assertEquals(question, service.findQuestionById(question.getId()));
	}
	
	public void testCreateWhenHasTags() throws Exception {
		Question question = new Question(1000, "this is title", "this is contents");
		service.create(question, "java,자바,oop,java");
		assertEquals(question, service.findQuestionById(question.getId()));
		assertEquals(3, question.sizeOfTags());
	}
	
	public void testAnswer() throws Exception {
		int questionId = 1;
		Answer answer1 = new Answer("answer title1", "answer contents1");
		service.answer(questionId, answer1);
		Answer answer2 = new Answer("answer title2", "answer contents2");
		service.answer(questionId, answer2);
		Question question = service.findQuestionById(questionId);
		assertEquals(2, question.sizeOfAnswers());
	}
	
	public void testUpdate() throws Exception {
		int questionId = 1;
		Question question = new Question(questionId, "updated title", "updated contents");
		service.update(question, "class,object");
		assertEquals(question, service.findQuestionById(questionId));
		assertEquals(2, question.sizeOfTags());
	}
	
	public void testSortingById() throws Exception {
		List<Question> questions = service.findsQuestionByIdDesc();
		assertEquals(21, questions.get(0).getId());
		assertEquals(11, questions.get(1).getId());
	}	
}
