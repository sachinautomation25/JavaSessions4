package com.qa.finalfinallyfinalize;

/*
 * finalize: is a Method
finalize is called when an object is garbage collected. You rarely need to override it.
 * to perform the cleanup
 */
public class FinalizeConcept extends Object {

	
	public void finalize() {
		System.out.println("finalize");
	}

	public static void main(String[] args) {

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();

		f1 = null;
		f2 = null;

		System.gc();
	}
}
