package org.agile.grenoble.gui;

import static org.agile.grenoble.gui.HasTextField.hasTextField;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

import javax.swing.JPanel;

import org.agile.grenoble.data.xml.QuestionsReader;
import org.agile.grenoble.questions.QuestionsType;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class NokiaSwingTest {

	private static QuestionsType questionsType;

	@BeforeClass
	public static void loadAndMarshallQuestions() throws Exception {
		String filename = "/org/agile/grenoble/data/xml/questions.xml"; //$NON-NLS-1$
		QuestionsReader.printItems(filename);
		questionsType = QuestionsReader.readItems(filename);
	}
	
	@Test
	public void generateQuestionsPanels() throws Exception {
		NokiaSwing nokiaSwing = new NokiaSwing();
		JPanel[] questionsPanel = nokiaSwing.generateQuestionsPanels(questionsType);
		assertThat(questionsPanel.length, equalTo(7));
	}	
}
