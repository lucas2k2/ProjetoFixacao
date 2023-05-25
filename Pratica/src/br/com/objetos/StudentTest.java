package br.com.objetos;

import br.com.classes.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student accont1 = new Student("Jane Green", 93.5);
		Student accont2 = new Student("John Blue",72.75);
		
		System.out.printf("%s's letter grade is: %s%n",accont1.getName(),accont1.getLetterGrade());
		System.out.printf("%s's letter grade is %s%n",accont2.getName(),accont2.getLetterGrade());
		}

}//fim da classe StudentTest
