package com.sapiensschool.automatizacion;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProductosCarrito {


	public static void main(String[] args) throws InterruptedException  {
		// TODO Verificar el correcto funcionamiento del carrito de compras
		// CP001 Agregar Productos al carrito
		// Abrir Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbasu\\Documents\\driver2\\chromedriver.exe");
		WebDriver customDriver = new ChromeDriver();
		customDriver.get("https://www.google.com.mx/");
		//Este comando maximiza la pantalla
		customDriver.manage().window().maximize();		
		customDriver.navigate().to("https://winstoncastillo.com/robot-selenium/");
		//Imprime la url del sitio web
		System.out.println(customDriver.getCurrentUrl());
		//Imprime el nombre de la pagina
		System.out.println(customDriver.getTitle());
		//Informacion del carrito en 0
		WebElement productosCarrito = customDriver.findElement(By.cssSelector("#cart > button"));
		System.out.println(productosCarrito.getText());
		//Informacion Featured
		WebElement productosVisibles = customDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]"));
		System.out.println(productosVisibles.getText());
		//Click lista de deseos
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(2)")).click();
		Thread.sleep(3000);
		//Mensaje al agregar producto a lista de deseos
		WebElement messege = customDriver.findElement(By.cssSelector("#common-home > div.alert.alert-success.alert-dismissible"));
		System.out.println(messege.getText());
		//Click agregar producto al carrito
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(1)")).click();
		Thread.sleep(3000);
		//Informacion del carrito con producto agregado
		WebElement productoCargado = customDriver.findElement(By.cssSelector("#cart > button"));
		System.out.println(productoCargado.getText());
		// CP002 Borrar Elementos del carrito de compras
		//Click boton carrito
		customDriver.findElement(By.cssSelector("#cart > button")).click();
		Thread.sleep(3000);
		//Click boton remover producto
		customDriver.findElement(By.cssSelector("#cart > ul > li:nth-child(1) > table > tbody > tr > td:nth-child(5) > button")).click();
		Thread.sleep(3000);
		//Informacion del carrito despues de remover producto
		WebElement productoRemovido = customDriver.findElement(By.cssSelector("#cart > button"));
		System.out.println(productoRemovido.getText());
		//CP003 Agregar 1 Producto al carrito y ver carrito
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.button-group > button:nth-child(1)")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#cart > button")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(1) > strong")).click();
		Thread.sleep(3000);
		customDriver.navigate().back();
		
		
	
		
		
		
		

		
		
		
		
		
				
		
		
		
	
				
		//
		
		    

	}

}
