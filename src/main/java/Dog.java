class Dog {
    String name;
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.name = "Барт";

        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = dog;

        dogs[0].name = "Фред";
        dogs[1].name = "Джордж";

        System.out.println("Имя послденей собаки - ");
        System.out.println(dogs[2].name);

        int x = 0;
        while (x < dogs.length){
            dogs[x].bark();
            x++;
        }
    }
    public void bark(){
        System.out.println(name + " сказал Гав!");
    }
}
