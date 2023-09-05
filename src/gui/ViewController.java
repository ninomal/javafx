package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btTeste;
	
	@FXML
	private void onbtTesteAction(){
		Alerts.showAlert("Error", null, "errou", AlertType.ERROR);
	}

}
