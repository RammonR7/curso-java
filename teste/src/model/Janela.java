package model;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTextField txtTelefone;
	private JTable table;
	private ContatoDao dao = new ContatoDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setBounds(100, 100, 633, 415);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel labelId = new JLabel("Id:");
		labelId.setBounds(10, 11, 46, 14);
		getContentPane().add(labelId);
		
		txtId = new JTextField();
		txtId.setBounds(10, 36, 130, 20);
		getContentPane().add(txtId);
		txtId.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 67, 46, 14);
		getContentPane().add(labelNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(10, 86, 130, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel labelSobrenome = new JLabel("Sobrenome:");
		labelSobrenome.setBounds(10, 117, 70, 14);
		getContentPane().add(labelSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(10, 142, 130, 20);
		getContentPane().add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel labelIdade = new JLabel("Idade:");
		labelIdade.setBounds(10, 173, 46, 14);
		getContentPane().add(labelIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(10, 198, 130, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 229, 46, 14);
		getContentPane().add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(10, 254, 130, 20);
		getContentPane().add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String telefone = txtTelefone.getText();
				
				Contato c1 = new Contato();
				
				c1.setNome(nome);
				c1.setSobrenome(sobrenome);
				c1.setIdade(idade);
				c1.setTelefone(telefone);
				
				dao.salvarDao(c1);
				
				limpaRegistros();
				JOptionPane.showInternalMessageDialog(btnAdicionar, "Usuário adicionado com sucesso.");
				
			}
		});
		btnAdicionar.setBounds(10, 306, 89, 23);
		getContentPane().add(btnAdicionar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = table.getSelectedRow();
				
				txtId.setText(table.getValueAt(num, 0).toString());
				txtNome.setText(table.getValueAt(num, 1).toString());
				txtSobrenome.setText(table.getValueAt(num, 2).toString());
				txtIdade.setText(table.getValueAt(num, 3).toString());
				txtTelefone.setText(table.getValueAt(num, 4).toString());
				
				
			}
		});
		btnListar.setBounds(109, 306, 89, 23);
		getContentPane().add(btnListar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long id = Long.parseLong(txtId.getText());
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String telefone = txtTelefone.getText();
				
				Contato c1 = new Contato();
				
				c1.setId(id);
				c1.setNome(nome);
				c1.setSobrenome(sobrenome);
				c1.setIdade(idade);
				c1.setTelefone(telefone);
				
				dao.salvarDao(c1);
				
				limpaRegistros();
				JOptionPane.showInternalMessageDialog(btnEditar, "Usuário alterado com sucesso.");
			}
		});
		btnEditar.setBounds(208, 306, 89, 23);
		getContentPane().add(btnEditar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num = table.getSelectedRow();
				long id = (long) table.getValueAt(num, 0);
				
				dao.deletarDao(id);
				limpaRegistros();
				JOptionPane.showInternalMessageDialog(btnDeletar, "Uusuário deletado com sucesso.");
			}
		});
		btnDeletar.setBounds(307, 306, 89, 23);
		getContentPane().add(btnDeletar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(150, 36, 457, 244);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "Sobrenome", "Idade", "Telefone"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, String.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(table);
		
		mostraRegistros();
	}
	
	public void limpaTela() {
		txtId.setText("");
		txtNome.setText("");
		txtSobrenome.setText("");
		txtIdade.setText("");
		txtTelefone.setText("");
	}
	
	public void mostraRegistros() {
		List<Contato> contatos = dao.consultarDao();
		DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		
		for(Contato contato : contatos) {
			modelo.addRow(new Object[] {contato.getId(),
					contato.getNome(),
					contato.getSobrenome(),
					contato.getidade(),
					contato.getTelefone()
			});
		}}
		
		public void limpaRegistros() {
			DefaultTableModel modelo1 = (DefaultTableModel) table.getModel();
			modelo1.setNumRows(0);
			
			limpaTela();
			mostraRegistros();
		}
	}

