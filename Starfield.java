/**
 * A class to represent a simple starfield effect.
 * A cnfigurable number of stars appear in the centre of the screen,
 * and move outward to the edges in a randome direction.
 */

public class Starfield
{
    private Star[] stars;
    private Ball horizon;
    private int numberOfStars;
    private double effectDepth = 1.0;
    private double effectSpeed = 1.0;
    private double starSize = 3;
    private String starColour = "#DDDDDD";

    private GameArena arena;
    
    /**
	 * Constructor. Creates a Ball with the given parameters.
	 * @param numberOfStars The number of stars that should be on screen at any point in time
	 * @param speed The spparent speed of the effect - higher numbers are faster.
	 */
    public Starfield(int numberOfStars, double speed, GameArena a)
    {
        stars = new Star[numberOfStars];
        this.effectSpeed = speed;
        this.arena = a;

        for (int i=0; i<stars.length; i++)
        {
            stars[i] = new Star(arena.getWidth()/2, arena.getHeight()/2, starSize, starColour, speed * (0.5 - Math.random()), speed * (0.5 - Math.random()), arena);
            stars[i].addTo(a);
        }

        horizon = new Ball(arena.getWidth()/2, arena.getHeight()/2, 20, "BLACK");
        arena.addBall(horizon);
    }

    public void move()
    {
        for (int i=0; i<stars.length; i++)
            stars[i].move();
    }
}