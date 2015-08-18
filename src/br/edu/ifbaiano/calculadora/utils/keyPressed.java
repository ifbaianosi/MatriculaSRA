package br.edu.ifbaiano.calculadora.utils;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import com.michaelbaranov.microba.calendar.DatePicker;

public class keyPressed {
	
	public keyPressed() {
		super();
	}
	
	public static void vkEnter (final JTextField jtextfield){		
		
		jtextfield.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					jtextfield.nextFocus();						
				}
			}		
		});
	}

	public static void vkEnter(final JComboBox jComboBox) {
		jComboBox.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					jComboBox.nextFocus();						
				}
			}		
		});
	}

	public static void vkEnter(final JCheckBox jCheckBox) {
		jCheckBox.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					jCheckBox.nextFocus();						
				}
			}		
		});
	}

	public static void vkEnter(final JSpinner jSpinner) {
		jSpinner.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					jSpinner.nextFocus();						
				}
			}		
		});
	}
	
	/*public static void vkEnter(final DatePicker datePicker_dataReceita) {
		datePicker_dataReceita.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					datePicker_dataReceita.nextFocus();						
				}
			}		
		});
	}*/


	public static void vkEnter(final JTextArea jTextArea) {
		jTextArea.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB){
					jTextArea.nextFocus();						
					jTextArea.setText(jTextArea.getText().trim());
				}
			}		
		});
	}

	public static void vkEnter(final JRadioButton jRadioButton) {
		jRadioButton.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					jRadioButton.nextFocus();
				}
			}		
		});
	}
	
	/*public static void vkF2(final JTextField jTextField, final Class<JDialog> janela, final JComponent nextFocus) {
		jTextField.addKeyListener(new java.awt.event.KeyAdapter() {   
			public void keyPressed(java.awt.event.KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_F2){
					janela = new 						
				}
			}		
		});
	}*/
	
	public static void vkEscape(final JDialog jDialog) {
		EventQueue queue = new EventQueue()
		{
			protected void dispatchEvent (AWTEvent event)
			{
				super.dispatchEvent(event);
				
					String a[];
					String tecla[];
					
					if (!event.paramString().equals(""))
					{
						//System.out.println(event.paramString().substring(0, 5));
						if(event.paramString().substring(0, 5).equals("KEY_P"))
						{
							a = event.paramString().split(",");
							tecla = a[1].split("=");
							
							switch (Integer.parseInt(tecla[1]))
							{
							case KeyEvent.VK_ESCAPE:
								jDialog.dispose();
								break;
								
							default:
								break;
							}
						}
					}
				//System.out.println("event mask: "+event.paramString());
			}
			
		};
		Toolkit.getDefaultToolkit().getSystemEventQueue().push(queue);
	}
		
}
