package aula_poo.aula;

public class CalculadoraDeSalarioCoesa2 {

	public static double calcula(Funcionario funcionario) {
		
		return funcionario.getCargo2().getRegra().calcula(funcionario);
			
	}
}
	
	
	
	

