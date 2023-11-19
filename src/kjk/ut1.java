package kjk;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;

public class ut1 {
public static Blocks conveyor;
    public static void load(){
    
    conveyor = new Conveyor("conveyor"){{
            requirements(Category.distribution, with(Items.copper, 1));
            health = 45;
            speed = 0.03f;
            displayedSpeed = 4.2f;
            buildCostMultiplier = 2f;
            researchCost = with(Items.copper, 5);
        }};
    

    
        
    }
    
}
