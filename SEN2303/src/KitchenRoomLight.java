public class KitchenRoomLight implements Light {
    private int brightness;

    @Override
    public void on() {
        brightness = 100;
        System.out.println("Kitchen Room light is ON at full brightness.");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Room light is OFF.");
    }

    @Override
    public void dim(int level) {
        brightness = level;
        System.out.println("Kitchen Room light dimmed to " + brightness + "%.");
    }

    @Override
    public int getBrightness() {
        return brightness;
    }
}
