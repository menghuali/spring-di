package aloha.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import aloha.spring.di.controller.ConstructorBasedDIController;
import aloha.spring.di.controller.I18nController;
import aloha.spring.di.controller.MyController;
import aloha.spring.di.controller.PropertyBasedDIController;
import aloha.spring.di.controller.SetterBasedDIController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

		log.info("------ Primary Bean");
		MyController primaryBean = ctx.getBean(MyController.class);
		primaryBean.helloWorld();

		log.info("------ Constructor Based DI");
		ConstructorBasedDIController constructBased = ctx.getBean(ConstructorBasedDIController.class);
		constructBased.helloWorld();

		log.info("------ Setter Based DI");
		SetterBasedDIController setterBased = ctx.getBean(SetterBasedDIController.class);
		setterBased.helloWorld();

		log.info("------ Property Based DI");
		PropertyBasedDIController propBased = ctx.getBean(PropertyBasedDIController.class);
		propBased.helloWorld();

		log.info("------ Profile");
		I18nController i18n = ctx.getBean(I18nController.class);
		i18n.helloWorld();		

	}

}
