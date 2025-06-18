package br.dev.celso.tarefas_ds1ta.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.dev.celso.tarefas_ds1ta.dao.FuncionarioDAO;
import br.dev.celso.tarefas_ds1ta.model.Funcionario;

public class TarefasFrame {
	
	private JLabel labelTitulo;
	private JButton btnNovaTarefa;
	
	private JTable tabelaTarefas;
	private DefaultTableModel modelFuncionarios; 

	private JScrollPane scroll; 

	 

	private String[] colunas = {"Código", "Nome", "Responsável"}; 

	 

	public TarefasFrame(JFrame tela) {
		criarTela();


	} 
	
	private void criarTela(JFrame parent) { 

		 

		JDialog tela = new JDialog(parent, true); 

		tela.setSize(600, 500); 

		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		tela.setResizable(false); 

		tela.setLayout(null); 

		tela.setLocationRelativeTo(null); 

		 

		Container painel = tela.getContentPane(); 

		 

		labelTitulo = new JLabel("Lista de Tarefas"); 

		labelTitulo.setFont(new Font("arial", Font.BOLD, 28)); 

		labelTitulo.setForeground(new Color(100, 0, 100)); 

		labelTitulo.setBounds(10, 10, 400, 40); 

		 

		modelFuncionarios = new DefaultTableModel(colunas, 1); 

		carregarDados(); 

		tabelaTarefas = new JTable(model); 

		scroll = new JScrollPane(tabelaTarefas); 

		scroll.setBounds(10, 60, 580, 340); 

		 

		btnNovaTarefa = new JButton("Nova Tarefa"); 

		btnNovaTarefa.setBounds(10, 410, 150, 40); 

		 

		btnNovaTarefa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroTarefas(tela);
				carregarDados();
				
			}
		}); 
		
		painel.add(labelTitulo); 

		painel.add(scroll); 

		painel.add(btnNovaTarefa); 

		 

		 

		tela.setVisible(true); 

		 

	} 

 

	private Object[][] carregarDados() { 

		// Obter os dados que serão exibidos na Tabela 

		FuncionarioDAO dao = new FuncionarioDAO(null); 

		List<Funcionario> funcionarios = dao.getFuncionarios(); 

		 

		Object[][] dados = new Object[funcionarios.size()][3]; 

		 

		int i = 0; 

		for(Funcionario f : funcionarios) { 

			dados[i][0] = f.getMatricula(); 

			dados[i][1] = f.getNome(); 

			dados[i][2] = f.getCargo(); 

			i++; 

		} 

		modelFuncionarios.setDataVector(dados, colunas);; 

		return dados; 

	} 

	 

 

}
