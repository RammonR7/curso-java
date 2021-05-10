package janela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;

public class janela extends JFrame {
	private JTextField textId;
	private JTextField textNome;
	private JTextField textSobrenome;
	private JTextField textTelefone;
	private JTextField textIdade;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public janela() {
		setType(Type.POPUP);
		getContentPane().setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 430);
		getContentPane().setLayout(null);
		
		JLabel lblAgenda = new JLabel("Agenda");
		lblAgenda.setFont(new Font("Arial Black", Font.PLAIN, 14));
		lblAgenda.setBounds(190, 11, 83, 26);
		getContentPane().add(lblAgenda);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 102, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(10, 127, 68, 14);
		getContentPane().add(lblSobrenome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 152, 56, 14);
		getContentPane().add(lblTelefone);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 77, 46, 14);
		getContentPane().add(lblId);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 177, 46, 14);
		getContentPane().add(lblIdade);
		
		textId = new JTextField();
		textId.setBounds(66, 77, 207, 14);
		getContentPane().add(textId);
		textId.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(66, 100, 207, 17);
		getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textSobrenome = new JTextField();
		textSobrenome.setBounds(66, 125, 207, 17);
		getContentPane().add(textSobrenome);
		textSobrenome.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(66, 150, 207, 17);
		getContentPane().add(textTelefone);
		textTelefone.setColumns(10);
		
		textIdade = new JTextField();
		textIdade.setBounds(66, 175, 207, 17);
		getContentPane().add(textIdade);
		textIdade.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 211, 102, 23);
		getContentPane().add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Listar");
		btnCancelar.setBounds(10, 245, 102, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(122, 211, 95, 23);
		getContentPane().add(btnAlterar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(122, 245, 95, 23);
		getContentPane().add(btnDeletar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(283, 70, 343, 291);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Source Sans Pro Semibold", Font.PLAIN, 11));
		table.setForeground(Color.BLACK);
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id", "Nome", "Sobrenome", "Telefone", "Idade"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(0).setMinWidth(10);
		scrollPane.setViewportView(table);
	}
}
