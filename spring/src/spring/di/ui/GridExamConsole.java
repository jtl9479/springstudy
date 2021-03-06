package spring.di.ui;

import spring.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	
private Exam exam;
	
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GridExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}

	
	@Override
	public void print() {
		System.out.println("그리드");
		System.out.printf("%3d  %3.2f \n" ,exam.total(),exam.avg());
		System.out.println("그리드");
		
	}


	@Override
	public void setExam(Exam exam) {

		this.exam = exam;
	}

}
