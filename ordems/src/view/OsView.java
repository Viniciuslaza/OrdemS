package view;

//Importando os componentes
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.TableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

import controller.OsController;

import model.Os;
import model.TabelaOs;

//Declarando a classe na janela
public class OsView extends JFrame implements ActionListener{
	//atributos globais da classe
	JPanel painelTitulo;
	JPanel painelCadastro;
	JLabel titulo;
    
    JLabel 		cliente_idLabel;
    JTextField 	cilente_idField;
    
    JLabel 		nm_clienteLabel;
    JTextField 	nm_cilenteField;
    
    JLabel 		usuario_idLabel;
    JTextField 	usuario_idField;
    
    JLabel 		data_previsaoLabel;
    JTextField 	data_previsaoField;
    
    JLabel 		data_prontoLabel;
    JTextField 	data_prontoField;
    
    JLabel 		data_entregaLabel;
    JTextField 	data_entregaField;
    
    JLabel 		garantiaLabel;
    
    JLabel 		tipoLabel;
    JTextField 	tipoField;
    
    JLabel 		modeloLabel;
    JTextField 	modeloField;
    
    JLabel 		marcaLabel;
    JTextField 	marcaField;
    
    JLabel 		corLabel;
    JTextField 	corField;
    
    JLabel 		serieLabel;
    JTextField 	serieField;
    
    JLabel 		info_clienteLabel;
    JTextArea 	info_clienteTA;
    
    JLabel 		info_tecnicoLabel;
    JTextArea 	info_tecnicoTA;
    
    JLabel 		info_entregaLabel;
    JTextArea 	info_entregaTA;
    
    JLabel 		info_internaLabel;
    JTextArea 	info_internaTA;
    
    //Inicia o painel dos botoes
    JPanel painelBotoes;
    JButton botaoSalvar;
    JButton botaoCancelar;
    JButton botaoEditar;
    JButton botaoExcluir;
    
    private JTable osTable;
    private TabelaOs tabelaOs;
    
    private JTextField buscarField;

	public OsView() { // construtor da view OS.
        super("Cadastro de Ordem de Servi�o");
        setType(Type.UTILITY);
                
        criaFormulario();
    	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	this.setSize(680, 600);
    	this.setVisible(true);
    	this.setLocationRelativeTo(null);
    }
    
    private void criaFormulario() {
        
        getContentPane().setLayout(new BorderLayout());
        
        //Inicia o painel de t�tulo    
        painelTitulo = new JPanel();
        painelTitulo.setLayout(new FlowLayout());
        
        titulo = new JLabel("Cadastro de O.S");
        titulo.setFont(new Font("Arial", Font.BOLD, 14));
        
        painelTitulo.add(titulo);
        
        //Inicia o painel dos campos digit�veis        
        painelCadastro = new JPanel();
        
        //Inicia o painel dos botoes
        painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout());
        
        botaoSalvar = new JButton("Salvar");
        botaoCancelar = new JButton("Cancelar");
        
        getContentPane().add(painelCadastro, BorderLayout.WEST);
        
        JPanel clientePainel = new JPanel();
        clientePainel.setBorder(new LineBorder(Color.LIGHT_GRAY));
        clientePainel.setLayout(null);
        
        JPanel equipamentoPanel = new JPanel();
        equipamentoPanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
        equipamentoPanel.setLayout(null);
        
        
        cliente_idLabel = new JLabel("ID Cliente");
        cliente_idLabel.setBounds(10, 11, 47, 14);        
        cilente_idField = new JTextField(6);
        clientePainel.add(cliente_idLabel);
        cilente_idField.setBounds(10, 24, 64, 20);
        clientePainel.add(cilente_idField);
        
        nm_clienteLabel = new JLabel("Nome do Cliente");
        nm_clienteLabel.setBounds(84, 11, 326, 14);        
        nm_cilenteField = new JTextField(40);
        clientePainel.add(nm_clienteLabel);
        nm_cilenteField.setBounds(84, 24, 326, 20);
        clientePainel.add(nm_cilenteField);
        
        usuario_idLabel = new JLabel("Usu�rio");
        usuario_idLabel.setBounds(504, 11, 99, 14);        
        usuario_idField = new JTextField(6);
        clientePainel.add(usuario_idLabel);
        usuario_idField.setBounds(504, 24, 99, 20);
        clientePainel.add(usuario_idField);
        
