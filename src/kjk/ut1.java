package kjk;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;

public class ut1 extends Blocks {
    @Override
    public static void load() {
        conveyor = new Conveyor("conveyor") {{
            requirements(Category.distribution, with(Items.copper, 1));
            health = 45;
            speed = 0.03f * 2;                  // 修改speed的值
            displayedSpeed = 4.2f * 2;          // 修改displayedSpeed的值
            buildCostMultiplier = 2f;
            researchCost = with(Items.copper, 5);
        }};

        titaniumConveyor = new Conveyor("titanium-conveyor") {{
            requirements(Category.distribution, with(Items.copper, 1, Items.lead, 1, Items.titanium, 1));
            health = 65;
            speed = 0.08f * 2;                  // 修改speed的值
            displayedSpeed = 11f * 2;           // 修改displayedSpeed的值
        }};
    }
}
