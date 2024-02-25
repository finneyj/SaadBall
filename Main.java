public class Main
{
    public static void main(String[] args)
    {
        GameArena arena = new GameArena(500,400);

        SmallSpaceShip s = new SmallSpaceShip(100, 100, arena, 10);

        while(true)
        {
            if (arena.rightPressed()) {
                s.move(5, 0);
              }
            if (arena.leftPressed()) {
                s.move(-5, 0);
              }
            if (arena.upPressed()) {
                s.move(0, -5);
              }
             if (arena.downPressed()) {
                s.move(0, 5);
              }
            arena.pause();
        }
    }
}
