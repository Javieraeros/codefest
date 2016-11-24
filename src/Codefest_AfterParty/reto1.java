package Codefest_AfterParty;

import java.util.ArrayList;
import java.util.Collections;

public class reto1 {
	
	public static void main(String args[]){
		ArrayList<Integer> medicamentos = new ArrayList<Integer>();
		medicamentos.add(1);
		medicamentos.add(3);
		medicamentos.add(4);
		medicamentos.add(8);
		medicamentos.add(8);
		medicamentos.add(10);
		medicamentos.add(10);
		medicamentos.add(14);
		medicamentos.add(15);
		medicamentos.add(16);
		medicamentos.add(20);
		medicamentos.add(21);
		medicamentos.add(22);
		medicamentos.add(22);
		medicamentos.add(23);
		medicamentos.add(24);
		medicamentos.add(24);
		medicamentos.add(27);
		medicamentos.add(31);
		medicamentos.add(39);
		
		laFuncion(medicamentos);
	}
	public static void laFuncion(ArrayList<Integer> medicamentos){
		ArrayList<Integer> devuelve = new ArrayList<Integer>(); 
		int res=0;
		for(int i=0;i<Collections.max(medicamentos);i++){
			for(int j=0;j<medicamentos.size();j++){
				res+=Math.abs(i-medicamentos.get(j))*2;
			}
			res+=(i)*2;
			devuelve.add((Integer)res);
		//	System.out.println(res);
			res=0;
		}
		System.out.println(Collections.min(devuelve));
	}
}
