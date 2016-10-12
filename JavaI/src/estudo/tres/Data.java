package estudo.tres;

public class Data {
	public int dia;
	public int mes;
	public int ano;

	public Data(int dia, int mes, int ano) {

		this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
		 if (! isDataViavel(dia, mes, ano)) {
             System.out.println("A data " + toString() + " não existe!");
         }
	}
	
	 private boolean isDataViavel(int dia, int mes, int ano) {
         if (dia <= 0 || mes <= 0 || mes > 12 || ano <= 0) {
             return false;
         }

         int ultimoDiaDoMes = 31; // por padrao são 31 dias
         if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
             ultimoDiaDoMes = 30;
         } else if (mes == 2) {
             ultimoDiaDoMes = 28;
             if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                 ultimoDiaDoMes = 29;
             }
         }
         if (dia > ultimoDiaDoMes) {
             return false;
         }

         return true;
     }

	public static void main(String[] args) {
		new Data(111, 12, 2000);
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}
