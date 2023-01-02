package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class testeWeb {
    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("edge");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br"); //driver acessa o site;
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

    @Test
    public void primeiroTeste(){
        String xpathTitulo = "//section[2]//h4"; // realizado melhoria no xpath da v1 abaixo.
        //String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4"; //criei uma variavel/objeto do tipo string e coloquei o resultado esperado; V1
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo)); //criei uma variavel/objeto do tipo WebElement com nome de txt Titulo onde utilizamos o metodos findElement e passamos o xPathTitulo para ser encontrado.
        String titulo = txtTitulo.getText();

        assertEquals("Porque Tempo É Conhecimento", titulo);
    }

    @Test
    public void segundoTest(){
        String xpathBotao = "//section[2]/div[3]//a";

        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
        btnTitulo.click();
        String xpathTituloh
    }
}
