package kjk;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class entry extends Mod{

    public entry(){
        
    }

    @Override
    public void loadContent(){
        Log.info("Loading some example content.");
        ut.load();
    }

}
