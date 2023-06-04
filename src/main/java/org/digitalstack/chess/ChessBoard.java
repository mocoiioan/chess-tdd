package org.digitalstack.chess;

public class ChessBoard {

    public static int BOARD_WIDTH = 7;
    public static int BOARD_HEIGHT = 7;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[BOARD_WIDTH][BOARD_HEIGHT];
    }

    public void add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(isLegalBoardPosition(xCoordinate, yCoordinate)){
            if(pieces[xCoordinate][yCoordinate] == null){
                pieces[xCoordinate][yCoordinate] = new Pawn(pieceColor);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                return;
            }
        }
        pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate > 6 || xCoordinate < 0 || yCoordinate > 6 || yCoordinate < 0){
            return false;
        }
        return true;
    }
}
