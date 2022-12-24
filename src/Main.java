public class Main {
    public static void main(String[] args) {
        Author pyshkin = new Author("Александр", "");
        Author tolstoy = new Author("Лев", "Толстой");
        book prorok = new book("Пророк", pyshkin, 1828);
        book voina = new book("Война и Мир", tolstoy, 1869);


        System.out.println(prorok.equals(voina));
        System.out.println(voina);
        System.out.println(prorok);
        System.out.println(prorok + " " + voina);
        System.out.println(prorok.hashCode());
        System.out.println(voina.hashCode());
        System.out.println(voina.equals(voina));
    }
}