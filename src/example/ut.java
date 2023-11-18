package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;

public class ut extends UnitTypes{
    public static void load(){
    
    alpha.speed = 8f;
    alpha.itemCapacity = 555;
    alpha.weapons.get(0).bullet.buildingDamageMultiplier = 1.0f;

    beta.speed = 8f;
    beta.itemCapacity = 555;
    beta.weapons.get(0).bullet.buildingDamageMultiplier = 1.0f;

    gamma.speed = 8f;
    gamma.itemCapacity = 555;
    gamma.weapons.get(0).bullet.buildingDamageMultiplier = 1.0f;
        
    }
    
}
