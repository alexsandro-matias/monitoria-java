package gui.swing;


import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ExemploEscolhaArquivos {

	public static void main(String[] args) {
		ExemploEscolhaArquivos testador;
		testador = new ExemploEscolhaArquivos();
		testador.escolheArquivo();
	}

	private void escolheArquivo() {
		JFileChooser chooser = new JFileChooser();

		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
		filter = new FileNameExtensionFilter("Arquivos separados por vírgula", "csv", "CSV");
		chooser.setFileFilter(filter);

		// int returnVal = chooser.showOpenDialog(parent);
		int returnVal = chooser.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("Você escolheu abrir este arquivo: " + chooser.getSelectedFile().getName());
		} else {
			System.out.println("Operação cancelada.");
		}
	}

}
