import io.hexlet.xo.model.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

public class Main {

	public static void main(String[] args) {
		final Point p = new Point();
		p.x = 2;
		p.y = 3;

		final Player player = new Player();
		player.name = "Slava";
		player.figure = "X";
	}
}