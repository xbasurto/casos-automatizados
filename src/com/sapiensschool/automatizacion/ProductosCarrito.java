package com.sapiensschool.automatizacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductosCarrito {

	public static void main(String[] args) {
		// TODO Verificar el correcto funcionamiento del carrito de compras
		// CP001 Agregar Productos al carrito
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbasu\\Documents\\driver2\\chromedriver.exe");
		//Here we will create and launch our browser
		WebDriver customDriver = new ChromeDriver();
		customDriver.get("https://winstoncastillo.com/robot-selenium/");

	}

}
