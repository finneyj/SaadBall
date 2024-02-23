public class SmallSpaceShip {
  
    private Rectangle[] rectangles;
    private Rectangle hitbox;

    public Rectangle getHitbox(){
      return hitbox;
    }
    public void render(GameArena arena) {
        for (int i = 0; i < rectangles.length; i++) {
          arena.addRectangle(rectangles[i]);
        }
        arena.addRectangle(hitbox);
    }

    public void move(double dx, double dy) {
        for (int i = 0; i < rectangles.length; i++) {
          rectangles[i].setXPosition(rectangles[i].getXPosition() + dx);
          rectangles[i].setYPosition(rectangles[i].getYPosition() + dy);
        }
        hitbox.setXPosition(hitbox.getXPosition() + dx);
        hitbox.setYPosition(hitbox.getYPosition() + dy);
      }

    public void remove(GameArena arena) {
        for (int i = 0; i < rectangles.length; i++) {
            arena.removeRectangle(rectangles[i]);
        }
        arena.removeRectangle(hitbox);
    }

    public SmallSpaceShip(double x, double y, GameArena arena, int size) {
            rectangles = new Rectangle[27];
            rectangles[0] = new Rectangle(x + size * 4, y, size, size, "#FEDC1E"); // top r0
            rectangles[1] = new Rectangle(x + size * 4, y + size, size, size * 9, "#65628E"); // r1
            // r2
            rectangles[2] = new Rectangle(x + size * 3, y + size * 2, size * 3, size, "#FC2B81");
            rectangles[3] = new Rectangle(x + size * 4, y + size * 2, size, size, "#AFAFCC");

            rectangles[4] = new Rectangle(x + size * 3, y + size * 3, size * 3, size * 2, "#8F8EAE");
            rectangles[5] = new Rectangle(x + size * 2, y + size * 5, size * 5, size * 3, "#8F8EAE");
            rectangles[6] = new Rectangle(x + size * 4, y + size * 3, size, size*5, "#C9C9E5");
            rectangles[7] = new Rectangle(x + size * 3, y + size * 5, size*3, size*3, "#C9C9E5");

            // 3 light ones
            rectangles[8] = new Rectangle(x + size * 4, y + size * 5, size, size, "#AFAFCC");
            rectangles[9] = new Rectangle(x + size * 3, y + size * 7, size , size, "#AFAFCC");
            rectangles[10] = new Rectangle(x + size * 5, y + size * 7, size, size, "#AFAFCC");

            rectangles[11] = new Rectangle(x + size, y + size *8, size, size * 2, "#8F8EAE");
            rectangles[12] = new Rectangle(x + size * 7, y + size *8, size, size * 2, "#8F8EAE");
            rectangles[13] = new Rectangle(x + size * 2, y + size *8, size, size, "#65628E");
            rectangles[14] = new Rectangle(x + size * 4, y + size *8, size, size * 2, "#65628E");
            rectangles[15] = new Rectangle(x + size * 6, y + size *8, size, size, "#65628E");

            // 3 red
            rectangles[16] = new Rectangle(x + size, y + size * 10, size, size, "#FC2B81");
            rectangles[17] = new Rectangle(x + size * 4, y + size * 10, size, size, "#FC2B81");
            rectangles[18] = new Rectangle(x + size * 7, y + size * 10, size, size, "#FC2B81");

            rectangles[19] = new Rectangle(x, y + size * 12, size*9, size, "#FEDC1E");
            // 3 orange
            rectangles[20] = new Rectangle(x + size, y + size * 12, size, size, "#FD881D");
            rectangles[21] = new Rectangle(x + size * 4, y + size * 12, size, size, "#FD881D");
            rectangles[22] = new Rectangle(x + size * 7, y + size * 12, size, size, "#FD881D");

            rectangles[23] = new Rectangle(x + size, y + size * 13, size, size, "#FEDC1E");
            rectangles[24] = new Rectangle(x + size * 3, y + size * 13, size*3, size, "#FEDC1E");
            rectangles[25] = new Rectangle(x + size * 7, y + size * 13, size, size, "#FEDC1E");

            rectangles[26] = new Rectangle(x + size * 4, y + size * 14, size, size*2, "#FEDC1E");

            
      
          hitbox = new Rectangle(x, y, size * 9, size * 16, "BLACK", -10);
      
          render(arena);
    }
      
}
