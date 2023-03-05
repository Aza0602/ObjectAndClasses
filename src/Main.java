public class Main {
    public static void main(String[] args) {

        Author duma = new Author("Александр", "Дюма");
        Author aitmatov = new Author("Чынгыз", "Айтматов");

        Book triMushketera = new Book("Три мушкетёра", 1844, duma);
        Book dolsheVekaDlitsyaDen = new Book("И дольше века длится день", 1980, aitmatov);

        triMushketera.printInfo();
        dolsheVekaDlitsyaDen.printInfo();

        triMushketera.setDateOfPublisher(1845);
        triMushketera.printInfo();
    }
}