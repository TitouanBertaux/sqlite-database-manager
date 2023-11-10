import java.sql.*;
import java.util.ArrayList;

import javax.swing.plaf.nimbus.State;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class sqlite 
{
	public ArrayList<TableColumn<StudentsModel, String>> columns = new ArrayList<TableColumn<StudentsModel, String>>();
	public ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
	private TableView<StudentsModel> tableView;
	private MenuButton menuBtn;
	private String chemin;
	private ObservableList<StudentsModel> studentsModels = FXCollections.observableArrayList();
	private String tableActu;
	private Label lbl;


	public sqlite(String chemin, TableView<StudentsModel> tableView, MenuButton menuBtn, Label lbl)
	{
		this.menuBtn = menuBtn;
		this.tableView = tableView;
		this.chemin = chemin;
		this.lbl = lbl;
		construct();
	}

	public  void construct() 
	{
			try {
				Class.forName("org.sqlite.JDBC");
				Connection con = DriverManager.getConnection("jdbc:sqlite:"+this.chemin);
				Statement stmt = con.createStatement();

				ResultSet rs = con.getMetaData().getTables(null, null, null, null);
				while (rs.next()) {
					menuItems.add(new MenuItem(rs.getString("TABLE_NAME")));
				}
				majTables();				
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				System.err.println(e.getClass().getName() + ": " + e.getMessage());
				System.exit(0);
			}
	}



	public void creer(String table)
	{
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:"+this.chemin);
			Statement stmt = con.createStatement();		ResultSet rs = stmt.executeQuery("SELECT * FROM " + table + ";");
			ResultSetMetaData rsmd = rs.getMetaData();
			columns.clear();
			tableView.getColumns().clear();
			tableView.getItems().clear();

			for(int i = 0; i < rsmd.getColumnCount(); i++)
			{
				columns.add(new TableColumn<StudentsModel, String>(rsmd.getColumnName(i+1)));
			}

			while(rs.next())
			{
				StudentsModel s = new StudentsModel();

				for(int i = 0; i < rsmd.getColumnCount(); i++)
				{
					switch (i) {
						case 0:
							s.setS1(rs.getString(i+1));
							break;
						case 1:
							s.setS2(rs.getString(i+1));
							break;
						case 2:
							s.setS3(rs.getString(i+1));
							break;
						case 3:
							s.setS4(rs.getString(i+1));
							break;
						case 4:
							s.setS5(rs.getString(i+1));
							break;
						case 5:
							s.setS6(rs.getString(i+1));
							break;
						case 6:
							s.setS7(rs.getString(i+1));
							break;
						case 7:
							s.setS8(rs.getString(i+1));
							break;
						case 8:
							s.setS9(rs.getString(i+1));
							break;
					}
				}
				studentsModels.add(s);
				this.tableActu = table;
			}

			for(int i = 0; i < columns.size(); i++)
			{
				tableView.getColumns().add(columns.get(i));
				columns.get(i).setCellValueFactory(new PropertyValueFactory<>(StudentsModel.tab[i]));
			}
			tableView.setItems(studentsModels);
			
		} catch (Exception e) {	}

	}

	public void majTables()
	{
		for(MenuItem m : menuItems)
		{
			m.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					creer(m.getText());
				}
			});
			this.menuBtn.getItems().add(m);
		}
	}

	public void requete(String req)
	{
			try {
				Class.forName("org.sqlite.JDBC");
				Connection con = DriverManager.getConnection("jdbc:sqlite:"+this.chemin);
				Statement stmt = con.createStatement();
				ResultSet rs = null;
				if(req.contains("SELECT"))
				{
					rs = stmt.executeQuery(req);
					ResultSetMetaData rsmd = rs.getMetaData();
					this.lbl.setText("");
					while (rs.next()) 
					{
						for(int i = 0; i < rsmd.getColumnCount(); i++)
						{
							this.lbl.setText(this.lbl.getText() + rs.getString(i+1) + " ");
						}
						this.lbl.setText(this.lbl.getText() + "\n");
					}
				}
				else
				{
					stmt.execute(req);
					creer(this.tableActu);
					this.lbl.setText("Requete effectuée");
				}
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {	}
	}
}
