package controller;

import javafx.fxml.FXML;
import application.Main;
import javafx.scene.control.Button;

public class MenuController
{
	private Main main;
	
	@FXML
	private Button generateButton;
	
	@FXML
	private Button addButton;
	
	@FXML
	private Button saveButton;
	
	@FXML
	public void generate()
	{
		main.showGenerateData();
	}
	
	@FXML
	public void save()
	{
		main.serialize();
	}
	
	@FXML
	public void close()
	{
		//TODO nose;
	}

	@FXML
	public void addPeople() {
		main.showAddPeople();
	}
	
	@FXML
	public void searchByName() {
		main.searchByName();
	}

	@FXML
	public void searchByLastName() {
		main.searchByLastName();
	}

	@FXML
	public void searchByFullName() {
		main.searchByFullName();
	}
	
	@FXML
	public void searchByCode() {
		main.searchByCode();
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
}
