package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;
	@Qualifier("a2")
	public void setA(A a) {
		// byName byType will use setter injection
		System.out.println("setA() called" );
		this.a=a;
	}
public B(A a) {
	this.a=a;
	System.out.println("from B constructor()");

}
public B() {
	// TODO Auto-generated constructor stub
}
@PostConstruct// this annotation treats th following method as init()
public void setUp() {
	System.out.println("from setUp()..");
}
@PreDestroy
public void windUp() {
System.out.println("from windup()...");
}
}

