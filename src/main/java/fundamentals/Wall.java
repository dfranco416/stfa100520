package fundamentals;

// POJO - "Plain Old Java Object"
public class Wall {

    private static int amountOfWalls = 0;
    private String paintColor;
    private boolean hasWallpaper;

    public Wall(String paintColor, boolean hasWallpaper){
        this.hasWallpaper = hasWallpaper;
        this.paintColor = paintColor;
        amountOfWalls++;
    }
    public String getPaintColor(){
        return paintColor;
    }
    public boolean getWallpaper(){
        return hasWallpaper;
    }
    public int getAmountOfWalls(){
        return amountOfWalls;
    }

}