        data_previsaoLabel = new JLabel("Data Prevista");
        data_previsaoLabel.setBounds(10, 55, 85, 15);        
        data_previsaoField = new JTextField(10);
        clientePainel.add(data_previsaoLabel);
        data_previsaoField.setBounds(10, 70, 85, 20);
        clientePainel.add(data_previsaoField);
       
        data_prontoLabel = new JLabel("Data Pronto");
        data_prontoLabel.setBounds(105, 55, 85, 15);
        clientePainel.add(data_prontoLabel);
        data_prontoField = new JTextField(10);
        data_prontoField.setSize(85, 20);
        data_prontoField.setLocation(110, 70);
        data_prontoField.setBounds(105, 70, 86, 20);
        clientePainel.add(data_prontoField);
       
        data_entregaLabel = new JLabel("Data Entrega");
        data_entregaLabel.setBounds(200, 55, 79, 15);
        clientePainel.add(data_entregaLabel);
        data_entregaField = new JTextField(10);
        data_entregaField.setSize(85, 20);
        data_entregaField.setLocation(210, 70);
        data_entregaField.setBounds(201, 70, 86, 20);
        clientePainel.add(data_entregaField);
        
        garantiaLabel = new JLabel("Garantia?");
        garantiaLabel.setBounds(311, 55, 85, 15);
        clientePainel.add(garantiaLabel);
        
        JButton listarBtn = new JButton("Listar");
        listarBtn.setBounds(420, 22, 74, 25);
        clientePainel.add(listarBtn);
        
        JCheckBox garantiaCkBox = new JCheckBox(" Sim");
        garantiaCkBox.setBounds(311, 73, 52, 14);
        clientePainel.add(garantiaCkBox);
        
        tipoLabel = new JLabel("Tipo Equipamento");
        tipoLabel.setBounds(11, 0, 164, 14);        
        tipoField = new JTextField(20);
        equipamentoPanel.add(tipoLabel);
        tipoField.setBounds(11, 15, 166, 20);
        equipamentoPanel.add(tipoField);
        
        modeloLabel = new JLabel("Modelo");
        modeloLabel.setBounds(190, 0, 166, 14);        
        modeloField = new JTextField(20);
        equipamentoPanel.add(modeloLabel);
        modeloField.setBounds(190, 15, 100, 20);
        equipamentoPanel.add(modeloField);
        
        marcaLabel = new JLabel("Marca");
        marcaLabel.setBounds(300, 0, 129, 14);        
        marcaField = new JTextField(20);
        equipamentoPanel.add(marcaLabel);
        marcaField.setBounds(300, 15, 129, 20);
        equipamentoPanel.add(marcaField);
        
        corLabel = new JLabel("Cor");
        corLabel.setBounds(440, 0, 86, 14);        
        corField = new JTextField(10);
        equipamentoPanel.add(corLabel);
        corField.setBounds(439, 15, 86, 20);
        equipamentoPanel.add(corField);
        
        serieLabel = new JLabel("N/S");
        serieLabel.setBounds(536, 1, 86, 14);        
        serieField = new JTextField(10);
        equipamentoPanel.add(serieLabel);
        serieField.setBounds(536, 15, 86, 20);
        equipamentoPanel.add(serieField);
        
        info_clienteLabel = new JLabel("Informa��es do cliente");
        info_clienteLabel.setBounds(10, 45, 300, 14);
        equipamentoPanel.add(info_clienteLabel);        
        JTextArea info_clienteTA = new JTextArea(3, 200);
        info_clienteTA.setLineWrap(true);
        info_clienteTA.setForeground(Color.DARK_GRAY);
        info_clienteTA.setEditable(true);
        info_clienteTA.setBounds(10, 60, 300, 60);
        equipamentoPanel.add(info_clienteTA);
        
        info_tecnicoLabel = new JLabel("Informa��es do t�cnico");
        info_tecnicoLabel.setBounds(322, 45, 302, 14);
        equipamentoPanel.add(info_tecnicoLabel);        
        JTextArea info_tecnicoTA = new JTextArea(3, 200);
        info_tecnicoTA.setForeground(Color.DARK_GRAY);
        info_tecnicoTA.setBounds(322, 60, 300, 60);
        equipamentoPanel.add(info_tecnicoTA);
        
