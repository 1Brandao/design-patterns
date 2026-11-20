public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade(new Projector(), new SoundSystem(),
                new StreamingPlayer(), new RoomLights(), new ProjectionScreen());

        theater.watchMovie("Design Patterns: The Movie");
        theater.endMovie();
    }
}
