import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("First song"));
        playlist.addSong(new Song("Second song"));
        playlist.addSong(new Song("Third song"));
        SongCollection collection = playlist;

        System.out.println("Insertion order:");
        SongIterator forward = collection.createIterator();
        printSongs(forward);
        try {
            forward.next();
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }

        SongIterator first = collection.createIterator();
        SongIterator second = collection.createIterator();
        System.out.println("First iterator: " + first.next().getTitle() + ", " + first.next().getTitle());
        System.out.println("Second iterator: " + second.next().getTitle());

        System.out.println("Reverse order:");
        printSongs(playlist.createReverseIterator());
        System.out.println("Insertion order after reverse traversal:");
        printSongs(collection.createIterator());

        Playlist empty = new Playlist();
        System.out.println("Empty playlist has next: " + empty.createIterator().hasNext());
        System.out.println("Empty reverse playlist has next: " + empty.createReverseIterator().hasNext());
    }

    private static void printSongs(SongIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}
