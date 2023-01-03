package NaveenFileHandling;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class P19_ConversionOFImgFormat {
	
	public static void main(String[] args) {
		
		// .jpg --> .png /.bmp  /.gif
		
		/*
		 *  how to get image link from amazon --& conversion into different images format
		 */
		
		try {
			// reading from URL 
			URL url = new URL("https://m.media-amazon.com/images/I/61B-lGflsML._AC_UL320_.jpg");
			
			// reading from FILE
			File file = new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\demofake.png");
			BufferedImage fileImg = ImageIO.read(file);
			ImageIO.write(fileImg, "jpg", new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\fifaTest.jpg"));
			
			
			BufferedImage image = ImageIO.read(url);
			
		//	BufferedImage image = ImageIO.read(file);   // if you want image from local machine
			
			ImageIO.write(image, "jpg", new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\am.jpg"));
			ImageIO.write(image, "png", new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\am.png"));
			ImageIO.write(image, "gif", new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\am.gif"));
			ImageIO.write(image, "bmp", new File("C:\\Users\\yogen\\eclipse-seleniumworkspace\\PracticeRealTimeJava\\src\\NaveenFileHandling\\am.bmp"));
			
			System.out.println("Successfully done ----");
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
