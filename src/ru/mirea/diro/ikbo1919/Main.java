package ru.mirea.diro.ikbo1919;

public class Main {

    public static void main(String[] args) {
	    MovablePoints mPoints = new MovablePoints(new Point(0,5), new Point(10,0));
	    mPoints.move(-2,3);
	    System.out.println(mPoints);
	    MovableRectangle mRectangle = new MovableRectangle(new Point (5, 4), 4, 6);
	    mRectangle.move(2,3);
	    System.out.println(mRectangle);
    }
}