        info_entregaLabel = new JLabel("Informa��es interna");
        info_entregaLabel.setBounds(10, 134, 310, 14);
        equipamentoPanel.add(info_entregaLabel);        
        JTextArea info_entregaTA = new JTextArea(3, 200);
        info_entregaTA.setForeground(Color.DARK_GRAY);
        info_entregaTA.setBounds(10, 150, 300, 60);
        equipamentoPanel.add(info_entregaTA);
        
        info_internaLabel = new JLabel("Informa��es da entrega");
        info_internaLabel.setBounds(322, 134, 300, 14);
        equipamentoPanel.add(info_internaLabel);        
        JTextArea info_internaTA = new JTextArea(3, 200);
        info_internaTA.setForeground(Color.DARK_GRAY);
        info_internaTA.setBounds(322, 150, 300, 60);
        equipamentoPanel.add(info_internaTA);
        
        //Criando a Tabela com os dados do banco
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportBorder(new LineBorder(Color.LIGHT_GRAY));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        botaoEditar = new JButton("Editar");
        botaoExcluir = new JButton("Excluir");
        
        buscarField = new JTextField();
        buscarField.setBackground(new Color(250, 250, 210));
        buscarField.setFont(new Font("Tahoma", Font.PLAIN, 12));
        buscarField.setColumns(10);
        
        JButton buscarBtn = new JButton("Buscar");
        
