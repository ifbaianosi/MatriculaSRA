package br.edu.ifbaiano.calculadora.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.StringTokenizer;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;

import br.edu.ifbaiano.calculadora.utils.BackgroundFocusField;
import br.edu.ifbaiano.calculadora.utils.FixedLengthDocument;
import br.edu.ifbaiano.calculadora.utils.IntegerDocument;
import br.edu.ifbaiano.calculadora.utils.keyPressed;

import com.g5.JMoneyTextField;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;

public class aplicacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel_logoIF = null;
	private JPanel jPanel_topo = null;
	private JPanel jPanel_conteudo = null;
	private JPanel jPanel_rodape = null;
	private JPanel jPanel_titulo = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JLabel jLabel12 = null;
	private JLabel jLabel14 = null;
	private JPanel jPanel5 = null;
	private JLabel jLabel16 = null;
	private JLabel jLabel18 = null;
	private JLabel jLabel19 = null;
	private JLabel jLabel17 = null;
	private JLabel jLabel20 = null;
	private JLabel jLabel21 = null;
	private JLabel jLabel51 = null;
	private JLabel jLabel71 = null;
	private JLabel jLabel81 = null;
	private JLabel jLabel22 = null;
	private JLabel jLabel23 = null;
	private JLabel jLabel24 = null;
	private JLabel jLabel25 = null;
	private JPanel jPanel_toolBars = null;
	private JButton jButton_fechar = null;
	private JLabel jLabel26 = null;
	private JLabel jLabel27 = null;
	private JPanel jPanel10 = null;
	private JLabel jLabel28 = null;
	private JLabel jLabel29 = null;
	private JLabel jLabel30 = null;
	private JLabel jLabel11 = null;
	private Image img;
	private JLabel jLabel_imgMEC = null;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNome;
	private JPanel panel_2;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtMatrcula;
	private JTextField textField_2;
	
	/**
	 * This method initializes jLabel_logoIF	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel_logoIF() {
		if (jLabel_logoIF == null) {
			jLabel_logoIF = new JLabel();
			jLabel_logoIF.setText("");
			jLabel_logoIF.setBackground(Color.white);
			jLabel_logoIF.setOpaque(true);
			jLabel_logoIF.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/if-baiano.jpg")));
		}
		return jLabel_logoIF;
	}

	/**
	 * This method initializes jPanel_topo	
	 * 	
	 * @return javax.swing.JPanel	
	 */	
	private JPanel getJPanel_topo() {
		if (jPanel_topo == null) {
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			gridBagConstraints24.gridx = 2;
			gridBagConstraints24.anchor = GridBagConstraints.EAST;
			gridBagConstraints24.insets = new Insets(8, 0, 0, 9);
			gridBagConstraints24.fill = GridBagConstraints.NONE;
			gridBagConstraints24.gridy = 0;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 3;
			gridBagConstraints4.anchor = GridBagConstraints.WEST;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints4.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints.weightx = 1.0;
			gridBagConstraints.gridy = 0;
			jPanel_topo = new JPanel();
			jPanel_topo.setLayout(new GridBagLayout());
			jPanel_topo.setBackground(Color.white);
			jPanel_topo.add(getJLabel_logoIF(), gridBagConstraints);
			jPanel_topo.add(getJLabel_imgMEC(), gridBagConstraints24);
		}
		return jPanel_topo;
	}

	/**
	 * This method initializes jPanel_conteudo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_conteudo() {
		if (jPanel_conteudo == null) {
			jLabel27 = new JLabel();
			jLabel27.setText(" ");
			jLabel26 = new JLabel();
			jLabel26.setText(" ");
			BorderLayout borderLayout = new BorderLayout();
			borderLayout.setHgap(0);
			borderLayout.setVgap(0);
			jPanel_conteudo = new JPanel();
			jPanel_conteudo.setLayout(borderLayout);
			jPanel_conteudo.add(getJPanel_titulo(), BorderLayout.NORTH);
			jPanel_conteudo.add(jLabel26, BorderLayout.WEST);
			jPanel_conteudo.add(jLabel27, BorderLayout.EAST);
			jPanel_conteudo.add(getPanel(), BorderLayout.CENTER);
		}
		return jPanel_conteudo;
	}

	/**
	 * This method initializes jPanel_rodape	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_rodape() {
		if (jPanel_rodape == null) {
			GridBagConstraints gridBagConstraints49 = new GridBagConstraints();
			gridBagConstraints49.gridx = 0;
			gridBagConstraints49.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints49.gridy = 0;
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridx = 0;
			gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.insets = new Insets(2, 0, 0, 0);
			gridBagConstraints5.gridy = 1;
			jPanel_rodape = new JPanel();
			jPanel_rodape.setLayout(new GridBagLayout());
			jPanel_rodape.setBackground(new Color(255, 51, 51));
			jPanel_rodape.add(getJPanel5(), gridBagConstraints5);
			jPanel_rodape.add(getJPanel_toolBars(), gridBagConstraints49);
		}
		return jPanel_rodape;
	}

	/**
	 * This method initializes jPanel_titulo	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_titulo() {
		if (jPanel_titulo == null) {
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints6.anchor = GridBagConstraints.NORTH;
			gridBagConstraints6.weightx = 1.0;
			gridBagConstraints6.insets = new Insets(2, 0, 0, 0);
			gridBagConstraints6.gridy = 0;
			jLabel4 = new JLabel();
			jLabel4.setText("Ficha de Matr\u00EDcula");
			jLabel4.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel4.setBackground(new Color(51, 153, 0));
			jLabel4.setOpaque(true);
			jLabel4.setForeground(Color.white);
			jPanel_titulo = new JPanel();
			jPanel_titulo.setLayout(new GridBagLayout());
			jPanel_titulo.setBackground(new Color(255, 51, 51));
			jPanel_titulo.add(jLabel4, gridBagConstraints6);
		}
		return jPanel_titulo;
	}

	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			GridBagConstraints gridBagConstraints53 = new GridBagConstraints();
			gridBagConstraints53.gridx = 0;
			gridBagConstraints53.anchor = GridBagConstraints.WEST;
			gridBagConstraints53.gridwidth = 1;
			gridBagConstraints53.gridheight = 5;
			gridBagConstraints53.gridy = 0;
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.gridx = 1;
			gridBagConstraints31.anchor = GridBagConstraints.EAST;
			gridBagConstraints31.weightx = 0.0;
			gridBagConstraints31.insets = new Insets(0, 0, 4, 4);
			gridBagConstraints31.gridy = 4;
			jLabel21 = new JLabel();
			jLabel21.setText("Ramal: 109");
			jLabel21.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
			gridBagConstraints30.gridx = 1;
			gridBagConstraints30.anchor = GridBagConstraints.EAST;
			gridBagConstraints30.weightx = 0.0;
			gridBagConstraints30.insets = new Insets(0, 0, 0, 4);
			gridBagConstraints30.gridy = 3;
			jLabel20 = new JLabel();
			jLabel20.setText("Secretaria de Registros Acad\u00EAmicos");
			jLabel20.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			gridBagConstraints27.gridx = 1;
			gridBagConstraints27.anchor = GridBagConstraints.EAST;
			gridBagConstraints27.weightx = 0.0;
			gridBagConstraints27.insets = new Insets(4, 0, 0, 4);
			gridBagConstraints27.gridy = 1;
			jLabel17 = new JLabel();
			jLabel17.setText("SRA");
			GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
			gridBagConstraints29.gridx = 0;
			gridBagConstraints29.anchor = GridBagConstraints.EAST;
			gridBagConstraints29.insets = new Insets(4, 4, 0, 10);
			gridBagConstraints29.weightx = 1.0;
			gridBagConstraints29.gridy = 1;
			jLabel19 = new JLabel();
			jLabel19.setText("NGTI");
			GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
			gridBagConstraints28.gridx = 0;
			gridBagConstraints28.anchor = GridBagConstraints.EAST;
			gridBagConstraints28.insets = new Insets(0, 4, 4, 10);
			gridBagConstraints28.weightx = 1.0;
			gridBagConstraints28.gridy = 4;
			jLabel18 = new JLabel();
			jLabel18.setText("Ramal.: 32");
			jLabel18.setFont(new Font("Dialog", Font.PLAIN, 8));
			GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
			gridBagConstraints26.gridx = 0;
			gridBagConstraints26.anchor = GridBagConstraints.EAST;
			gridBagConstraints26.insets = new Insets(0, 4, 0, 10);
			gridBagConstraints26.weightx = 1.0;
			gridBagConstraints26.gridy = 3;
			jLabel16 = new JLabel();
			jLabel16.setText("Núcleo de Gestão em Tecnologia da Informação");
			jLabel16.setFont(new Font("Dialog", Font.PLAIN, 8));
			jPanel5 = new JPanel();
			jPanel5.setLayout(new GridBagLayout());
			jPanel5.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel5.setBackground(new Color(204, 255, 204));
			jPanel5.add(jLabel16, gridBagConstraints26);
			jPanel5.add(jLabel18, gridBagConstraints28);
			jPanel5.add(jLabel19, gridBagConstraints29);
			jPanel5.add(jLabel17, gridBagConstraints27);
			jPanel5.add(jLabel20, gridBagConstraints30);
			jPanel5.add(jLabel21, gridBagConstraints31);
			jPanel5.add(getJPanel10(), gridBagConstraints53);
		}
		return jPanel5;
	}

	/**
	 * This method initializes jPanel_toolBars	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel_toolBars() {
		if (jPanel_toolBars == null) {
			GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
			gridBagConstraints47.gridx = 1;
			gridBagConstraints47.insets = new Insets(5, 0, 5, 5);
			gridBagConstraints47.weightx = 1.0;
			gridBagConstraints47.anchor = GridBagConstraints.EAST;
			gridBagConstraints47.gridy = 0;
			jPanel_toolBars = new JPanel();
			jPanel_toolBars.setLayout(new GridBagLayout());
			jPanel_toolBars.setBackground(Color.white);
			jPanel_toolBars.add(getJButton_fechar(), gridBagConstraints47);
		}
		return jPanel_toolBars;
	}

	/**
	 * This method initializes jButton_fechar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	public JButton getJButton_fechar() {
		if (jButton_fechar == null) {
			jButton_fechar = new JButton();
			jButton_fechar.setText("Sair");
			jButton_fechar.setMnemonic(KeyEvent.VK_UNDEFINED);
			jButton_fechar.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/nav-remove.png")));
			jButton_fechar.setToolTipText("Fechar [Esc]");
			jButton_fechar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return jButton_fechar;
	}

	/**
	 * This method initializes jPanel10	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel10() {
		if (jPanel10 == null) {
			GridBagConstraints gridBagConstraints52 = new GridBagConstraints();
			gridBagConstraints52.gridx = 0;
			gridBagConstraints52.anchor = GridBagConstraints.WEST;
			gridBagConstraints52.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints52.insets = new Insets(0, 4, 4, 0);
			gridBagConstraints52.gridy = 2;
			jLabel30 = new JLabel();
			jLabel30.setText("Tel.: (73) 3536-1210");
			jLabel30.setFont(new Font("Dialog", Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints51 = new GridBagConstraints();
			gridBagConstraints51.gridx = 0;
			gridBagConstraints51.anchor = GridBagConstraints.WEST;
			gridBagConstraints51.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints51.insets = new Insets(0, 4, 0, 0);
			gridBagConstraints51.gridy = 1;
			jLabel29 = new JLabel();
			jLabel29.setText("BR 420 (Rodovia Santa Inês – Ubaíra), Zona Rural, Bahia");
			jLabel29.setFont(new Font("Dialog", Font.PLAIN, 10));
			GridBagConstraints gridBagConstraints50 = new GridBagConstraints();
			gridBagConstraints50.gridx = 0;
			gridBagConstraints50.anchor = GridBagConstraints.WEST;
			gridBagConstraints50.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints50.insets = new Insets(4, 4, 0, 0);
			gridBagConstraints50.gridy = 0;
			jLabel28 = new JLabel();
			jLabel28.setText("IF Baiano – Campus Santa Inês");
			jLabel28.setFont(new Font("Dialog", Font.PLAIN, 10));
			jPanel10 = new JPanel();
			jPanel10.setLayout(new GridBagLayout());
			jPanel10.setBackground(new Color(204, 255, 204));
			jPanel10.add(jLabel28, gridBagConstraints50);
			jPanel10.add(jLabel29, gridBagConstraints51);
			jPanel10.add(jLabel30, gridBagConstraints52);
		}
		return jPanel10;
	}

	/**
	 * This method initializes jLabel_imgMEC	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabel_imgMEC() {
		if (jLabel_imgMEC == null) {
			jLabel_imgMEC = new JLabel();
			jLabel_imgMEC.setText("");
			jLabel_imgMEC.setIcon(new ImageIcon(getClass().getResource("/br/edu/ifbaiano/calculadora/img/ministerio_da_educacao_90x30.jpg")));
			
			/**
			 * só executa apartir da versão 1.3 do java
			 */
			/*File logo;
			try {
				logo = new File(getClass().getResource("/br/edu/ifbaiano/calculadora/img/1268245122.jpg").toURI());
				BufferedImage imgMEC = ImageIO.read(logo); 
				
				Image imagemMenor = imgMEC.getScaledInstance(90, 30, Image.SCALE_SMOOTH);
				jLabel_imgMEC.setIcon(new ImageIcon(imagemMenor));
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		return jLabel_imgMEC;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				aplicacao thisClass = new aplicacao();
				thisClass.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public aplicacao() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(760, 761);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/edu/ifbaiano/calculadora/img/LogoIF.jpg")));
		this.setContentPane(getJContentPane());
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.setStackTrace(null);
		}
		
		defaultBotton();
		
	}

	private void defaultBotton() {
		/**
		 *  botao padrao da tela  
		 */
		/*this.getRootPane().setDefaultButton(getJButton());
		UIManager.put("Button.defaultButtonFollowsFocus", Boolean.TRUE);*/
		
		/**
		 *  evento da tecla Esc 
		 *  fecha a janela  
		 */
		getJButton_fechar().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ESCAPE"), "actionName");
		getJButton_fechar().getActionMap().put("actionName",new AbstractAction("actionName") 
			{
				public void actionPerformed(ActionEvent evt) {
					dispose();
				}
			}
		);
	}

	
	
	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel_topo(), BorderLayout.NORTH);
			jContentPane.add(getJPanel_rodape(), BorderLayout.SOUTH);
			jContentPane.add(getJPanel_conteudo(), BorderLayout.CENTER);
		}
		return jContentPane;
	}	

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(new Rectangle(46, 21, 623, 416));
			panel.setLayout(null);
			panel.add(getPanel_1());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(0, 0, 738, 487);
			panel_1.setBackground(Color.WHITE);
			panel_1.setLayout(null);
			panel_1.add(getLblNome());
			panel_1.add(getPanel_2());
			
			textField = new JTextField();
			textField.setBounds(10, 30, 422, 20);
			panel_1.add(textField);
			textField.setColumns(10);
			
			JLabel lblCpf = new JLabel("Cpf:");
			lblCpf.setBounds(443, 10, 58, 14);
			panel_1.add(lblCpf);
			
			textField_1 = new JTextField();
			textField_1.setBounds(442, 30, 161, 20);
			panel_1.add(textField_1);
			textField_1.setColumns(10);
			
			txtMatrcula = new JTextField();
			txtMatrcula.setBounds(613, 30, 115, 20);
			panel_1.add(txtMatrcula);
			txtMatrcula.setColumns(10);
			
			JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
			lblMatrcula.setBounds(613, 10, 83, 14);
			panel_1.add(lblMatrcula);
			
			JLabel lblNewLabel = new JLabel("Data Nascimento:");
			lblNewLabel.setBounds(10, 60, 125, 14);
			panel_1.add(lblNewLabel);
			panel_1.add(getTextField_2());
		}
		return panel_1;
	}
	private JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel();
			lblNome.setBounds(10, 10, 58, 14);
			lblNome.setText("Nome:");
			lblNome.setHorizontalAlignment(SwingConstants.LEADING);
		}
		return lblNome;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setBounds(0, 461, 738, 23);
			panel_2.setBackground(Color.WHITE);
			GridBagLayout gbl_panel_2 = new GridBagLayout();
			gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0};
			gbl_panel_2.rowHeights = new int[]{0, 0};
			gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_panel_2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			panel_2.setLayout(gbl_panel_2);
			GridBagConstraints gbc_button_1 = new GridBagConstraints();
			gbc_button_1.weighty = 0.0;
			gbc_button_1.weightx = 1.0;
			gbc_button_1.ipady = 0;
			gbc_button_1.ipadx = 0;
			gbc_button_1.gridwidth = 1;
			gbc_button_1.fill = GridBagConstraints.NONE;
			gbc_button_1.anchor = GridBagConstraints.EAST;
			gbc_button_1.insets = new Insets(0, 0, 0, 5);
			gbc_button_1.gridx = 0;
			gbc_button_1.gridy = 0;
			panel_2.add(getButton_1(), gbc_button_1);
			GridBagConstraints gbc_button_2 = new GridBagConstraints();
			gbc_button_2.insets = new Insets(0, 5, 0, 0);
			gbc_button_2.gridx = 1;
			gbc_button_2.gridy = 0;
			panel_2.add(getButton_2(), gbc_button_2);
			GridBagConstraints gbc_button = new GridBagConstraints();
			gbc_button.weighty = 1.0;
			gbc_button.weightx = 0.0;
			gbc_button.ipady = 0;
			gbc_button.ipadx = 0;
			gbc_button.insets = new Insets(0, 5, 0, 0);
			gbc_button.fill = GridBagConstraints.VERTICAL;
			gbc_button.anchor = GridBagConstraints.EAST;
			gbc_button.gridx = 2;
			gbc_button.gridy = 0;
			panel_2.add(getButton(), gbc_button);
		}
		return panel_2;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton();
			button.setToolTipText("Limpar campos [F4]");
			button.setText("Limpar");
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton();
			button_1.setToolTipText("");
			button_1.setText("Calcular");
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton();
			button_2.setText("Imprimir");
		}
		return button_2;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(10, 85, 115, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
