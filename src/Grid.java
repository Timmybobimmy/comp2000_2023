public class Grid {

    Cell [][] cellArray = new Cell [20][20];

    public void grid(){
        for(int i=0; i<cellArray.length; i++){
            for(int j=0; j<cellArray[i].length; j++){
                cellArray[i][j] = new Cell(10 + size * i, 10 + size * j);
                cellArray[i][j].paint();
            }
        }
    }

    // 10 + size * i -- x coordinate
    // 10 + size * j -- y coordinate

    // Needs to call Cell

}
