package com.pim.Banco;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BancoApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Scene escena = new Scene(cargarFxml("login.fxml"));
		stage.setScene(escena);
		stage.show();
	}
	public static Parent cargarFxml(String fxml) throws IOException {
		FXMLLoader cargador = new FXMLLoader(BancoApplication.class.getResource(fxml));
		return cargador.load();
	}
	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
		launch();
	}
}


