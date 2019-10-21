package dad.javafx.buscarremmplazar;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazarApp extends Application {
	
	private TextField buscarText, reemplazarText;
	private CheckBox mayusCheck, expresionCheck, atrasCheck, resaltarCheck;
	private Button buscarBtn, reemplazarBtn, reemplazarTodoBtn, cerrarBtn, ayudaBtn;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		buscarText = new TextField();
		reemplazarText = new TextField();
		
		mayusCheck = new CheckBox("Mayúsculas y minúsculas");
		expresionCheck = new CheckBox("Expresión regular");
		atrasCheck = new CheckBox("Buscar hacia atrás");
		resaltarCheck = new CheckBox("Resaltar resultados");
		
		buscarBtn = new Button("Buscar");
		buscarBtn.setMaxWidth(Double.MAX_VALUE);
		reemplazarBtn = new Button("Reemplazar");
		reemplazarBtn.setMaxWidth(Double.MAX_VALUE);
		reemplazarTodoBtn = new Button("ReemplazarTodoBtn");
		reemplazarTodoBtn.setMaxWidth(Double.MAX_VALUE);
		cerrarBtn = new Button("Cerrar");
		cerrarBtn.setMaxWidth(Double.MAX_VALUE);
		ayudaBtn = new Button("Ayuda");
		ayudaBtn.setMaxWidth(Double.MAX_VALUE);
		
		VBox botonesVbox = new VBox(5, buscarBtn, reemplazarBtn, reemplazarTodoBtn, cerrarBtn, ayudaBtn);
		
		VBox check1 = new VBox(5, mayusCheck, expresionCheck);
		VBox check2 = new VBox(5, atrasCheck, resaltarCheck);
		
		HBox checkHbox = new HBox(5, check1, check2);
		
		GridPane panelGrid = new GridPane();
		panelGrid.addRow(0, new Label("Buscar:"),buscarText);
		panelGrid.addRow(1, new Label("Reemplazar con:"),reemplazarText);
		panelGrid.add(checkHbox, 1, 2);
		panelGrid.setGridLinesVisible(false);
		panelGrid.setPadding(new Insets(5));
		panelGrid.setHgap(10);
		panelGrid.setVgap(10);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		cols[1].setHgrow(Priority.ALWAYS);
		cols[1].setFillWidth(true);
		
		panelGrid.getColumnConstraints().addAll(cols);
		
		GridPane.setRowSpan(botonesVbox, 5);
		
		BorderPane root = new BorderPane();
		root.setCenter(panelGrid);
		root.setRight(botonesVbox);
		root.setPadding(new Insets(5));
		
		Scene scene = new Scene(root, 600, 250);
		
		primaryStage.setTitle("HolaMundo MVC");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
