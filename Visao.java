package saida;

import java.util.ArrayList;
import dados.Cidadao;
import servicos.*;

public class Visao {
	public static void mostraNomeCpf(ArrayList<Cidadao> cidadaos) {
		for (int i = 0; i < cidadaos.size(); i++) {
			System.out.println("\tCidadão: " + cidadaos.get(i).getNome() + "\tCPF: " + cidadaos.get(i).getCpf());
		}
	}

	public static void mostraRelatorio(ArrayList<Cidadao> cidadaos) {
		Servicos.pulaLinha(3);
		
		System.out.println("Abaixo, segue relatório dos moradores dessa cidade: ");

		System.out.println("\tmenor idade entre os entrevistados: " + Servicos.menorIdade(cidadaos));

		System.out.println("\tmaior salário registrado: " + Servicos.maiorSalario(cidadaos));

		System.out.println("\tmédia do número de filhos entre todos os cadastros: " + Servicos.mediaFilhos(cidadaos));

		System.out.println("\tmédia do salário das pessoas registradas: " + Servicos.mediaSalarios(cidadaos));

		System.out.println(
				"\tmédia dos homens com salário superior a R$300,00: " + Servicos.mediaHomensSalSup300(cidadaos) + "%");

		System.out.println("\tquantidade de pessoas que tem salário maior que a média: "
				+ Servicos.qtdPessoasSalSupMedia(cidadaos));

	}

}
