package com.wmellouli.designpatterns.creational.builder.main;

import com.wmellouli.designpatterns.creational.builder.builder.AbstractProductBuilder;
import com.wmellouli.designpatterns.creational.builder.builder.FoodProductBuilder;
import com.wmellouli.designpatterns.creational.builder.builder.HighTechProductBuilder;
import com.wmellouli.designpatterns.creational.builder.director.Director;
import com.wmellouli.designpatterns.creational.builder.product.Product;

/**
 * 
 * The intent of the Builder design pattern is to separate the construction of a complex object from its representation. By doing so, the same construction
 * process can create different representations.
 * 
 * FR: Le patron Monteur a pour but de séparer la construction d'un objet complexe de la représentation afin que le même processus de construction puisse créer différentes représentations.
 * 
 * @author Walid Mellouli
 * 
 */

public class Main {

	public static void main(String[] args) {
		Director director = new Director();
		AbstractProductBuilder foodProductBuilder = new FoodProductBuilder();
		AbstractProductBuilder highTechProductBuilder = new HighTechProductBuilder();

		System.out.println(doDirectorJob(director, foodProductBuilder));
		System.out.println(doDirectorJob(director, highTechProductBuilder));
	}

	private static Product doDirectorJob(Director director, AbstractProductBuilder foodProductBuilder) {
		director.setProductBuilder(foodProductBuilder);
		director.constructProduct();
		return director.getProduct();
	}

}
