import java.util.*;

// Base Movie class
class Movie {
    private String movieName;
    private String producedBy;
    private String directedBy;
    private double duration;
    private int year;
    private String category;

    private final String movieId;       // Read-only
    private static int moviesCount = 0; // Static variable

    // Constructor with mandatory fields
    public Movie(String movieName, String producedBy) {
        if (movieName == null || producedBy == null) {
            throw new IllegalArgumentException("movieName and producedBy are mandatory!");
        }
        this.movieName = movieName;
        this.producedBy = producedBy;

        moviesCount++;
        this.movieId = movieName + "_" + moviesCount;
    }

    // Constructor with all fields (calls mandatory one using this)
    public Movie(String movieName, String producedBy, String directedBy,
                 double duration, int year, String category) {
        this(movieName, producedBy);
        this.directedBy = directedBy;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    // Getters
    public String getMovieId() {
        return movieId;
    }

    public static int getMoviesCount() {
        return moviesCount;
    }

    // Method to display details
    public String showDetails() {
        return "Movie ID: " + movieId +
                "\nName: " + movieName +
                "\nProduced By: " + producedBy +
                "\nDirected By: " + (directedBy != null ? directedBy : "N/A") +
                "\nDuration: " + (duration != 0 ? duration + " hrs" : "N/A") +
                "\nYear: " + (year != 0 ? year : "N/A") +
                "\nCategory: " + (category != null ? category : "N/A");
    }
}

// Derived class: SpecialMovie
class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    public SpecialMovie(String movieName, String producedBy, String directedBy,
                        double duration, int year, String category,
                        String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    @Override
    public String showDetails() {
        return super.showDetails() +
                "\nSound Effects: " + soundEffectsTechnology +
                "\nVisual Effects: " + visualEffectsTechnology;
    }
}

// Derived class: InternationalMovie
class InternationalMovie extends Movie {
    private String country;
    private String language;

    public InternationalMovie(String movieName, String producedBy, String directedBy,
                              double duration, int year, String category,
                              String country, String language) {
        super(movieName, producedBy, directedBy, duration, year, category);
        this.country = country;
        this.language = language;
    }

    @Override
    public String showDetails() {
        return super.showDetails() +
                "\nCountry: " + country +
                "\nLanguage: " + language;
    }
}

// Main Class
public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Movie> movieList = new ArrayList<>();

        while (true) {
            System.out.println("\n========= Movie Management System =========");
            System.out.println("1. Add Normal Movie");
            System.out.println("2. Add Special Movie");
            System.out.println("3. Add International Movie");
            System.out.println("4. Show All Movies");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();

                    System.out.print("Enter Produced By: ");
                    String producedBy = sc.nextLine();

                    System.out.print("Enter Directed By: ");
                    String directedBy = sc.nextLine();

                    System.out.print("Enter Duration (in hours): ");
                    double duration = sc.nextDouble();

                    System.out.print("Enter Release Year: ");
                    int year = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    Movie m = new Movie(movieName, producedBy, directedBy, duration, year, category);
                    movieList.add(m);
                    System.out.println("\n Movie added successfully with ID: " + m.getMovieId());
                    break;
                }

                case 2: {
                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();

                    System.out.print("Enter Produced By: ");
                    String producedBy = sc.nextLine();

                    System.out.print("Enter Directed By: ");
                    String directedBy = sc.nextLine();

                    System.out.print("Enter Duration (in hours): ");
                    double duration = sc.nextDouble();

                    System.out.print("Enter Release Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Sound Effects Technology: ");
                    String soundTech = sc.nextLine();

                    System.out.print("Enter Visual Effects Technology: ");
                    String visualTech = sc.nextLine();

                    SpecialMovie sm = new SpecialMovie(movieName, producedBy, directedBy, duration, year, category, soundTech, visualTech);
                    movieList.add(sm);
                    System.out.println("\n Special Movie added successfully with ID: " + sm.getMovieId());
                    break;
                }

                case 3: {
                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();

                    System.out.print("Enter Produced By: ");
                    String producedBy = sc.nextLine();

                    System.out.print("Enter Directed By: ");
                    String directedBy = sc.nextLine();

                    System.out.print("Enter Duration (in hours): ");
                    double duration = sc.nextDouble();

                    System.out.print("Enter Release Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Country: ");
                    String country = sc.nextLine();

                    System.out.print("Enter Language: ");
                    String language = sc.nextLine();

                    InternationalMovie im = new InternationalMovie(movieName, producedBy, directedBy, duration, year, category, country, language);
                    movieList.add(im);
                    System.out.println("\n International Movie added successfully with ID: " + im.getMovieId());
                    break;
                }

                case 4: {
                    if (movieList.isEmpty()) {
                        System.out.println("\n No movies found!");
                    } else {
                        System.out.println("\n===== All Movies =====");
                        for (Movie m : movieList) {
                            System.out.println("\n" + m.showDetails());
                            System.out.println("--------------------------------");
                        }
                        System.out.println("Total Movies Created: " + Movie.getMoviesCount());
                    }
                    break;
                }

                case 5:
                    System.out.println("\nExiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice. Try again!");
            }
        }
    }
}
