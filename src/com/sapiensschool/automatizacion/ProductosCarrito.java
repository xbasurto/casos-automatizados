package com.sapiensschool.automatizacion;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class ProductosCarrito {


	public static void main(String[] args) throws InterruptedException  {
		// Suite-Verificar el correcto funcionamiento del carrito de compras
		// CP001 Agregar Productos al carrito
		// Abrir Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xbasu\\Documents\\driver2\\chromedriver.exe");
		WebDriver customDriver = new ChromeDriver();
		customDriver.get("https://www.google.com.mx/");
		//Este comando maximiza la pantalla
		customDriver.manage().window().maximize();		
		customDriver.navigate().to("https://winstoncastillo.com/robot-selenium/");
		//Verifica la url del sitio web
		Assert.assertEquals(customDriver.getCurrentUrl(), "https://winstoncastillo.com/robot-selenium/");
		//Verifica el nombre de la página
		Assert.assertEquals(customDriver.getTitle(), "La tienda de Winston Castillo");
		//Imprime el nombre de la pagina
		System.out.println(customDriver.getTitle());
		//Informacion del carrito en 0
		WebElement carritoVacio = customDriver.findElement(By.cssSelector("#cart > button"));
		System.out.println(carritoVacio.getText());
		Assert.assertEquals(customDriver.findElement(By.id("cart-total")).getText(),"0 item(s) - $0.00");
		//Informacion Featured
		WebElement productosVisibles = customDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]"));
		List<WebElement> listaDeProductos = productosVisibles.findElements(By.tagName("h4"));
		System.out.println(listaDeProductos.size());
		//Click lista de deseos
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(2)")).click();
		Thread.sleep(3000);
		//Mensaje al agregar producto a lista de deseos
		Assert.assertEquals(customDriver.findElement(By.xpath("//*[@id=\"common-home\"]/div[1]")).getText().substring(0,74), "You must login or create an account to save MacBook Pro to your wish list!");
		//Click agregar producto al carrito
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(1)")).click();
		Thread.sleep(3000);
		//Informacion del carrito con producto agregado
		WebElement productoCargado = customDriver.findElement(By.cssSelector("#cart > button"));
		System.out.println(productoCargado.getText());
		Assert.assertEquals(customDriver.findElement(By.id("cart-total")).getText(),"1 item(s) - $602.00");
		
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
		Assert.assertEquals(customDriver.findElement(By.id("cart-total")).getText(),"0 item(s) - $0.00");
		//CP003 Agregar 1 Producto al carrito y ver carrito
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.button-group > button:nth-child(1)")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#cart > button")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(1) > strong")).click();
		Thread.sleep(3000);
		WebElement productoAgregado = customDriver.findElement(By.cssSelector("#cart > button"));
		System.out.println(productoAgregado.getText());
		Assert.assertEquals(customDriver.findElement(By.id("cart-total")).getText(),"1 item(s) - $123.20");
		
		//004 Agregar Productos al carrito y ver carrito
		customDriver.findElement(By.cssSelector("#logo > h1 > a")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(1)")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(3) > div > div.button-group > button:nth-child(1)")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#content > div.row > div:nth-child(4) > div > div.button-group > button:nth-child(1)")).click();
		Thread.sleep(3000);
		WebElement staticsList = customDriver.findElement(By.id("input-option226"));
		Select selectedList = new Select(staticsList);
		selectedList.selectByVisibleText("Red");
		System.out.println(selectedList.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#button-cart")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#cart > button")).click();
		Thread.sleep(3000);
		customDriver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(1) > strong")).click();
		Thread.sleep(3000);
		WebElement productosVarios = customDriver.findElement(By.cssSelector("#cart > button"));
		System.out.println(productosVarios.getText());
		Assert.assertEquals(customDriver.findElement(By.id("cart-total")).getText(),"4 item(s) - $969.20");
		customDriver.close();
		
		

		
		
		
		
		
				
		
		
		
	
				
		//
		
		    

	}

}

