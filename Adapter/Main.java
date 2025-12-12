class Main {
    public static void main(String[] args) {
        Videoadapter adp = new Videoadapter(new Outdatedvideoplayer());
        adp.load("myvideo.mp4");
    }
}
