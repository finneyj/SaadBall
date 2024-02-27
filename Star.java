public class Star
{
    private Ball b;
    private double speedX;
    private double speedY;

    private double startX;
    private double startY;

    private GameArena arena;    

    public Star(double x, double y, double size, String colour, double speedX, double speedY, GameArena a)
    {
        this.startX = x;
        this.startY = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.arena = a;

        b = new Ball(x, y, size, colour);
    }

    public void addTo(GameArena a)
    {
        a.addBall(b);
    }

    public void move()
    {
        b.move(speedX, speedY);

        // Check bounds within the given GameArena
        if (b.getXPosition() > arena.getArenaWidth() || b.getXPosition() < 0 || b.getYPosition() > arena.getArenaHeight() || b.getYPosition() < 0)
        {
            b.setXPosition(startX);
            b.setYPosition(startY);
        }
    }
}