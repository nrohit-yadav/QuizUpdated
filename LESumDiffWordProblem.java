import java.util.ArrayList;
import java.util.Random;

public class LESumDiffWordProblem implements IAlgebraProblem{

	private double dSum;
	private double dDiff;
	private StringBuilder sb = new StringBuilder();
	private transient ArrayList<String> problemStatements = new ArrayList<>();

	


	public String toString(){
        
  /*     // sb.append("************************************");
        sb.append("\n").append(k+1);
        sb.append("\n ").append(pa.problemStatement);
        sb.append("\n ").append(ch);
        sb.append("\ndepartment: ").append(department);
        sb.append("\nsalary: ").append(salary);
       // sb.append("\n************************************"); */
        return "result from to String"+ sb.toString();
		//return id+name;
    }
	
	
	public LESumDiffWordProblem(){
		
		Random r = new Random();
		int x = r.nextInt(100)+1;
		int y = r.nextInt(100)+1;
		
		if (x<y){
			int lower = x;
			x= y;
			y = lower;
		}
		dSum = x+y;
		dDiff = x-y;
		
		problemStatements.add("The difference between two numbers is "+dDiff+"."+" If their sum is "+dSum+", find the numbers.");
		problemStatements.add("The sum of two numbers is "+dSum+"."+" If their difference is "+dDiff+", find the numbers.");
		problemStatements.add("Find the two numbers if their difference is "+dDiff+" and their sum is "+dSum+".");
		problemStatements.add("Find the two numbers if their sum is "+dSum+" and their difference is "+dDiff+".");
		
	}
	
	@Override
	public ProblemAndAnswer generateProblem(int category){
		
		ProblemAndAnswer pna = new ProblemAndAnswer();
		Random r = new Random();
		int randIndex = r.nextInt(this.problemStatements.size());
		
		pna.problemStatement = problemStatements.get(randIndex);
		pna.correctAnswers.add((dSum+dDiff)/2);
		pna.correctAnswers.add(((dSum-dDiff)/2));
		
		return pna;
	}
	
	private  void printAnswerChoice(String ch, ArrayList<Double> answers){
	
		System.out.print(ch+") ");
		//setName("Rohit");
		//setId(123);
		sb.append(ch).append(")");
		for(int j=0; j<answers.size(); j++){
			Double d = answers.get(j);
			System.out.print(d);
			sb.append(d);
			if (j!=answers.size()-1){
				
				System.out.print(", ");
				sb.append(",");
			}
		}
	}
	
	public  void printProblemsWithMultipleChoiceAnswers(int count){
		
		
		String[] answers = new String[count];
		for(int k=0; k<count; k++){
			LESumDiffWordProblem s = new LESumDiffWordProblem();
			ProblemAndAnswer pa = s.generateProblem(0);
			
			System.out.print(k+1+". ");
			sb.append("\n").append(k+1).append(". ");
			System.out.println(pa.problemStatement);
			sb.append("\n ").append(pa.problemStatement);
			ArrayList<ArrayList<Double>> wrongAnswerLists = pa.getWrongAnswerChoices(3,0);
			Random r = new Random();
			int randIndex = r.nextInt(wrongAnswerLists.size()+1);
			char choiceIndex = 'a';
			int wrongIndex = 0;
			for(int j = 0; j<wrongAnswerLists.size()+1; j++){
				if (randIndex==j){
					String ci = String.format("%s", choiceIndex);
					printAnswerChoice(ci, pa.correctAnswers);					
					answers[k] = ci;
				}
				else{
					String ci = String.format("%s", choiceIndex);
					printAnswerChoice(ci, wrongAnswerLists.get(wrongIndex));
					wrongIndex++;
				}
				choiceIndex++;
				System.out.println();
				sb.append("");
			}
			
						
			System.out.println();
			sb.append("");
		}
		
		System.out.println();
		sb.append("");
		System.out.println();
		sb.append("");
		System.out.println("--------Answer key--------");
		sb.append("--------Answer key-------- \n");
		for(int k=0; k<count; k++){
			System.out.print(k+1+". ");
			sb.append(k+1).append(". ");
			System.out.println(answers[k]);
			sb.append(answers[k]);
		}
		
		
	}
	
	public  void printProblemsWithAnswers(int count){
		
		for(int k=0; k<count; k++){
			LESumDiffWordProblem s = new LESumDiffWordProblem();
			ProblemAndAnswer pa = s.generateProblem(0);
			
			System.out.println(pa.problemStatement);			
			String ci = String.format("%s", "Ans");
			printAnswerChoice(ci, pa.correctAnswers);
				
			System.out.println();
			
		}
	}
	
	public  void printProblemsWithNoAnswerChoices(int count){
		
		for(int k=0; k<count; k++){
			LESumDiffWordProblem s = new LESumDiffWordProblem();
			ProblemAndAnswer pa = s.generateProblem(0);
			
			System.out.println(pa.problemStatement);
			
			for(int i=0; i<20; i++)
				System.out.println();						
			
		}
		
	}
	
	
}
