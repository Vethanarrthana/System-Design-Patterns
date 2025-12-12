class Main {
    public static void main(String[] args) {
        Onlight on=new Onlight(new Light());
        Offlight off=new Offlight(new Light());
        Button b1=new Button(on);
        Button b2=new Button(off);
        b1.onclick();
        b2.onclick();

    }
}
