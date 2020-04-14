package saida;

import java.util.ArrayList;
import dados.Cidadao;
import servicos.*;

public class Visao {
	public static void mostraNomeCpf(ArrayList<Cidadao> cidadaos) {
		for (int i = 0; i < cidadaos.size(); i++) {
			System.out.println("\tCidad�o: " + cidadaos.get(i).getNome() + "\tCPF: " + cidadaos.get(i).getCpf());
		}
	}

	public static void mostraRelatorio(ArrayList<Cidadao> cidadaos) {
		Servicos.pulaLinha(3);
		
		System.out.println("Abaixo, segue relat�rio dos moradores dessa cidade: ");

		System.out.println("\tmenor idade entre os entrevistados: " + Servicos.menorIdade(cidadaos));

		System.out.println("\tmaior sal�rio registrado: " + Servicos.maiorSalario(cidadaos));

		System.out.println("\tm�dia do n�mero de filhos entre todos os cadastros: " + Servicos.mediaFilhos(cidadaos));

		System.out.println("\tm�dia do sal�rio das pessoas registradas: " + Servicos.mediaSalarios(cidadaos));

		System.out.println(
				"\tm�dia dos homens com sal�rio superior a R$300,00: " + Servicos.mediaHomensSalSup300(cidadaos) + "%");

		System.out.println("\tquantidade de pessoas que tem sal�rio maior que a m�dia: "
				+ Servicos.qtdPessoasSalSupMedia(cidadaos));

	}

}
