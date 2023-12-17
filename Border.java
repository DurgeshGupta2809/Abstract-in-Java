package Oops;

abstract class Karnel{
	
	abstract void para();
	abstract void bsf();
	abstract void cisf();
	abstract void black();
	abstract void navy();
	abstract void airforce();
}
abstract class Major extends Karnel{
	@Override
	void para() {
		System.out.println("para() implementation");
	}
	@Override
	void bsf() {
		System.out.println("bsf() implementation");
	}
	@Override
	void cisf() {
		System.out.println("cisf() implementation");
	}
}
abstract class Capton extends Major{
	@Override
	void black() {
		System.out.println("black() implementation");
	}
	@Override
	void navy() {
		System.out.println("navy() implementation");
	}
}
 class Dil extends Capton{
	@Override
	void airforce() {
		System.out.println("airforce()implementation");
	}
}
public class Border extends Dil{
	public static void main(String[] args) {
		
		//Kernal k1=new kernal();    //we cannot create object of abstract class
		//Major m1=new Major():
	    //Capton c1=new Capton();
		//Dil m1=new Dil();
		
		Dil d2=new Dil();
		d2.para();
		d2.bsf();
		d2.cisf();
		d2.black();
		d2.navy();
		d2.airforce();
		System.out.println("---------------------------");
		
		Karnel k2=new Border();
		k2.para();
		k2.bsf();
		k2.cisf();
		k2.black();
		k2.navy();
		k2.airforce();
		System.out.println("---------------------------");
		
		Major m2=new Dil();
		m2.para();
		m2.bsf();
		m2.cisf();
		m2.black();
		m2.navy();
		m2.airforce();
		System.out.println("---------------------------");
		
		Capton c2=new Border();
		c2.para();
		c2.bsf();
		c2.cisf();
		c2.black();
		c2.navy();
		c2.airforce();
	}
}
