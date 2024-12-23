package org.akashdev.object;

import org.akashdev.GamePanel;
import org.akashdev.entity.Entity;

public class OBJ_Boots extends Entity {

    public OBJ_Boots(GamePanel gp){
        super(gp);
        name = "Boots";
        down1 = setup("/objects/boots");
    }
}
