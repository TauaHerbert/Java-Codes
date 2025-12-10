package Arqu1;
import java.util.Scanner;
public class verificar_CPF {
	
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    // DECLARAÇÃO DE VARIÁVEIS
	    //Declaração das variáveis necessárias para executar os calculos para a validação do CPF
	    // Inicialização de todas as variáveis de controle e memória
	    String cpf;
	    char digito;
	    int soma = 0;
	    int numero = 0;
	    int indice = 0, resto = 0;
	    int digito1 = 0, digito2 = 0;
	    System.out.println("Informe o CPF, apenas numeros: ");
	    cpf = leitor.nextLine();
	    // VALIDAÇÃO DA ENTRADA DE DADOS
	    // Garante que o usuário digite exatamente 11 caracteres do CPF.
	    // O loop impede o avanço do algoritmo em caso de erro.
	    //ERRO: CPF nao conter 11 caracteres ou tiver letras. 
	    while (cpf.length() != 11 || !cpf.matches("[0-9]+")) {
	            System.out.println("Erro ao inserir CPF, CPF invalido! Digite novamente: ");
	            System.out.println("Informe o CPF com 11 digitos, apenas numeros!");
	            cpf = leitor.nextLine();
	     }
	     // VERIFICAÇÃO DE PADRÕES REPETIDOS
	     // Bloqueia CPFs como '111.111.111-11' que passam na matemática,
	     // mas são inválidos pela regra de negócio.
	     if (cpfInvalidos(cpf)) {
	            System.out.println("CPF invalido!");
	            return; //Encerra o programa caso o MÉTODO retorne VERDADEIRO (true)
	     }
	     // CÁLCULO DO 1º DÍGITO VERIFICADOR
	     // Aplica a regra de pesos decrescentes de 10 a 2.
	     for (int i = 10; i >= 2; i--) {
	            digito = cpf.charAt(indice); //Separa e isola o caractere
	            numero = Character.getNumericValue(digito); //Converte o digito para inteiro
	            soma = soma + (i * numero); //Aplica-se o cálculo
	            indice++;
	     }
	// Regra do Módulo 11 para o 1º dígito
	resto = soma % 11;
	if (resto < 2) {
	           digito1 = 0;
	}else {
	           digito1 = 11 - resto;	
	}
	// CÁLCULO DO 2º DÍGITO VERIFICADOR
	// Reinicia as variáveis e aplica pesos de 11 a 3.
	indice = 0;
	soma = 0;
	for (int i = 11; i >= 3; i--) {
	           digito = cpf.charAt(indice); //Separa e isola o caractere
	           numero = Character.getNumericValue(digito); //Converte o caractere para inteiro
	           soma = soma + (i * numero); //Aplica-se o cálculo
	           indice++;
	}
	// Adiciona o 1º dígito verificador calculado
	soma = soma + (digito1 * 2);
	// Regra do Módulo 11 para o 2º dígito
	resto = soma % 11;
	if (resto < 2) {
	           digito2 = 0;
	}else {
	           digito2 = 11 - resto;	
	}
	// VALIDAÇÃO FINAL E RESULTADO
	// Compara os dígitos calculados com os informados pelo usuário.
	if (digito1 == Character.getNumericValue(cpf.charAt(9)) && digito2 == Character.getNumericValue(cpf.charAt(10))) {
		System.out.println("CPF verificado e validado com sucesso!");
	}else {
		System.out.println("CPF invalidado!");
	}
	}
	// MÉTODO AUXILIAR
	// Verifica se o CPF possui todos os números iguais
	public static boolean cpfInvalidos (String cpf) {
	              if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
		     cpf.equals("22222222222") || cpf.equals("33333333333") ||
		     cpf.equals("44444444444") || cpf.equals("55555555555") ||
		     cpf.equals("66666666666") || cpf.equals("77777777777") ||
		     cpf.equals("88888888888") || cpf.equals("99999999999")) {
	return true; // Retorna VERDADEIRO se for um padrão inválido
	}
			return false;
	}

}


