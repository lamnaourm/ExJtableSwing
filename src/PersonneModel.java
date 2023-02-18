import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class PersonneModel extends AbstractTableModel {

	String[] cols = { "Nom", "Prenom", "Baccalaureat", "Age" };
	ArrayList<Personne> personnes = new ArrayList<Personne>();

	public PersonneModel(ArrayList<Personne> personnes) {
		super();
		this.personnes = personnes;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return personnes.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cols.length;
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return cols[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Personne p = personnes.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return p.getNom();
		case 1:
			return p.getPrenom();
		case 2:
			return p.isBachelier();
		case 3:
			return p.getAge();
		}
		return "";
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub

		return false;

	}

}
