package br.edu.ifbaiano.calculadora.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

	public class Janela extends JFrame {

		public Janela() {
			super("Janela Principal");
			setSize(200, 200);
			setVisible(true);
		}
		
		public static void main(String[] args) {
			new Janela();
		}
	}
