package com.sapiensschool.automatizacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductosCarrito {

	public static void main(String[] args) {
		// TODO Verificar el correcto funcionamiento del carrito de compras
		// CP001 Agregar Productos al carrito
		// Abrir Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbasu\\Documents\\driver2\\chromedriver.exe");
		WebDriver customDriver = new ChromeDriver();
		customDriver.get("https://www.google.com.mx/");
		//Este comando maximiza la pantalla
		customDriver.manage().window().maximize();		
		customDriver.navigate().to("https://winstoncastillo.com/robot-selenium/");
		System.out.println(customDriver.getCurrentUrl());
		System.out.println(customDriver.getTitle());

	}

}
