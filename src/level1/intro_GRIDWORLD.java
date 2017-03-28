package level1;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class intro_GRIDWORLD {
public static void main(String[] args) {
	int k = 0;
	World world = new World();
	Location loc = new Location(0,0);
	Location loC = new Location(1,1);
	world.show();
	Bug bug = new Bug();
Actor actor = new Actor();
	Flower flower = new Flower();

for (int i = 0; i < 10; i++) {
	world.add(new Location(i,i), bug);
}
for (int j = 9; j >= 0; j--) {
	world.add(new Location(k,j), flower);
	k++;
}

	for (int g = 0; g < 10; g++) {
		world.add(new Location(0,g), actor);
		
	}

	
	
}
}
