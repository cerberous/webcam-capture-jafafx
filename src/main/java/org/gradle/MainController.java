/**
 * 
 */
package org.gradle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import org.apache.log4j.Logger;

/**
 * @author cristian chies
 */
public class MainController extends Application {
	Logger logger = Logger.getLogger(getClass());

	private Stage primaryStage;

	/*
	 * (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;

	}

	@FXML
	private void dialogHandler() {
		new AppLancher(primaryStage).showAndWait();
	}

}
