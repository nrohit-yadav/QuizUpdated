import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class Main {

	public static void main(String[] args) {
	//	Main obj= new Main();
		//obj.run();
	
	/*
	private void run() {
		
		
		ObjectMapper map= new ObjectMapper();
		//LESumDiffWordProblem l1= createDummyObject();
		LESumDiffWordProblem lESumDiffWordProblem = new LESumDiffWordProblem();
		lESumDiffWordProblem.printProblemsWithMultipleChoiceAnswers(2);
		
		try {
			map.writeValue(new File("C:\\Users\\nrohi\\Desktop\\Rohit\\Capstone\\Sample.json"),lESumDiffWordProblem);
			// Convert object to JSON string
						String jsonInString = map.writeValueAsString(lESumDiffWordProblem);
						System.out.println(jsonInString);

						// Convert object to JSON string and pretty print
						jsonInString = map.writerWithDefaultPrettyPrinter().writeValueAsString(lESumDiffWordProblem);
						System.out.println(jsonInString);

					} catch (JsonGenerationException e) {
						e.printStackTrace();
					} catch (JsonMappingException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
			
		}
		// TODO Auto-generated method stub	
		 * 
		 * 
		 * 
*/
		ObjectMapper map= new ObjectMapper();
		map.setVisibility(PropertyAccessor.FIELD, Visibility.ANY); //Key thing to notice
		//map.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
		
		LESumDiffWordProblem lESumDiffWordProblem = new LESumDiffWordProblem();
		lESumDiffWordProblem.printProblemsWithMultipleChoiceAnswers(2);
		String jsonInString;
		try {
			jsonInString = map.writeValueAsString(lESumDiffWordProblem);
			
			System.out.print(jsonInString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//FractionDivisionProblem.printProblemsWithMultipleChoiceAnswers(5);
		//LESumDiffWordProblem lESumDiffWordProblem = new LESumDiffWordProblem();
	//	lESumDiffWordProblem.printProblemsWithMultipleChoiceAnswers(2);
		//LEYoungerOlderWordProblem.printProblemsWithMultipleChoiceAnswers(5);
		//LENickelDimeProblem.printProblemsWithMultipleChoiceAnswers(5);
		//LESalineSolutionWordProblem.printProblemsWithMultipleChoiceAnswers(5);
		//LEUpstreamDownstreamProblem.printProblemsWithMultipleChoiceAnswers(5);
		
		//LESequenceProblem.printProblemsWithMultipleChoiceAnswers(12);
		
		//LEYoungerOlderWordProblem.printProblemsWithMultipleChoiceAnswers(6);
		
		//PolynomialDivisionProblem.printProblemsWithMultipleChoiceAnswers(25);
		//PolynomialFactorizationProblem.printProblemsWithMultipleChoiceAnswers(10);
		
		/*ComplexNumber c = ComplexNumber.getRandomComplexNumber();
		System.out.println(c.toString());
		
		ComplexNumber simpleC = ComplexNumber.simplify(c);
		System.out.println(simpleC.toString());*/
	
	}
	}
