public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Killua", 6, 4.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Jiji", 13, 6.3);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
