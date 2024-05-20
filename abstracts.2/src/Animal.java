public abstract class Animal implements Moveable{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(getType()+ " started!");
    }

    @Override
    public void stop() {
        System.out.println(getType()+ " stopped!");
    }

    public abstract String getType();
    public String getName() {
        return name;
    }


}
