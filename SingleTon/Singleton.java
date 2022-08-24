class Singleton
{
    private static Singleton singleton;
    private int randomNumber;
    private Singleton()
    {
        this.randomNumber = (int) (Math.random() * 100);   
    }
    public static Singleton getInstance()
    {
        if(singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
    public int getRandomNumber()
    {
        return this.randomNumber;
    }
}

