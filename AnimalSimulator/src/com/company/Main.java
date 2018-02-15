package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog adog = new Dog();
	    Dog bdog = new Dog();

	    adog.type = "진돗개";
	    adog.setName("화랑");
	    adog.setAge(3);

	    bdog.type = "삽살개";
	    bdog.setName("레오");
	    bdog.setAge(2);

	    for(int i=0; i<10; i++){
	        Dog dog;
	        int dogChoice = (int)(Math.random() * 2) + 1;
	        if(dogChoice ==  1){
	            dog = adog;
            }else{
	            dog = bdog;
            }
            System.out.printf("%s(은/는) 현재 %d세의 %s 입니다. ", dog.getName(), dog.getAge(), dog.type);

	        int dogAction = (int)(Math.random() * 4) + 1;
	        switch (dogAction){
                case 1:
                    dog.bark(); break;
                case 2:
                    dog.eat(); break;
                case 3:
                    dog.sleep(); break;
                case 4:
                    dog.move(); break;
            }
        }
    }
}
class Animal{
    protected String type;
    private String name;
    private int age;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(type+":"+name +"(이/가) 식사 중입니다");
    }
    public void sleep(){
        System.out.println(type+":"+name +"(이/가) 잠자는 중입니다");
    }
    public void move(){
        System.out.println(type+":"+name +"(이/가) 이동 중입니다");
    }

    public Animal(String type, String name, int age){
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public Animal(){
        type = "dog";
        name = "noName";
        age = 0;
    }

}
class Dog extends Animal{

    public Dog(String type, String name, int age){
        super(type,name,age);
    }

    public Dog(){
        //파라미터가 없는 생성자를 자동으로 호출
    }

    public void bark(){
        System.out.println(type+":"+getName() +"(이/가) 짖고 있습니다");
    }

}