        GroupLayout gl_painelCadastro = new GroupLayout(painelCadastro);
        gl_painelCadastro.setHorizontalGroup(
        	gl_painelCadastro.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_painelCadastro.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_painelCadastro.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_painelCadastro.createSequentialGroup()
        					.addGroup(gl_painelCadastro.createParallelGroup(Alignment.LEADING)
        						.addGroup(gl_painelCadastro.createSequentialGroup()
        							.addComponent(buscarField, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(buscarBtn, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
        							.addComponent(botaoEditar, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(botaoExcluir, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
        						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        						.addComponent(clientePainel, GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        					.addGap(20))
        				.addGroup(gl_painelCadastro.createSequentialGroup()
        					.addComponent(equipamentoPanel, GroupLayout.PREFERRED_SIZE, 641, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(20, Short.MAX_VALUE))))
        );
        gl_painelCadastro.setVerticalGroup(
        	gl_painelCadastro.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_painelCadastro.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(clientePainel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(equipamentoPanel, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(gl_painelCadastro.createParallelGroup(Alignment.BASELINE)
        				.addComponent(buscarField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(buscarBtn, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoExcluir, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(botaoEditar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        			.addContainerGap())
        );
        
        
        tabelaOs = new TabelaOs();
        osTable = new JTable(tabelaOs);
        
             
        scrollPane.setViewportView(osTable);
        
        painelCadastro.setLayout(gl_painelCadastro);
        
        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
        
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoCancelar);
        
        botaoSalvar.addActionListener(this);
        botaoSalvar.setActionCommand("salvar");
        botaoCancelar.addActionListener(this);
        botaoCancelar.setActionCommand("cancelar");

    }
    
    
//	private JTable JTable(TableModel tabelaOs) {
//		
//		return null;
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		
//		if(e.getActionCommand().equalsIgnoreCase("salvar")) {
//			Os o = new Os();
//			
//			//Tratar a a��o de salvar OS
//						
//			//tipo
//			o.setTipo(tipoField.getText());			
//			//modelo
//			o.setModelo(modeloField.getText());			
//			//marca
//			o.setMarca(marcaField.getText());
//			//cor
//			o.setCor(corField.getText());
//			//serie
//			o.setSerie(serieField.getText());
//
//			OsController controleOs = new OsController();
//			try {
//				if(controleOs.cadastrarOs(o) == true) {
//					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
//				}
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//				JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro!");
//			}
//		}
//		else if(e.getActionCommand().equalsIgnoreCase("cancelar")) {
// 
//			dispose();
//		}
    
    
    
public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equalsIgnoreCase("salvar")) {
			
			Os o = new Os();
			
			
			}
			//Tipo
			System.out.println("Tipo: " +o.getTipo());
			//nome
			.setNm_cliente(nm_clienteField.getText());			
			//documento
			c.setDoc_num(docField.getText());			
			//RGIE
			c.setRg_ie(rgieField.getText());
			//fone fixo
			c.setFone_re(fone_reField.getText());
			//celular
			c.setCelular(celularField.getText());
			//email
			c.setEmail(emailField.getText());
			//pessoa contato
			c.setPes_contato(pes_contatoField.getText());
			//Logradouro
			c.getEndereco().setCep(cepField.getText());
			//Logradouro
			c.getEndereco().setLogradouro(enderecoField.getText());
			//numero
			c.getEndereco().setNumero(numeroField.getText());
			//complemento
			c.getEndereco().setComplemento(complementoField.getText());
			//bairro
			c.getEndereco().setBairro(bairroField.getText());
			//cidade
			c.getEndereco().setCidade(cidadeField.getText());
			//estado
			c.getEndereco().setEstado(estadoField.getText());
			
			Object[] opcoes = {"Salvar como novo cadastro", "Atualizar", "Limpar todos campos"};
			
			int op = JOptionPane.showOptionDialog(null, "Escolha uma op��o para continuar", "Aviso",
		          JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		              null, opcoes, opcoes[0]);
			
			if(op == 0) { //salvar um novo cliente
				ClienteController controleCliente = new ClienteController();
				try {
					if(controleCliente.cadastrarCliente(c) == true) {
						JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
						tabelaCliente.addTodos();
						this.repaint();
					}
					}
				 catch (SQLException e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ops, houve um erro ao efetuar o cadastro!");
				}
			}
			else if(op == 1) { //ATUALIZAR O CLIENTE
				c.setId(this.id);
				ClienteController controleCliente = new ClienteController();
				try {
					if(controleCliente.atualizarCliente(c) == true) {
						JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
						tabelaCliente.addTodos();
						this.repaint();
					}
				} catch (HeadlessException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Ops, houve um ao efetuar o cadastro!");
				}				
				
			}
			else {
				cpfRadio.setEnabled(true);
				
				
				nm_clienteField.setText("");
				docField.setText("");
				rgieField.setText("");
				fone_reField.setText("");			
				celularField.setText("");
				emailField.setText("");
				pes_contatoField.setText("");
				cepField.setText("");
				enderecoField.setText("");
				numeroField.setText("");
				complementoField.setText("");
				bairroField.setText("");
				cidadeField.setText("");
				estadoField.setText("");
				
			}
	
	}
	else if (e.getActionCommand().equalsIgnoreCase("cancelar")) {
	
			dispose();
	}
	else if(e.getActionCommand().equals("excluir")) {
		//tratar a exclus�o
		int linha = osTable.getSelectedRow();
		Os o = tabelaOs.getOs(linha);
		
		OsController controleOs = new OsController();
		try {
			controleOs.removerOs(o.getId());
			JOptionPane.showMessageDialog(null, " Cadastro exclu�do com sucesso!");
			tabelaOs.addTodos();
			this.repaint();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao efetuar a exclus�o");
		}
		
		
	}
	else if(e.getActionCommand().equals("editar")) {
		JOptionPane.showMessageDialog(null, "Deseja realmente editar o cadastro?");
		int linha = clienteTable.getSelectedRow();
		Cliente c = tabelaCliente.getCliente(linha);
		
		//preencher os campos com os dados do cliente selecionado
		if(c.getTipo() == 0) cpfRadio.setEnabled(true);
		else cnpjRadio.setEnabled(true);
		
		this.id =c.getId(); 
		nm_clienteField.setText(c.getNm_cliente());
		docField.setText(c.getDoc_num());
		rgieField.setText(c.getRg_ie());
		fone_reField.setText(c.getFone_re());			
		celularField.setText(c.getCelular());
		emailField.setText(c.getEmail());
		pes_contatoField.setText(c.getPes_contato());
		cepField.setText(c.getEndereco().getCep());
		enderecoField.setText(c.getEndereco().getLogradouro());
		numeroField.setText(c.getEndereco().getNumero());
		complementoField.setText(c.getEndereco().getComplemento());
		bairroField.setText(c.getEndereco().getBairro());
		cidadeField.setText(c.getEndereco().getCidade());
		estadoField.setText(c.getEndereco().getEstado());
		
		
	
		
	}
		
	}
}

