package FrotaMotorizada;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FrotaMotorizada {
	private ArrayList<Veiculo> veiculos;

	public FrotaMotorizada() {
		this.veiculos = new ArrayList<Veiculo>();
	}

	public String[] lerValoresPropriedades(String[] dadosIn) {
		String[] dadosOut = new String[dadosIn.length];

		for (int i = 0; i < dadosIn.length; i++)
			dadosOut[i] = JOptionPane.showInputDialog("Entre com " + dadosIn[i] + ": ");

		return dadosOut;
	}

	public Automovel leAutomovel() {

		String[] nomesPropriedades = { "Marca", "Modelo", "Ano", "placa" };

		String[] valoresPropriedades = new String[4];
		valoresPropriedades = lerValoresPropriedades(nomesPropriedades);

		String marca = valoresPropriedades[0];
		String modelo = valoresPropriedades[1];
		int ano = this.retornaInteiro(valoresPropriedades[2]);
		String placa = valoresPropriedades[3];

		Automovel automovel = new Automovel(marca, modelo, ano, placa);
		return automovel;
	}

	public Caminhao leCaminhao() {

		String[] nomesPropriedades = { "Marca", "Modelo", "Ano", "placa" };

		String[] valoresPropriedades = new String[4];
		valoresPropriedades = lerValoresPropriedades(nomesPropriedades);

		String marca = valoresPropriedades[0];
		String modelo = valoresPropriedades[1];
		int ano = this.retornaInteiro(valoresPropriedades[2]);
		String placa = valoresPropriedades[3];

		Caminhao caminhao = new Caminhao(marca, modelo, ano, placa);
		return caminhao;
	}

	public Onibus leOnibus() {

		String[] nomesPropriedades = { "Marca", "Modelo", "Ano", "placa" };

		String[] valoresPropriedades = new String[4];
		valoresPropriedades = lerValoresPropriedades(nomesPropriedades);

		String marca = valoresPropriedades[0];
		String modelo = valoresPropriedades[1];
		int ano = this.retornaInteiro(valoresPropriedades[2]);
		String placa = valoresPropriedades[3];

		Onibus onibus = new Onibus(marca, modelo, ano, placa);
		return onibus;
	}

	private boolean intValido(String s) {
		try {
			Integer.parseInt(s); // M�todo est�tico, que tenta tranformar uma string em inteiro
			return true;
		} catch (NumberFormatException e) { // N�o conseguiu transformar em inteiro e gera erro
			return false;
		}
	}

	public int retornaInteiro(String entrada) { // retorna um valor inteiro

		// Enquanto n�o for poss�vel converter o valor de entrada para inteiro,
		// permanece no loop
		while (!this.intValido(entrada)) {
			entrada = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um n�mero inteiro.");
		}
		return Integer.parseInt(entrada);
	}

	public void salvaVeiculos(ArrayList<Veiculo> veiculos) {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream("c:\\temp\\petStore.dados"));
			for (int i = 0; i < veiculos.size(); i++)
				outputStream.writeObject(veiculos.get(i));
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Impossível criar arquivo!");
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally { // Close the ObjectOutputStream
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	@SuppressWarnings("finally")
	public ArrayList<Veiculo> recuperaVeiculos() {
		ArrayList<Veiculo> veiculosTemp = new ArrayList<Veiculo>();

		ObjectInputStream inputStream = null;

		try {
			inputStream = new ObjectInputStream(new FileInputStream("c:\\temp\\petStore.dados"));
			Object meuObjeto = null;
			while ((meuObjeto = inputStream.readObject()) != null) {
				if (meuObjeto instanceof Veiculo) {
					veiculosTemp.add((Veiculo) meuObjeto);
				}
			}
		} catch (EOFException ex) { // when EOF is reached
			System.out.println("Fim de arquivo.");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "Arquivo com ve�culos NÃO existe!");
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally { // Close the ObjectInputStream
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (final IOException ex) {
				ex.printStackTrace();
			}
			return veiculosTemp;
		}
	}

	public void menuFrotaMotorizada() {

		String menu = "";
		String entrada;
		int opc1, opc2;

		do {
			menu = "Controle Frota Motorizada\n" + "Opções:\n" + "1. Entrar Veiculos\n" + "2. Exibir Veiculos\n"
					+ "3. Limpar Veiculos\n" + "4. Gravar Veiculos\n" + "5. Recuperar Veiculos\n" + "9. Sair";
			entrada = JOptionPane.showInputDialog(menu + "\n\n");
			opc1 = this.retornaInteiro(entrada);

			switch (opc1) {
			case 1:// Entrar dados
				menu = "Entrada de Veiculos\n" + "Opções:\n" + "1. Automóvel\n" + "2. Caminhão\n" + "3. Ônibus\n";

				entrada = JOptionPane.showInputDialog(menu + "\n\n");
				opc2 = this.retornaInteiro(entrada);

				switch (opc2) {
				case 1:
					veiculos.add((Veiculo) leAutomovel());
					break;
				case 2:
					veiculos.add((Veiculo) leCaminhao());
					break;
				case 3:
					veiculos.add((Veiculo) leOnibus());
					break;

				default:
					JOptionPane.showMessageDialog(null, "Veiculo para entrada NÃO escolhido!");
				}

				break;
			case 2: // Exibir dados
				if (veiculos.size() == 0) {
					JOptionPane.showMessageDialog(null, "Entre com os veiculos primeiramente");
					break;
				}
				String dados = "";
				for (int i = 0; i < veiculos.size(); i++) {
					dados += veiculos.get(i).toString() + "---------------\n";
				}
				JOptionPane.showMessageDialog(null, dados);
				break;
			case 3: // Limpar Dados
				if (veiculos.size() == 0) {
					JOptionPane.showMessageDialog(null, "Entre com os veiculos primeiramente");
					break;
				}
				veiculos.clear();
				JOptionPane.showMessageDialog(null, "Dados LIMPOS com sucesso!");
				break;
			case 4: // Grava Dados
				if (veiculos.size() == 0) {
					JOptionPane.showMessageDialog(null, "Entre com os veiculos primeiramente");
					break;
				}
				salvaVeiculos(veiculos);
				JOptionPane.showMessageDialog(null, "Dados SALVOS com sucesso!");
				break;
			case 5: // Recupera Dados
				veiculos = recuperaVeiculos();
				if (veiculos.size() == 0) {
					JOptionPane.showMessageDialog(null, "Sem dados para apresentar.");
					break;
				}
				JOptionPane.showMessageDialog(null, "Dados RECUPERADOS com sucesso!");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Fim do aplicativo Frota Motorizada! =)");
				break;
			}
		} while (opc1 != 9);
	}

}
