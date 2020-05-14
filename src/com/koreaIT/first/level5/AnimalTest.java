package com.koreaIT.first.level5;

public class AnimalTest {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		lion.crying();
		cat.crying();
		dog.crying();
		
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Lion();
		
		((Dog)animal1).crying();
		animal1.crying();
		((Cat)animal2).crying();
		((Lion)animal3).crying();
		
		//부모타입은 자식 객체 주소값을 저장할 수 있다
		//(부모타입은 자식 객체를 가리킬 수 있다)
		//자식타입은 부모 객체 주소값을 저장할 수 없다
		//(자식타입은 부모 객체를 가리킬 수 없다)
		//가리키는 타입은 
		
	}
}
