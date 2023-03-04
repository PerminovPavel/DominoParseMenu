package ru.perminov.parcerjsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {

			Document mainmenu = Jsoup.connect("https://dominodomoy.ru/catalog/").get();
			Elements menuelements = mainmenu.getElementsByClass("catalog-section-list-item-title");

		for (Element menuelement: menuelements){
			Document allmenu = Jsoup.connect("https://dominodomoy.ru" + menuelement.attr("href")).get();
			Elements allmenuelements = allmenu.getElementsByClass("catalog-section-item-background");

			System.out.println("Раздел меню " + menuelement.text());
			System.out.println(" ");
			for (Element allmenuelement : allmenuelements) {
//				System.out.print(allmenuelement.getElementsByClass("catalog-section-item-name-wrapper").text());
//				System.out.print(" - ");
//				System.out.println(allmenuelement.getElementsByClass("catalog-section-item-price-discount").text());
				String name = allmenuelement.getElementsByClass("catalog-section-item-name-wrapper").text();
				String price = allmenuelement.getElementsByClass("catalog-section-item-price-discount").text();
				String image = allmenuelement.select("img").attr("data-original");
				System.out.println("\t" + name + " - " + price + " - https://dominodomoy.ru" + image);
			}

			System.out.println("");
		}

	}
}

