import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class Playlist implements SongCollection {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(Objects.requireNonNull(song, "Song is required"));
    }

    @Override
    public SongIterator createIterator() {
        return new PlaylistIterator();
    }

    public SongIterator createReverseIterator() {
        return new ReversePlaylistIterator();
    }

    private final class PlaylistIterator implements SongIterator {
        private int nextIndex;

        @Override
        public boolean hasNext() {
            return nextIndex < songs.size();
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Playlist iterator exhausted");
            }
            return songs.get(nextIndex++);
        }
    }

    private final class ReversePlaylistIterator implements SongIterator {
        private int nextIndex = songs.size() - 1;

        @Override
        public boolean hasNext() {
            return nextIndex >= 0;
        }

        @Override
        public Song next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Reverse playlist iterator exhausted");
            }
            return songs.get(nextIndex--);
        }
    }
}
