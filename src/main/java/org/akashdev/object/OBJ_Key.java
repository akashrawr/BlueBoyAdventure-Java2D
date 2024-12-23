package org.akashdev.object;

import org.akashdev.GamePanel;
import org.akashdev.entity.Entity;

public class OBJ_Key extends Entity {

    public OBJ_Key(GamePanel gp){
        super(gp);
        name = "Key";
        down1 = setup("/objects/key");
    }
}
