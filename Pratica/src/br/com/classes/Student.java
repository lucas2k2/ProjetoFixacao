package br.com.classes;

public class Student {
	private String name;
	private double avarage;
	
	//construtor inicializa variaveis de instancia
	public Student(String name, double avarege)
	{
		//valida que a media é > 0.0 <=100.0; caso contrario,
		//armaneza o valor padrao da media da variavel de instancia (0.0)
		
		if (avarage > 0.0)
			if (avarage <= 100.0)
				this.avarage = avarage; //atribui a variavel de instancia
		}
	//define o nome de Student 
	public void setName (String name)
	{
		this.name = name;
	}
	
	//recupera o nome de Student 
	public String getName()
	{
		return name;
	}
	
	//define a media de Student 
	public void setAverage(double Average)
	{
		//vallida que a media é > 0.0 e <=100.0; caso contrario,
		//armazenna o valor atual da media da variavel de instancia
		if (avarage >0.0)
			if(avarage <=100.0)
				this.avarage = avarage; //atribui a variavel de instancia
	}
	//recupera a media de Student 
	public double getAvarage()
	{
		return avarage;
	}
	//determina a retorna a letra da nota Student 
	public String getLetterGrade()
	{
		String letterGrade = ""; //inicializando como uma String vazia 
		if (avarage >=90.0)
			letterGrade = "A";
		else if (avarage >= 80.0)
			letterGrade = "B";
		else if (avarage >=70.0)
			letterGrade ="C";
		else if (avarage >= 60.0)
			letterGrade = "D";
		else 
			letterGrade = "F";
		
		return letterGrade;
	}
}//finaliza a classe Student 
