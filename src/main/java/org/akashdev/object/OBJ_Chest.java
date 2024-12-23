package org.akashdev.object;

import org.akashdev.GamePanel;
import org.akashdev.entity.Entity;

public class OBJ_Chest extends Entity {

    public OBJ_Chest(GamePanel gp){
        super(gp);
        name = "Chest";
        image = setup("/objects/chest");

    }
}
