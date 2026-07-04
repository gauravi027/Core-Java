package Inheritance;

class Artist {
    String name;
    int age;

    Artist() {
        this.name = "Not given";
        this.age = 0;
    }

    Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void display() {
        System.out.println("Name of Artist : " + name);
        System.out.println("Age of Artist : " + age);
    }
}

// ---------------- Painter ----------------

class Painter extends Artist {

    String style;
    String medium;
    int numpaintings;

    Painter() {
        super();
        style = "Not Given";
        medium = "Not Given";
        numpaintings = 0;
    }

    Painter(String name, int age, String style, String medium, int numpaintings) {
        super(name, age);
        this.style = style;
        this.medium = medium;
        this.numpaintings = numpaintings;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Painting Style : " + style);
        System.out.println("Medium : " + medium);
        System.out.println("Number of Paintings : " + numpaintings);
        System.out.println();
    }
}

// ---------------- Musician ----------------

class Musician extends Artist {

    String instrument;
    String musicGenre;
    int numberOfAlbums;

    Musician() {
        super();
        instrument = "Not Given";
        musicGenre = "Not Given";
        numberOfAlbums = 0;
    }

    Musician(String name, int age, String instrument, String musicGenre, int numberOfAlbums) {
        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Instrument : " + instrument);
        System.out.println("Music Genre : " + musicGenre);
        System.out.println("Number of Albums : " + numberOfAlbums);
        System.out.println();
    }
}

// ---------------- Actor ----------------

class Actor extends Artist {

    String filmIndustry;
    int numberOfMovies;

    Actor() {
        super();
        filmIndustry = "Not Given";
        numberOfMovies = 0;
    }

    Actor(String name, int age, String filmIndustry, int numberOfMovies) {
        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Film Industry : " + filmIndustry);
        System.out.println("Number of Movies : " + numberOfMovies);
        System.out.println();
    }
}

// ---------------- Main Class ----------------

public class Artistry {

    public static void checkMusicEventEligibility(Artist a) {

        if (a instanceof Musician) {

            Musician m = (Musician) a; // Downcasting

            System.out.println("\nEligible for Music Event");
            System.out.println("Instrument : " + m.getInstrument());

        } else {

            System.out.println("\nNot Eligible for Music Event");
        }
    }

    public static void main(String[] args) {

        Artist[] artists = new Artist[3];

        artists[0] = new Painter("Siddharth", 20, "Sketching", "Pencil", 50);
        artists[1] = new Musician("Harsh", 18, "Violin", "Romantic", 45);
        artists[2] = new Actor("Gauravi", 21, "Bollywood", 13);

//        for (Artist a : artists) {
//            a.display();
//            checkMusicEventEligibility(a);
//            System.out.println("----------------------------");
//        }
        for (Artist artist : artists) {
        	artist.display();
        
        
        if(artist instanceof Actor) {
        	Actor act = (Actor) artist;
        	System.out.println("Artist is an actor");
        	act.display();
        }
        else if(artist instanceof Painter) {
        	Painter p = (Painter) artist;
        	System.out.println("Artist is Painter");
        	p.display();
        }
        else if(artist instanceof Musician ) {
        	Musician m = (Musician) artist;
        	System.out.println("Arteist is Musician");
        	m.display();
        }
        }
    }
}
