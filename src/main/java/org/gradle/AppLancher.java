package org.gradle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import org.apache.log4j.Logger;

public class AppLancher extends Stage {
	private Logger logger = Logger.getLogger(getClass());

	public AppLancher(Stage primaryStage) {

		try {
			FXMLLoader root = new FXMLLoader(getClass().getResource("/fxml/WebCamPreview.fxml"));

			initModality(Modality.WINDOW_MODAL);
			initOwner(primaryStage);
			setScene(new Scene((Parent) root.load()));
		} catch (Exception e) {
			logger.error("Error loading fxml", e);
		}
	}

}
