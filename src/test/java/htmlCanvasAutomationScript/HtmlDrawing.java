package htmlCanvasAutomationScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlDrawing {

	@Test
	public void HtmlCanvasTesting() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.htmlcanvasstudio.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		// Virtical line
		js.executeScript("canvaso = document.getElementById('imageView');"
				+"context = canvaso.getContext('2d');"
				+"context.lineWidth = 5;"
				+ "context.beginPath();"
				+ "context.moveTo(298, 162);"
				+ "context.lineTo(303,340);"
				+ "context.stroke();"
				+ "context.closePath();");
		
		Thread.sleep(3000);
	    
	  // Horizontal line
		js.executeScript("canvaso = document.getElementById('imageView');" 
	            +"context = canvaso.getContext('2d');" 
				+"context.lineWidth = 5;"
				+ "context.beginPath();"
	            +"context.moveTo(181,243);"
				+ "context.lineTo(433,239);" 
	            + "context.stroke();"
		     	+ "context.closePath();");
		
		Thread.sleep(5000);
		
		 
	  // Rectangle 
		js.executeScript("var canvas, context, canvaso, contexto;" + 
				"canvaso = document.getElementById('imageView');" + 
				"context = canvaso.getContext('2d');" + 
				"context.lineWidth = 5;" +  
				"context.strokeRect(173, 366, 244, 104);");
		
		
	 // Erase horizontal line
		js.executeScript("var canvas, context, canvaso, contexto;\r\n" + 
				"canvaso = document.getElementById('imageView');\r\n" + 
				"context = canvaso.getContext('2d');\r\n" + 
				"context.lineWidth = 5;\r\n" + 
				"\r\n" + 
				"context.strokeStyle = '#000000';\r\n" + 
				"context.strokeRect(173, 366, 244, 104);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"var canvas, context, canvaso, contexto;\r\n" + 
				"canvaso = document.getElementById('imageView');\r\n" + 
				"context = canvaso.getContext('2d');\r\n" + 
				"context.lineWidth = 5;\r\n" + 
				"\r\n" + 
				"context.strokeStyle = '#FFFFFF';\r\n" + 
				"context.beginPath();\r\n" + 
				"context.moveTo(304, 238);\r\n" + 
				"\r\n" + 
				"context.lineTo(306, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(307, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(309, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(310, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(311, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(312, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(313, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(314, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(315, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(317, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(318, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(319, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(320, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(321, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(319, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(318, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(316, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(315, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(313, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(312, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(310, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(309, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(308, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(307, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(306, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(306, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(307, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(309, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(310, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(311, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(313, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(315, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(316, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(318, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(321, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(322, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(324, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(326, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(327, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(328, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(330, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(332, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(334, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(336, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(338, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(339, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(341, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(342, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(343, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(344, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(345, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(347, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(348, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(347, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(346, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(345, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(344, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(344, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(346, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(361, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(366, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(384, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(391, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(394, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(390, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(385, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(366, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(361, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(355, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(359, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(368, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(386, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(404, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(408, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(410, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(411, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(413, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(416, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(417, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(419, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(421, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(425, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(427, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(426, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(419, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(405, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(402, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(402, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(406, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(430, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(441, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(445, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(443, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(439, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(433, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(430, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(429, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(428, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(427, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(427, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(426, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(425, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(425, 237);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(426, 237);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(427, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(428, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(429, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(431, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(433, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(434, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(433, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(432, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(431, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(430, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(429, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(428, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(427, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(426, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(426, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.strokeStyle = '#FFFFFF';\r\n" + 
				"context.beginPath();\r\n" + 
				"context.moveTo(295, 239);\r\n" + 
				"\r\n" + 
				"context.lineTo(294, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(293, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(292, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(290, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(289, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(288, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(286, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(285, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(283, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(282, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(281, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(279, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(281, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(282, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(284, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(286, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 245);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 246);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(288, 246);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(288, 247);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(290, 247);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 246);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 245);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 237);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(292, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(293, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(294, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(295, 237);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(295, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(295, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(295, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(294, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(293, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(292, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(291, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(290, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(289, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(288, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(286, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(285, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(283, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(281, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(279, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(278, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(276, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(275, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(272, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(269, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(264, 238);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(258, 237);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(259, 237);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(271, 239);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(286, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(287, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(288, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(288, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(286, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(277, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(273, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(272, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(274, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(282, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(280, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(256, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(248, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(247, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(251, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(259, 234);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(258, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(234, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(217, 235);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(220, 236);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(252, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(256, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(252, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(233, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(229, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(230, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(255, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(251, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(246, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(249, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(258, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(259, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.moveTo(271, 240);\r\n" + 
				"\r\n" + 
				"context.lineTo(270, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(267, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(264, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(261, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(257, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(253, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(249, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(247, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(245, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(244, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(242, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(241, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(240, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(238, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(235, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(234, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(233, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(232, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(230, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(228, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(226, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(221, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(219, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(218, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(217, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(215, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(213, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(212, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(211, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(209, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(208, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(206, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(204, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(203, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(202, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(199, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(197, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(196, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(195, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(196, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(197, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(200, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(202, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(203, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(206, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(208, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(211, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(212, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(214, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(217, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(218, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(219, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(220, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(221, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(223, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(224, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(226, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(227, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(228, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(229, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(228, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(227, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(226, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(225, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(224, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(222, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(221, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(220, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(218, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(216, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(215, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(213, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(212, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(209, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(207, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(206, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(206, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(209, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(210, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(213, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(217, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(220, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(222, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(224, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(225, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(226, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(227, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(228, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(229, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(228, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(222, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(213, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(211, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(210, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(207, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(204, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(203, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(201, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(200, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(198, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(196, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(195, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(194, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(193, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(190, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(189, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(188, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(187, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(187, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(186, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(185, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(182, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(176, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(174, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(175, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(176, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(177, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(178, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(179, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(181, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(182, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(183, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(184, 240);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(185, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(186, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(187, 241);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(187, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(186, 242);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(185, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(184, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(184, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(183, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(182, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(180, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(181, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(182, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(185, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(187, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(188, 244);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(189, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(190, 243);\r\n" + 
				"context.stroke();\r\n" + 
				"\r\n" + 
				"context.lineTo(190, 243);\r\n" + 
				"context.stroke();");
		
		
		
		Thread.sleep(6000);
		
		driver.close();

	}

}
