package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page {
WebDriver Driver;
	public void click(By elemento)  {
		
		Driver.findElement(elemento).click();
		
		
		
		
		
	}
		public void preencher(By elemento , String texto) {
			Driver.findElement(elemento).sendKeys(texto);
			
			
			
			
		}
		
		public void pausar(int tempo) throws InterruptedException {
			Thread.sleep(tempo);
		}
				
		 
	

	
   
	
	
}
