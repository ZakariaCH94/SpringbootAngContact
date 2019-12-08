package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entities.Contact;
import com.example.metier.ContactMetierImplements;

@SpringBootApplication
public class SpringAngularContactApplication implements CommandLineRunner {
	
	@Autowired
	ContactMetierImplements contactMetierImplements;

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");

		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "zakaria", df.parse("21/06/1994"), "chaouche.zakaria@yahoo.com",662865935, "zaki.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "rabah", df.parse("10/11/1964"), "chaouche.rabah@yahoo.com",661561969, "rabah.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "youcef", df.parse("10/11/1999"), "chaouche.youcef@yahoo.com",661561969, "youcef.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "atmane", df.parse("10/11/1999"), "chaouche.atmane@yahoo.com",661561969, "atmane.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "moh", df.parse("10/11/1960"), "chaouche.moh@yahoo.com",661561969, "moh.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "yacine", df.parse("10/11/1974"), "chaouche.yacine@yahoo.com",661561969, "yacine.png"));
		contactMetierImplements.save_contact(new Contact("chaouch", "morad", df.parse("10/11/1964"), "chaouche.morad@yahoo.com",661561969, "morad.png"));





	}

}
