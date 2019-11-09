package model;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TabelaCliente extends AbstractTableModel{

	private ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	private String [] colunas = {
			
			"Cod", "Nome", "Documento", "Celular", "E-Mail"
	};
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colunas[column];
	}
	
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return listaCliente.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch(columnIndex) {
			case 0: return listaCliente.get(rowIndex).getId();
			case 1: return listaCliente.get(rowIndex).getNm_cliente();
			case 2: return listaCliente.get(rowIndex).getDoc_num();
			case 3: return listaCliente.get(rowIndex).getCelular();
			case 4: return listaCliente.get(rowIndex).getEmail();
		
		}
		return null;
	}
	
	
	public void addLinha(Cliente c) {
		
		listaCliente.add(c);
		
		this.fireTableDataChanged();
	
		
	}
	public void addTodos(ArrayList<Cliente> c) {
		this.listaCliente.clear();
		
		for(Cliente x : c) {
			addLinha(x);
			
		}
	}

}
