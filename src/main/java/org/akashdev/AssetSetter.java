package org.akashdev;

import org.akashdev.entity.NPC_OldMan;
import org.akashdev.object.OBJ_Boots;
import org.akashdev.object.OBJ_Chest;
import org.akashdev.object.OBJ_Door;
import org.akashdev.object.OBJ_Key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject(){

    }

    public void setNPC(){

        gp.npc[0] = new NPC_OldMan(gp);
        gp.npc[0].worldX = gp.tileSize * 21;
        gp.npc[0].worldY = gp.tileSize * 21;

    }
}
