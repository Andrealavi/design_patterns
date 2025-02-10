/**
 * The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together.
 * It acts as a bridge between two incompatible interfaces by wrapping an existing class with a new interface.
 * This pattern is particularly useful when integrating new components into an existing system without modifying the existing code.
 */

interface MP3Player {
    void playMusic();
}

// Basic implementation of an MP3 player
class BasicMP3Player implements MP3Player {

    /**
     * Method to play music on a basic MP3 player.
     */
    public void playMusic() {
        System.out.println("Playing music on a basic MP3 player");
    }
}

interface ModernAudioPlayer {
    void playAudio();
}

// Advanced implementation of a modern audio player
class AdvancedAudioPlayer implements ModernAudioPlayer {

    /**
     * Method to play audio on an advanced audio player.
     */
    public void playAudio() {
        System.out.println("Playing audio on an advanced audio player");
    }
}

// Adapter class to allow a ModernAudioPlayer to be used as an MP3Player
class ModernAudioAdapter implements MP3Player {

    private ModernAudioPlayer player;

    /**
     * Constructor to initialize the adapter with a ModernAudioPlayer instance.
     * @param player The ModernAudioPlayer instance to be adapted.
     */
    public ModernAudioAdapter(ModernAudioPlayer player) {
        this.player = player;
    }

    /**
     * Method to play music using the adapted ModernAudioPlayer.
     */
    public void playMusic() {
        player.playAudio();
    }
}

// Main class to demonstrate the adapter pattern
class Main {

    public static void main(String[] args) {
        // Create a basic MP3 player
        MP3Player basicPlayer = new BasicMP3Player();
        basicPlayer.playMusic(); // Output: Playing music on a basic MP3 player

        // Create an advanced audio player
        ModernAudioPlayer advancedPlayer = new AdvancedAudioPlayer();
        advancedPlayer.playAudio(); // Output: Playing audio on an advanced audio player

        // Use the adapter to play audio on the basic MP3 player
        MP3Player adapter = new ModernAudioAdapter(advancedPlayer);
        adapter.playMusic(); // Output: Playing audio on an advanced audio player
    }
}
