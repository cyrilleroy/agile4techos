package org.agile.grenoble.gui;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import org.agile.grenoble.data.AnswersStorage;
import org.agile.grenoble.questions.QuestionsType;
import org.agile.grenoble.user.User;
import org.junit.Test;


public class NokiaControlerTest {

	@Test
	public void actionPerformed() throws Exception {
		QuestionsType questionsType = mock(QuestionsType.class);
		AnswersStorage answersStorage = mock(AnswersStorage.class);
		User user = mock(User.class);
		when(questionsType.sizeOfQuestionArray()).thenReturn(7);
		NokiaSwing nokiaSwing = mock(NokiaSwing.class);
		NokiaControler nokiaControler = new NokiaControler();
		nokiaControler.setStorage(answersStorage);
		nokiaControler.currentUser = user;
		nokiaControler.setQuestions(questionsType);
		nokiaControler.currentQuestionIndex = 0;
		nokiaControler.setNokiaSwing(nokiaSwing);
		nokiaControler.actionPerformed(null);
		nokiaControler.actionPerformed(null);
		nokiaControler.actionPerformed(null);
		nokiaControler.actionPerformed(null);
		nokiaControler.actionPerformed(null);
		nokiaControler.actionPerformed(null);
		nokiaControler.actionPerformed(null);
		
		verify(nokiaSwing, times(6)).nextQuestion(anyInt(), anyBoolean());
		verify(nokiaSwing).terminateTest();
	}
	
}
