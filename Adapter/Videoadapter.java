class Videoadapter implements Videoplayer {

    private Outdatedvideoplayer oldplayer;

    public Videoadapter(Outdatedvideoplayer oldplayer) {
        this.oldplayer = oldplayer;
    }

    public void load(String filename) {
        System.out.println("loading from internet..." + filename);
        oldplayer.playvideo(filename);
    }
}
