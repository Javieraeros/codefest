package Codefest_AfterParty;

import java.time.Period;
import java.util.Date;

public class reto2 {
	public static void main(String args[]){
		laFuncion(23,59,59, 365);
	}
	public static void laFuncion(int horas, int minutos, int segundos, int dias){
		Date periodo = new Date();
		periodo.setSeconds(segundos);
		periodo.setMinutes(minutos);
		periodo.setHours(horas);
		int array[] = {11,12,14,15,17,18};
		int resultado =0;
		do{
			for(int i=0;i<=array.length-1;i++){
				switch(periodo.toString().charAt(array[i])){
				case '0':
				case '6':
				case '9':
					resultado+=6;
					break;
				case '1':
					resultado+=2;
					break;
				case '2':
				case '3':
				case '5':
					resultado+=5;
					break;
				case '4':
					resultado+=4;
					break;
				case '7':
					resultado+=3;
					break;
				case '8':
					resultado+=7;
					break;
				}
			}
			periodo.setSeconds(periodo.getSeconds()-1);
		}while(!(periodo.getHours()==0 && periodo.getMinutes()==0 && periodo.getSeconds()==0));
		if(dias==0){
			dias=1;
		}
		System.out.println((resultado+36)*dias);
	}
}
