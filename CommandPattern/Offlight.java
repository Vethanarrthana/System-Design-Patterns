class Offlight implements Command {
    Light light;
    public Offlight(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOfflight();
    }
    
}
