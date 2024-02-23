public class Main
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500,400);

        SmallSpaceShip s = new SmallSpaceShip(100, 100, arena, 10);

        while(true)
        {
            arena.pause();
        }
    }
}