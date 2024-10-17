package CodigoGon.Fiadito;

import CodigoGon.Fiadito.aplication.FiaditoFX;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FiaditoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(FiaditoApplication.class, args);
		Application.launch(FiaditoFX.class, args);
	}

}
