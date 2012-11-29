package com.wmellouli.designpatterns.structural.proxy.main;

import com.wmellouli.designpatterns.structural.proxy.Image;
import com.wmellouli.designpatterns.structural.proxy.ProxyImage;

/**
 * A proxy, in its most general form, is a class functioning as an interface to something else. 
 * The proxy could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or impossible to duplicate.
 * 
 * 
 * FR: Un proxy est une classe se substituant à une autre classe. Par convention et simplicité, le proxy implémente la même interface que la classe à laquelle il se substitue. 
 * L'utilisation de ce proxy ajoute une indirection à l'utilisation de la classe à substituer.
 * Propriétés :
 * 		Un proxy est un cas particulier du patron de conception État.
 * 		Un proxy implémente une et une seule interface (donc une seule classe).
 * 		Un état peut implémenter un nombre quelconque d'interfaces.
 * 		Un proxy est utilisé principalement pour contrôler l'accès aux méthodes de la classe substituée.
 * 		Un état est utilisé pour changer dynamiquement d'interface.
 * 
 * Il existe différents types de Proxy :
 * 		Remote proxy: Fournit une référence sur un objet situé sur un espace d'adressage différent, sur la même machine ou sur une autre.
 * 		Virtual proxy
 * 		Copy-on-write proxy
 * 		Protection (access) proxy
 * 		Firewall proxy
 * 		Synchronization proxy
 * 		Smart reference proxy
 * 
 * @author Walid Mellouli
 * 
 */

public class Main {

	public static void main(String[] args) {
		final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image IMAGE2 = new ProxyImage("HiRes_10MB_Photo2");     
 
        IMAGE1.displayImage(); // loading necessary
        IMAGE1.displayImage(); // loading unnecessary
        IMAGE2.displayImage(); // loading necessary
        IMAGE2.displayImage(); // loading unnecessary
        IMAGE1.displayImage(); // loading unnecessary
	}

}
