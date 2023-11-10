import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import java.awt.Desktop;

public class StudentsController implements Initializable {

	@FXML
	public TableView<StudentsModel> tableView;

	@FXML
	public MenuButton menuBtn;

	@FXML
	public TextField txtFld;

	@FXML
	public Label lbl;

	public sqlite s = null;

	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		
	}

	@FXML
	public void ouvrirSiteWeb(ActionEvent event) {
		try {
			Desktop.getDesktop().browse(new URI("https://www.sqlite.org/docs.html"));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void ouvrirFichier(ActionEvent event) 
	{
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open database File");
		fileChooser.getExtensionFilters().addAll( new ExtensionFilter("database", "*.db"));
		File select = fileChooser.showOpenDialog(Main.scene.getWindow());
		System.out.println(select.getAbsolutePath());
		sqlite s = new sqlite(select.getAbsolutePath(), this.tableView, this.menuBtn, this.lbl);
		this.s = s;
	}

	@FXML
	public void clicRequete(ActionEvent event) 
	{
		if(this.s == null)
		{
			this.lbl.setText("Veuillez ouvrir une base de données");
		}
		else
		{
			this.s.requete(this.txtFld.getText());
		}
	}




}