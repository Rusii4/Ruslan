public class Movie {
    private String title;
    private String studio;
    private String rating;
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }
    public static void main(String[] args) {

        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");
        System.out.println("Информация о фильме 'Фокус':");
        System.out.println("Название: " + movie1.title);
        System.out.println("Студия: " + movie1.studio);
        System.out.println("Рейтинг: " + movie1.rating);
        System.out.println("\nИнформация о фильме 'Главный герой':");
        System.out.println("Название: " + movie2.title);
        System.out.println("Студия: " + movie2.studio);
        System.out.println("Рейтинг: " + movie2.rating);
    }
}