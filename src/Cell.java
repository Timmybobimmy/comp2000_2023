public class Cell {
    public int x;
    public int y;
    public int size = 35;

    public void cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
        public void paint(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(x, y, size, size);
             g.setColor(Color.BLACK);
            g.drawRect(x, y, size, size);
        }
}
