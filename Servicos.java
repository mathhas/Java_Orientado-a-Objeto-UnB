package servicos;

import java.util.ArrayList;

import dados.Cidadao;

public class Servicos {
	public static void pulaLinha(int quantidadeDeLinhas) {
		for (int i = 0; i < quantidadeDeLinhas; i++) {
			System.out.println();
		}
	}

	public static int menorIdade(ArrayList<Cidadao> cidadaos) {
		int menorIdade = 150;

		for (int i = 0; i < cidadaos.size(); i++) {
			if (menorIdade > cidadaos.get(i).getIdade()) {
				menorIdade = cidadaos.get(i).getIdade();
			}
		}
		return menorIdade;
	}

	public static double maiorSalario(ArrayList<Cidadao> cidadaos) {
		double maiorSalario = 0;

		for (int i = 0; i < cidadaos.size(); i++) {
			if (maiorSalario < cidadaos.get(i).getSalario()) {
				maiorSalario = cidadaos.get(i).getSalario();
			}
		}
		return maiorSalario;
	}

	public static int mediaFilhos(ArrayList<Cidadao> cidadaos) {
		int totalFilhos = 0;
		int mediaFilhos = 0;

		for (int i = 0; i < cidadaos.size(); i++) {
			totalFilhos += cidadaos.get(i).getNumFilhos();
		}

		mediaFilhos = totalFilhos / cidadaos.size();

		return mediaFilhos;
	}

	public static double mediaSalarios(ArrayList<Cidadao> cidadaos) {
		double totalSalarios = 0;
		double mediaSalarios = 0;

		for (int i = 0; i < cidadaos.size(); i++) {
			totalSalarios += cidadaos.get(i).getSalario();
		}

		mediaSalarios = totalSalarios / cidadaos.size();

		return mediaSalarios;
	}

	public static int mediaHomensSalSup300(ArrayList<Cidadao> cidadaos) {
		int totalHomens = 0;
		int homensSalSup300 = 0;
		int mediaHomensSalSup300 = 0;

		for (int i = 0; i < cidadaos.size(); i++) {
			if (cidadaos.get(i).getSexo().equals("MASCULINO")) {
				totalHomens++;
				if (cidadaos.get(i).getSalario() > 300) {
					homensSalSup300++;
				}
			}
		}

		mediaHomensSalSup300 = (homensSalSup300 / totalHomens) * 100;

		return mediaHomensSalSup300;
	}

	public static int qtdPessoasSalSupMedia(ArrayList<Cidadao> cidadaos) {
		int highSociety = 0;

		for (int i = 0; i < cidadaos.size(); i++) {
			if (cidadaos.get(i).getSalario() > mediaSalarios(cidadaos)) {
				highSociety++;
			}
		}
		return highSociety;
	}
}
