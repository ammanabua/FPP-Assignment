package Assignment.Assignment5.Question3;

public class Driver {
    public static void main(String[] args) {

        Figure[] fig = {new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMarker(), new Vertical()};

        for (Figure f: fig){
            f.getFigure();
        }

        for (Figure f: fig){
            Class cs = f.getClass();

            System.out.println(f.getClass().getSimpleName() + ": ");
        }
    }
}
