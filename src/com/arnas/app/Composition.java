package com.arnas.app;

class MainMpMode {
    private String name;
    private int playerCount;

    public MainMpMode(String name, int playerNum) {
        this.name = name;
        this.playerCount = playerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    @Override
    public String toString() {
        return "Main Multiplayer Mode: " + name +
                " | Max players allowed: " + playerCount +
                '.';
    }
}

class OnlineMode {
    private boolean hasOnlineMode;
    private int multiplayerModeCount;
    private boolean hasAntiCheat;
    private MainMpMode mainMode;

    public OnlineMode(boolean onlineMode){
        this.hasOnlineMode = onlineMode;
    }

    public OnlineMode(boolean onlineMode, int mpCount, boolean antiCheat, MainMpMode mainMode) {
        this.hasOnlineMode = onlineMode;
        this.multiplayerModeCount = mpCount;
        this.hasAntiCheat = antiCheat;
        this.mainMode = mainMode;
    }

    public boolean isHasOnlineMode() {
        return hasOnlineMode;
    }

    public void setHasOnlineMode(boolean hasOnlineMode) {
        this.hasOnlineMode = hasOnlineMode;
    }

    public int getMultiplayerModeCount() {
        return multiplayerModeCount;
    }

    public void setMultiplayerModeCount(int multiplayerModeCount) {
        this.multiplayerModeCount = multiplayerModeCount;
    }

    public boolean isHasAntiCheat() {
        return hasAntiCheat;
    }

    public void setHasAntiCheat(boolean hasAntiCheat) {
        this.hasAntiCheat = hasAntiCheat;
    }

    public MainMpMode getMainMode() {
        return mainMode;
    }

    public void setMainMode(MainMpMode mainMode) {
        this.mainMode = mainMode;
    }

    @Override
    public String toString() {
        if (hasOnlineMode == true) {
            return "Game has multiplayer: Yes.\n" +
                    "Count of multiplayer modes: " + multiplayerModeCount + ".\n" +
                    "Game has Anti-Cheat: " + hasAntiCheat + ".\n" +
                    mainMode;
        } else {
            return "Game has multiplayer: No";
        }
    }
}

class InitialLevel {
    private String name;
    private int levelDuration;

    public InitialLevel(String levelName, int duration) {
        this.name = levelName;
        this.levelDuration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelDuration() {
        return levelDuration;
    }

    public void setLevelDuration(int levelDuration) {
        this.levelDuration = levelDuration;
    }

    @Override
    public String toString() {
        return "First level: " + name +
                "Level duration: " + levelDuration;
    }
}

class StoryMode {
    private boolean hasStoryMode;
    private int levelCount;
    private int difficultyLevels;
    private InitialLevel initialLevel;

    public StoryMode(boolean hasStory) {
        this.hasStoryMode = hasStory;
    }

    public StoryMode(boolean hasStory, int lvlCount, int diffLvls, InitialLevel initialLevel) {
        this.hasStoryMode = hasStory;
        this.levelCount = lvlCount;
        this.difficultyLevels = diffLvls;
        this.initialLevel = initialLevel;
    }

    public boolean isHasStoryMode() {
        return hasStoryMode;
    }

    public void setHasStoryMode(boolean hasStoryMode) {
        this.hasStoryMode = hasStoryMode;
    }

    public int getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(int levelCount) {
        this.levelCount = levelCount;
    }

    public int getDifficultyLevels() {
        return difficultyLevels;
    }

    public void setDifficultyLevels(int difficultyLevels) {
        this.difficultyLevels = difficultyLevels;
    }

    public InitialLevel getInitialLevel() {
        return initialLevel;
    }

    public void setInitialLevel(InitialLevel initialLevel) {
        this.initialLevel = initialLevel;
    }

    @Override
    public String toString() {
        if (hasStoryMode == true) {
            return "Game has story mode: Yes.\n" +
                    "Count of multiplayer modes: " + levelCount + ".\n" +
                    "Number of difficulty settings: " + difficultyLevels + ".\n" +
                    initialLevel;
        } else {
            return "Game has story mode: No";
        }
    }
}

class VideoGame {
    private String name;
    private double price;
    private StoryMode storyMode;
    private OnlineMode onlineMode;

    public VideoGame(String name, double price, StoryMode story, OnlineMode online) {
        this.name = name;
        this.price = price;
        this.storyMode = story;
        this.onlineMode = online;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public StoryMode getStoryMode() {
        return storyMode;
    }

    public void setStoryMode(StoryMode storyMode) {
        this.storyMode = storyMode;
    }

    public OnlineMode getOnlineMode() {
        return onlineMode;
    }

    public void setOnlineMode(OnlineMode onlineMode) {
        this.onlineMode = onlineMode;
    }

    @Override
    public String toString() {
        return "Video game: " + name + ".\n" +
                "Game's price: " + price + ".\n" +
                storyMode + "\n" +
                onlineMode;
    }
}

public class Composition {
    public static void main(String[] args) {
        VideoGame cod = new VideoGame("Call of Duty: Modern Warfare", 59.99,
                new StoryMode(true, 14, 4, new InitialLevel("Fog of War", 30)),
                new OnlineMode(true, 49, true, new MainMpMode("Warzone", 150)));

        VideoGame mario = new VideoGame("Super Mario", 29.99,
                new StoryMode(true, 136, 2, new InitialLevel("1-1", 2)),
                new OnlineMode(false));

        System.out.println("... Printing info about selected video games: ");
        System.out.println(cod);
        System.out.println("- - -");
        System.out.println(mario);
    }
}
