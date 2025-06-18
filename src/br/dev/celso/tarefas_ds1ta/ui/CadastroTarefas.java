package br.dev.celso.tarefas_ds1ta.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.celso.tarefas_ds1ta.model.Tarefa;

public class CadastroTarefas {
	
	public CadastroTarefas(JFrame tela) {
		
		criarTela(tela);
	}

	private void criarTela(JFrame parent) { 

		 

		JDialog tela = new JDialog(parent, true); 

		tela.setSize(400, 400); 

		tela.setTitle("Cadastro de tarefas"); 

		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 

		tela.setLayout(null); 

		tela.setLocationRelativeTo(null); 

		 

		JLabel labelTitulo = new JLabel("Titulo:"); 

		labelTitulo.setBounds(10, 10, 150, 30); 

		JTextField txtTitulo = new JTextField(); 

		txtTitulo.setBounds(10, 40, 200, 30); 

		 

		JLabel labelDescricao = new JLabel("Descrição:"); 

		labelDescricao.setBounds(10, 75, 150, 30); 

		JTextField txtDescricao = new JTextField(); 

		txtDescricao.setBounds(10, 105, 150, 30); 

		 

		JLabel labelDataInicial = new JLabel("Data Inicial:"); 

		labelDataInicial.setBounds(10, 140, 150, 30); 

		JTextField txtDataInicial = new JTextField(); 

		txtDataInicial.setBounds(10, 170, 200, 30); 
		
		
		JLabel labelPrazo = new JLabel("Prazo:"); 

		labelPrazo.setBounds(10, 140, 150, 30); 

		JTextField txtPrazo = new JTextField(); 

		txtPrazo.setBounds(10, 170, 200, 30);
		
		
		JLabel labelDataConclusao = new JLabel("Data conclusão:");
		labelDataConclusao.setBounds(10, 140, 150, 30); 

		JTextField txtDataConclusao = new JTextField(); 

		txtDataConclusao.setBounds(10, 170, 200, 30);
		
		
		JLabel labelStatus = new JLabel("Status:"); 

		labelStatus.setBounds(10, 140, 150, 30); 

		JTextField txtStatus = new JTextField(); 

		txtStatus.setBounds(10, 170, 200, 30);

		 

		JButton btnSalvar = new JButton("Salvar"); 

		btnSalvar.setBounds(10, 250, 150, 40); 

		 

		JButton btnSair = new JButton("Sair"); 

		btnSair.setBounds(170, 250, 100, 40); 

		 

		Container painel = tela.getContentPane(); 

		painel.add(labelTitulo); 

		painel.add(txtTitulo); 

		painel.add(labelDescricao); 

		painel.add(txtDescricao); 

		painel.add(labelDataInicial); 

		painel.add(txtDataInicial); 
		
		painel.add(labelPrazo);
		
		painel.add(txtPrazo);
		
		painel.add(labelDataConclusao); 

		painel.add(txtDataConclusao);
		
		painel.add(labelStatus); 

		painel.add(txtStatus);

		painel.add(btnSalvar); 

		painel.add(btnSair); 

		 

	btnSalvar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Tarefa t = new Tarefa();
			t.set
			
		}
	});
