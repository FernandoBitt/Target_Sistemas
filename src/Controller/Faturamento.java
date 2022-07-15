package Controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class Faturamento {
	
	public void lerJson() {
		
		Gson gson = new Gson();

        try (Reader reader = new FileReader("C:\\TEMP\\dados.json")) {

            Dados[] dados = gson.fromJson(reader, Dados[].class);
			
            menorValor(dados);
            maiorValor(dados);
            superiorMedia(dados);

        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	

	public void menorValor(Dados[] dados) {
		
		double menor=10000.0000;
		int dia = 0;
		
		for(int i=0;i<=dados.length-1;i++){
	           
			if(dados[i].getValor()!=0) {
				if(dados[i].getValor()<menor){
	                menor= dados[i].getValor();
	                dia=dados[i].getDia();
	            }
			}     
		}
		
		System.out.println("Dia: "+dia+" Menor Valor: " + menor);
		
	}

	public void maiorValor(Dados[] dados) {
		
		double maior=0;
		int dia = 0;
		
		for(int i=0;i<=dados.length-1;i++){
	           
			if(dados[i].getValor()!=0) {
				if(dados[i].getValor()>maior){
	                maior= dados[i].getValor();
	                dia=dados[i].getDia();
	            }
			}     
		}
		
		System.out.println("Dia: "+dia+" Maior Valor: " + maior);
		
	}
		

	public void superiorMedia(Dados[] dados) {
		
		double media=0;
		int dias=0;
		int contador = 0;
		
		for(int i=0;i<=dados.length-1;i++){
	           
			if(dados[i].getValor()!=0) {
				media=media+dados[i].getValor();
				contador++;
			}    
		}
		
		media=media/contador;
		
		for(int i=0;i<=dados.length-1;i++){
	           
			if(dados[i].getValor()>media) {
				dias++;
			}    
		}
		
		System.out.println("Média: " + media +", Dias acima da média: "+dias);
	}
}
