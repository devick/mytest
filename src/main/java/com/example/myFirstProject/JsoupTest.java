package com.example.myFirstProject;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest {
	
String html = "";

public static void main(String agrs[]) throws IOException
{
	File input = new File("d:/nsiq.html");
	Document doc = Jsoup.parse(input, "UTF-8","");
	
	Elements tds = doc.getElementsByTag("thead").get(0).getElementsByTag("td");
	for(Element td:tds){
		System.out.println(td.html());
	}
	System.out.println("--------");
	Elements tds2 = doc.getElementsByTag("tbody").get(0).getElementsByTag("td");
	for(Element td:tds2){
		System.out.println(td.html());
	}
	System.out.println("--------");
	System.out.println(tds.get(0).html()+":"+tds2.get(0).html());
	System.out.println(tds.get(1).html()+":"+tds2.get(1).html());
	System.out.println(tds.get(2).html()+":"+tds2.get(2).html());
	System.out.println(tds.get(3).html()+":"+tds2.get(3).html());
	System.out.println(tds.get(4).html()+":"+tds2.get(4).html());
	System.out.println(tds.get(5).html()+":"+tds2.get(5).html());
	
	//System.out.println(doc.html());
}

}
