package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ViewController {
	
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
		Locale.setDefault(Locale.US);
		Double numberx = Double.parseDouble(txtnumberX.getText());
		Double numbery = Double.parseDouble(txtnumberY.getText());
		Double sum = numberx + numbery;
		labelResult.setText(String.format("%.2f", sum));
		
	}

}
