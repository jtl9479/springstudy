package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * ���������� �����ϴ� ������� �ڵ�� ����
		Exam exam = new NewlecExam();//��ǰ 
		//ExamConsole console = new InlineExamConsole(); //DI
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		�� �����ϴ� ���� setting.xml���� �Ѵ�.
		*/
		
		
		
		console.print();
		
	}
}
