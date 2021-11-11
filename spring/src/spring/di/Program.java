package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * 스프링에서 지시하는 방법으로 코드로 변경
		Exam exam = new NewlecExam();//부품 
		//ExamConsole console = new InlineExamConsole(); //DI
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		이 설정하는 것을 setting.xml에서 한다.
		*/
		
		
		
		console.print();
		
	}
}
