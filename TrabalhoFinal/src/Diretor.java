import java.util.Calendar;

public class Diretor extends Funcionario{

			
		public int getTempoDeCasa() {
			return (2020 - getAnoDeAdmissao());
		}
		
		public double getImpostoDeRenda() {
			return getSalario() *0.23;
		}
}

