package Controller;

public class Percentual {

	public void calcularPercentual() {
		
		
		double SP = 67836.43;
		double RJ =36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double Outros = 19849.53;
		
		double total;
		
		total=SP+RJ+MG+ES+Outros;
		
		SP=(SP*100)/total;
		RJ=(RJ*100)/total;
		MG=(MG*100)/total;
		ES=(ES*100)/total;
		Outros=(Outros*100)/total;
		
		System.out.println("Total: "+total+
				"\n Porcentagem SP: %"+String.format("%.2f", SP)+
				"\n Porcentagem RJ: %"+String.format("%.2f", RJ)+
				"\n Porcentagem MG: %"+String.format("%.2f", MG)+
				"\n Porcentagem ES: %"+String.format("%.2f", ES)+
				"\n Porcentagem Outros: %"+String.format("%.2f", Outros));
	}

}
