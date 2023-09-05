package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {
	
	@FXML
	private TextField txtnumberX;
	
	@FXML
	private TextField txtnumberY;
	
	@FXML
	private Label labelResult;
	

	@FXML
	private Button btSum;
	
	@FXML
	private void onbtSumAction(){
		try {
			Locale.setDefault(Locale.US);
			Double numberx = Double.parseDouble(txtnumberX.getText());
			Double numbery = Double.parseDouble(txtnumberY.getText());
			Double sum = numberx + numbery;
			labelResult.setText(String.format("%.2f", sum));
		} catch(NumberFormatException e) {
			Alerts.showAlert("Error", null, e.getMessage(), AlertType.ERROR);
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Constraints.setTextFieldDouble(txtnumberX);
		Constraints.setTextFieldDouble(txtnumberY);
	}

}
