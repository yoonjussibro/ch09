package ch09;

public abstract class ImplClass implements Inter {

	@Override
	public void method1() {
		System.out.println("Inter 에서 상속받은 추상 메서드 method1");

	}

	@Override
	public void method2() {
		System.out.println("Inter 에서 상속받은 추상 메서드 method2");

	}

//	인터페이스 Inter에서 상속받은 추상 메서드 method3을 구현하지 않을경우
//해당 클래스는 추상 클래스가 됨
	
//	@Override
//	public void method3() {
//		System.out.println("Inter 에서 상속받은 추상 메서드 method3");
//
//	}

}
