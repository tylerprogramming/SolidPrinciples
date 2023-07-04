package principles.integrationsegregationprinciple.before;

public class AudioBook implements Book {
    @Override
    public void open() {
        System.out.println("Opening the book!");
    }

    @Override
    public void close() {
        System.out.println("Closing the book!");
    }

    @Override
    public void read() {
        System.out.println("Reading the book!");
    }

    @Override
    public void bookmark() {
        System.out.println("Bookmarking the book!");
    }

    @Override
    public void search() {
        System.out.println("Searching in the book!");
    }
}

