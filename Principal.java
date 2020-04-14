package principal;

import dados.*;
import validacao.Valida;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// declara��es
		int cadastros = 0;
		ArrayList<Cidadao> cidadaos = new ArrayList<Cidadao>();

		// instru��es
		do {
			// instancia um objeto cidadao com seu construtor preenchido com as valida��es

			Cidadao cidadao = new Cidadao(Valida.pedeNome(), Valida.geraCPF(), Valida.pedeSalario(), Valida.pedeIdade(),
					Valida.pedeSexo(), Valida.pedeNumFilhos());

			// passa esse objeto cidadao para o arrayList de cidadaos
			cidadaos.add(cidadao);

			cadastros++;

		} while (Valida.continua(cidadaos, cadastros));

	}

}
