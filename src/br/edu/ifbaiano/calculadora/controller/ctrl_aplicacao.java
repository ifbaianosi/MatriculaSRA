package br.edu.ifbaiano.calculadora.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

import br.edu.ifbaiano.calculadora.view.GerarPDF_calc_porDia;
import br.edu.ifbaiano.calculadora.view.GerarPDF_calc_porMes;
import br.edu.ifbaiano.calculadora.view.aplicacao;

public class ctrl_aplicacao extends aplicacao implements ActionListener{

	/**
	 * @param args
	 */	
	
	public static void main(String[] args) {
		new ctrl_aplicacao();
	}

	public ctrl_aplicacao() {
		super();
		this.addEventos();
		this.setVisible(true);
	}

	private void addEventos() {
		getJButton_calcular().addActionListener(this);
		getJButton_calcular1().addActionListener(this);
		getJButton_imprimir().addActionListener(this);
		getJButton_imprimir1().addActionListener(this);
		getJButton_limpar().addActionListener(this);
		getJButton_limpar2().addActionListener(this);
		getJButton_fechar().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == getJButton_calcular())
			calcula_porDia();			
		else if (e.getSource() == getJButton_imprimir())
			imprimir_porDia();
		else if (e.getSource() == getJButton_limpar())
			limparCampos_calc_porDia();
		else if (e.getSource() == getJButton_calcular1()){
			calcula_porMes();
			//calcula por dia automaticamente 
			/*getJMoneyTextField_vencimentoBasico2().setValor(getJMoneyTextField_vencimentoBasico().getValor());
			getJMoneyTextField_valorPassagem().setValor(getJMoneyTextField_valorDiario().getValor());
			calcula_porDia();*/
		}else if (e.getSource() == getJButton_imprimir1())
			imprimir_porMes();
		else if (e.getSource() == getJButton_limpar2())
			limparCampos_calc_porMes();
	}

	/*private void calcula() {
		calcula_porMes();
		getJMoneyTextField_vencimentoBasico2().setValor(getJMoneyTextField_vencimentoBasico().getValor());
		getJMoneyTextField_valorPassagem().setValor(getJMoneyTextField_valorDiario().getValor());
		calcula_porDia();
	}*/
	
	private void calcula_porDia() {
		
		// obtem o valores informados nos campos
		float vbasico = getJMoneyTextField_vencimentoBasico2().getValor();
		float vPassagemDiaria = getJMoneyTextField_valorPassagem().getValor();
		int qtdDeslocamentoMes = Integer.parseInt(getJTextField_qtdDeslocamento2().getText());
		int qtdPassagem = Integer.parseInt(getJTextField_qtdPassagem().getText());
		
		/**
		 * calculo 
		 */
		float qtdDeslocamento_x_vlrDiario = (float) (qtdDeslocamentoMes * vPassagemDiaria);
		
		/**
		 * calculo 
		 */
		float vmensal = qtdDeslocamento_x_vlrDiario;
		
		/**
		 * calculo 
		 */		
		float vmensal_22 = vmensal/22;
		
		float vsistema = vmensal/22;
		
		
		/**
		 * setando os valores no campos do formulário
		 */
		getJMoneyTextField_valorReceber().setValor(qtdDeslocamento_x_vlrDiario);		
		getJMoneyTextField_valorMensal().setValor(vmensal);	
		getJMoneyTextField_valorMensal_22().setValor(vmensal_22);
		getJMoneyTextField_valorSistema().setValor(vsistema);
	}
	
	private void calcula_porMes() {
		
		// obtem o valores informados nos campos
		float vbasico = getJMoneyTextField_vencimentoBasico().getValor();
		float vdiario = getJMoneyTextField_valorDiario().getValor();
		int qtdDeslocamentoMes = Integer.parseInt(getJTextField_qtdDeslocamento().getText());
		/*float vmensal = vdiario*qtdDeslocamentoMes;
		float vmensal_22 = vmensal/22;*/
		
		/**
		 * calculo do 6% de desconto do vencimento básico
		 */
		float valorDescontado = (float) (((vbasico / 30) * qtdDeslocamentoMes ) * 0.06);
		
		/**
		 * calculo do valor do auxilio transporte
		 */
		float vauxilio = (qtdDeslocamentoMes * vdiario);
		
		/**
		 * calculo do valor a receber
		 */		
		float vReceber = vauxilio - valorDescontado;
		
		
		/**
		 * setando os valores no campos do formulário
		 */
		getJMoneyTextField_valorDescontado().setValor(valorDescontado);		
		getJMoneyTextField_valorAuxilio().setValor(vauxilio);	
		getJMoneyTextField_valorReceber2().setValor(vReceber);
		
		/*//calculos
		getJMoneyTextField_valorReceber().setValor(qtdDeslocamentoMes*vdiario);
		getJMoneyTextField_valorMensal().setValor(vmensal);
		getJMoneyTextField_valorMensal_22().setValor(vmensal_22);
		getJMoneyTextField_valorSistema().setValor(vmensal_22);*/
	}
	
	private void limparCampos_calc_porMes() {
		
		getJMoneyTextField_vencimentoBasico().setValor((float) 0.00);
		getJMoneyTextField_valorDiario().setValor((float) 0.00);
		//getJTextField_qtdDeslocamento().setText();
		
		getJMoneyTextField_valorDescontado().setValor((float) 0.00);
		getJMoneyTextField_valorAuxilio().setValor((float) 0.00);
		getJMoneyTextField_valorReceber2().setValor((float) 0.00);
	}
	
	private void limparCampos_calc_porDia() {
		
		getJMoneyTextField_vencimentoBasico2().setValor((float) 0.00);
		getJMoneyTextField_valorPassagem().setValor((float) 0.00);
		getJTextField_qtdDeslocamento2().setText("22");
		//getJTextField_qtdPassagem().setText("0");
		
		getJMoneyTextField_valorReceber().setValor((float) 0.00);
		getJMoneyTextField_valorMensal().setValor((float) 0.00);
		getJMoneyTextField_valorMensal_22().setValor((float) 0.00);
		getJMoneyTextField_valorSistema().setValor((float) 0.00);
		
	}
	
	private void imprimir_porMes() {
		try {
			GerarPDF_calc_porMes gp = new GerarPDF_calc_porMes(this);
			gp.gerar();
		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(rootPane, getJTabbedPane().getTitleAt(0)+".pdf (O arquivo já está aberto.)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void imprimir_porDia() {
		try {
			GerarPDF_calc_porDia gp = new GerarPDF_calc_porDia(this);
			gp.gerar();
		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(rootPane, getJTabbedPane().getTitleAt(1)+".pdf (O arquivo já está aberto.)");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
