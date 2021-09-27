package com.sapiensacademy.homerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoRepository {
	
	public CarritoRepository(WebDriver navegador)
	{
		this.driver = navegador;
		
	}
	
	WebDriver driver;


	By productosCarrito  = By.cssSelector("#cart > button");
	By productosVisibles = By.xpath("//*[@id=\"content\"]/div[2]");
	By listaDeProductos = By.tagName("h4");
	By productoCargado = By.cssSelector("#cart > button");
	By productoRemovido = By.cssSelector("#cart > button");
	By productoAgregado = By.cssSelector("#cart > button");
	By staticsList	= By.id("input-option226");
	By productosVarios = By.cssSelector("#cart > button");
	

}