package com.sapiensacademy.homerepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarritoRepository {
	
	public CarritoRepository(WebDriver navegador)
	{
		this.driver = navegador;
		
	}
	
	WebDriver driver;


	By carritoVacio  = By.cssSelector("#cart > button");
	By productosVisibles = By.xpath("//*[@id=\"content\"]/div[2]");
	By listaDeProductos = By.tagName("h4");
	By productoCargado = By.cssSelector("#cart > button");
	By productoRemovido = By.cssSelector("#cart > button");
	By productoAgregado = By.cssSelector("#cart > button");
	By staticsList	= By.id("input-option226");
	By productosVarios = By.cssSelector("#cart > button");
	


public WebElement carritoVacio() {
	return driver.findElement(carritoVacio);
	
}

public WebElement productosVisibles() {
	return driver.findElement(productosVisibles);
	
}

public List<WebElement> listaDeProductos(WebElement productosVisibles) {
	return productosVisibles.findElements(listaDeProductos);
	
}

public WebElement productoCargado() {
	return driver.findElement(productoCargado);

}

public WebElement productoRemovido() {
	return driver.findElement(productoRemovido);

}

public WebElement productoAgregado() {
	return driver.findElement(productoAgregado);

}

public WebElement staticsList() {
	return driver.findElement(staticsList);
	
}

public WebElement productosVarios() {
	return driver.findElement(productosVarios);
	
}
}

