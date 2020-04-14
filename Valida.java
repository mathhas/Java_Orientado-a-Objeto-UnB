package validacao;

import java.util.*;
import dados.Cidadao;
import leitura.*;
import saida.Visao;
import servicos.Servicos;

public class Valida {

	public static boolean continua(ArrayList<Cidadao> cidadaos, int cadastros) {
		final int MAXIMO = 1000; // quantidade máxima de cadastros
		boolean erro = false;
		char continuaPrograma;
		char mostrarTabela;

		if (cadastros > MAXIMO) {
			return false;
		} else {
			System.out.print("Deseja continuar cadastrando Cidadãos? ");
			System.out.println("Tecle: ('S' -> SIM / 'N -> NÃO)");

			do {
				continuaPrograma = Ler.lerChar();
				if (continuaPrograma == 's') {
					System.out.println("Certo, os cadastros irão continuar! ");
					System.out.print("Antes, deseja ver como está a tabela dos cadastrados? ");
					System.out.println("Tecle: ('S' -> SIM)");

					mostrarTabela = Ler.lerChar();
					if (mostrarTabela == 's') {
						Visao.mostraNomeCpf(cidadaos);
					}

					return true; // retornando true, na classe principal, o programa irá continuar os cadastros
									// no bloco do do while

				} else if (continuaPrograma == 'n') {
					Servicos.pulaLinha(20);
					Visao.mostraNomeCpf(cidadaos);
					Visao.mostraRelatorio(cidadaos);

					System.out.println("Programa encerrado corretamente!");
					return false;
				} else {
					erro = true;
					System.out.println("Tecle apenas 'S' ou 'N'! Sendo: ('S' -> SIM / 'N -> NÃO)");
				}
			} while (erro);
			return false;
		}

	}

	// -----------------------------------------NOME-----------------------------------
	public static String pedeNome() {
		String nomeValidado;
		boolean erro = false;
		do {
			erro = false;

			System.out.println("Insira o nome do Cidadão a ser cadastrado: ");

			nomeValidado = Ler.lerString();

			if (nomeValidado.isEmpty()) {
				erro = true;
				System.out.println("Nome vazio não é aceito, tente novamente!");
			}
		} while (erro);
		return nomeValidado;
	}

	// -----------------------------------------CPF------------------------------------
	public static String geraCPF() {
		int digito1 = 0, digito2 = 0, resto = 0;
		String nDigResult;
		String numerosContatenados;
		String cpfGerado;

		Random numeroAleatorio = new Random();

		// numeros gerados
		int n1 = numeroAleatorio.nextInt(10);
		int n2 = numeroAleatorio.nextInt(10);
		int n3 = numeroAleatorio.nextInt(10);
		int n4 = numeroAleatorio.nextInt(10);
		int n5 = numeroAleatorio.nextInt(10);
		int n6 = numeroAleatorio.nextInt(10);
		int n7 = numeroAleatorio.nextInt(10);
		int n8 = numeroAleatorio.nextInt(10);
		int n9 = numeroAleatorio.nextInt(10);

		int soma = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

		int valor = (soma / 11) * 11;

		digito1 = soma - valor;

		// Primeiro resto da divisão por 11.
		resto = (digito1 % 11);

		if (digito1 < 2) {
			digito1 = 0;
		} else {
			digito1 = 11 - resto;
		}

		int soma2 = digito1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

		int valor2 = (soma2 / 11) * 11;

		digito2 = soma2 - valor2;

		// Primeiro resto da divisão por 11.
		resto = (digito2 % 11);

		if (digito2 < 2) {
			digito2 = 0;
		} else {
			digito2 = 11 - resto;
		}

		// Conctenando os numeros
		numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + "." + String.valueOf(n4)
				+ String.valueOf(n5) + String.valueOf(n6) + "." + String.valueOf(n7) + String.valueOf(n8)
				+ String.valueOf(n9) + "-";

		// Concatenando o primeiro resto com o segundo.
		nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

		cpfGerado = numerosContatenados + nDigResult;

		return cpfGerado;
	}

	// -----------------------------------------SALÁRIO--------------------------------
	public static double pedeSalario() {
		boolean erro = false;
		double salario = 0;

		do {
			erro = false;
			try {
				System.out.println("Digite o salário do cidadão: ");
				salario = Ler.lerDouble();
			} catch (InputMismatchException e) {
				System.out.println("Digite apenas números por favor!");
				erro = true;
			}
		} while (erro);
		return salario;
	}

	// -----------------------------------------IDADE----------------------------------
	public static int pedeIdade() {
		boolean erro = false;
		int idade = 0;

		do {
			erro = false;
			try {
				System.out.println("Digite a idade do cidadão: ");
				idade = Ler.lerInt();
				if (idade <= 0 || idade > 130) {
					if(idade < 130) {
						System.out.println("Digite a idade de alguém que já nasceu. Tente novamente!");
					}else {
						System.out.println("Digite a idade de alguém vivo. Tente novamente!");
					}
					
					erro = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Digite apenas números por favor!");
				erro = true;
			}
		} while (erro);
		return idade;
	}

	// -----------------------------------------SEXO-----------------------------------
	public static String pedeSexo() {
		boolean erro = false;
		char sex;
		String sexo = new String();

		do {
			erro = false;
			System.out.println("Digite o sexo do cidadão. Sendo 'M' -> MASCULINO e 'F' Feminino: ");

			sex = Ler.lerChar();
			if (sex == 'm') {
				sexo = "MASCULINO";
				return sexo;
			} else if (sex == 'f') {
				sexo = "FEMININO";
				return sexo;
			} else {
				erro = true;
			}
		} while (erro);

		return sexo;
	}

	// -----------------------------------------NUMÉRO-DE-FILHOS-----------------------
	public static int pedeNumFilhos() {
		boolean erro = false;
		int numFilhos = 0;

		do {
			erro = false;
			try {
				System.out.println("Digite quantos filhos o cidadão tem: ");
				numFilhos = Ler.lerInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite apenas números por favor!");
				erro = true;
			}
		} while (erro);
		return numFilhos;
	}
}
