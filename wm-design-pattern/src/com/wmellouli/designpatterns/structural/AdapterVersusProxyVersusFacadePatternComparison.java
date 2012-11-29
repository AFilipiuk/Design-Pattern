package com.wmellouli.designpatterns.structural;

/**
 * 
 * Proxy vs. Adapter
 * 		The Proxy changes the behavior of the Service, but preserves its interface.
 * 		The Adapter changes the interface of the Service, but preserves it behavior.
 * 		A Client can use the Proxy or the Service Entity in the same way.
 * 		A Client designed to use the Adapter would not be able to use the Service Entity without it.
 * 		The Proxy can be cast to the interface of the Service. The Adapter can be cast to the interface the Client expects.
 * 
 * Adapter vs. Facade
 * 		The Adapter is used to preserve existing polymorphism. In other words, the interface you are adapting to probably already exists, and is probably already committed to.
 * 		The Facade provides a more idealized interface, but it can be developed incrementally as new needs of the subsystem are discovered.
 * 		Adapters are usually small, and therefore do not raise performance concerns, typically.
 * 		Facades tend to be large, and therefore it may be useful to make sure they are re-entrant (so as to avoid the need for multiple instances).
 * 		The "Adaptee" is probably fine as it is, you're using the Adapter because you've committed to a different interface.
 * 		The "Facadee" is probably not fine as it is, and you are communicating this to other developers by using the term "Facade".
 * 
 * Proxy vs. Facade
 * 		Proxies are optional, Facades typically are not.
 * 		The purpose of the Proxy is to add behavior. The purpose of the Facade is to simplify, which may actually involve removing behavior
 * 
 */


public class AdapterVersusProxyVersusFacadePatternComparison {

}
