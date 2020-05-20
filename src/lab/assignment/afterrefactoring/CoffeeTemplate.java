package lab.assignment.afterrefactoring;

public abstract class CoffeeTemplate {

    //template method, final so subclasses can't override
    public final void brewCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    //default implementation
    private void boilWater() {
        System.out.println("Boiling water");
    }


    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    //methods to be implemented by subclasses
    protected abstract void addIngredients();
    protected abstract void finalTouch();

}
