class Onlight implements Command {
    Light light;
    public Onlight(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOnlight();
    }
    
}
