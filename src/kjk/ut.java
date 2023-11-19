package kjk;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;

public class ut extends UnitTypes{
    public static void load(){

    alpha.health = 300f;
    alpha.itemCapacity = 555;
    alpha.mineSpeed = 13f;
    alpha.buildSpeed = 1f;
    alpha.drag = 0.1f;
    alpha.weapons.get(0).bullet.speed = 5f;
    alpha.weapons.get(0).bullet.damage = 22.0f;
    alpha.weapons.get(0).bullet.buildingDamageMultiplier = 0.2f;

    beta.health = 340f;
    beta.itemCapacity = 555;
    beta.mineSpeed = 14f;
    beta.buildSpeed = 1.5f;
    beta.drag = 0.1f;
    beta.weapons.get(0).bullet.speed = 6f;
    beta.weapons.get(0).bullet.damage = 22.0f;
    beta.weapons.get(0).bullet.buildingDamageMultiplier = 0.3f;

    gamma.health = 440f;
    gamma.itemCapacity = 555;
    gamma.mineSpeed = 16f;
    gamma.buildSpeed = 2f;
    gamma.drag = 0.1f;
    gamma.weapons.get(0).bullet.speed = 7f;
    gamma.weapons.get(0).bullet.damage = 22.0f;
    gamma.weapons.get(0).bullet.buildingDamageMultiplier = 0.4f;
        
    }
    
}
