public abstract class Beverages {
    private boolean wantsExtras = false;

    // Template method
    public final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    // Concrete methods
    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by subclasses
    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();

    // Method to set the extras preference
    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
}
