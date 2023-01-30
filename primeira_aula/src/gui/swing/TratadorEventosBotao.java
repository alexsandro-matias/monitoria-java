package gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class TratadorEventosBotao 
	implements ActionListener
{
	JTextField caixaTexto;
	
	public TratadorEventosBotao()
	{
		
	}
	
	public void setCaixaTexto(JTextField novaCaixa)
	{
		caixaTexto = novaCaixa;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String texto = "Aconteceu alguma coisa.";
		
		if(caixaTexto != null)
		{
			texto = caixaTexto.getText();
		}
		
		//System.out.println("Aconteceu alguma coisa.");
		System.out.println(texto);
	}

}
