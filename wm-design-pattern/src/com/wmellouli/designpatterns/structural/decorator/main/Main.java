package com.wmellouli.designpatterns.structural.decorator.main;

import com.wmellouli.designpatterns.structural.decorator.component.CamescopeProduct;
import com.wmellouli.designpatterns.structural.decorator.component.ComputerProduct;
import com.wmellouli.designpatterns.structural.decorator.component.IHighTechProduct;
import com.wmellouli.designpatterns.structural.decorator.decorator.SupportProductDecorator;
import com.wmellouli.designpatterns.structural.decorator.decorator.WarrantyProductDecorator;


/**
 * The decorator pattern can be used to extend (decorate) the functionality of a certain object at run-time, 
 * independently of other instances of the same class, provided some groundwork is done at design time. 
 * This is achieved by designing a new decorator class that wraps the original class. 
 * This wrapping could be achieved by the following sequence of steps:
 * 		Subclass the original "Decorator" class into a "Component" class (see UML diagram)
 * 		In the Decorator class, add a Component pointer as a field
 * 		Pass a Component to the Decorator constructor to initialize the Component pointer
 * 		In the Decorator class, redirect all "Component" methods to the "Component" pointer; and
 * 		In the ConcreteDecorator class, override any Component method(s) whose behavior needs to be modified
 * This pattern is designed so that multiple decorators can be stacked on top of each other, 
 * each time adding a new functionality to the overridden method(s).
 * The decorator pattern is an alternative to subclassing. Subclassing adds behavior at compile time, 
 * and the change affects all instances of the original class; decorating can provide new behavior at run-time for individual objects.
 * 
 * FR: Un décorateur permet d'attacher dynamiquement de nouvelles responsabilités à un objet. Les décorateurs offrent une alternative assez souple à l'héritage pour composer de nouvelles fonctionnalités.
 * 
 * [source: wikipedia]
 * 
 * @author Walid Mellouli
 * 
 */

public class Main {
	
	public static void main(String[] args) {
		IHighTechProduct computerProduct1 = new ComputerProduct();
		System.out.println(computerProduct1);
		
		IHighTechProduct computerProduct2 = new WarrantyProductDecorator(new ComputerProduct());
		System.out.println(computerProduct2);
		
		IHighTechProduct comescopeProduct = new SupportProductDecorator(new WarrantyProductDecorator(new CamescopeProduct()));
		System.out.println(comescopeProduct);
	}

}
