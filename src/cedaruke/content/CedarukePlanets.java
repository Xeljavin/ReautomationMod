// Planned stars: Arion, Liyumi, Karaek, Solnata, Pharall, and Quvant

// I could use some help here

package cedaruke.content;

import arc.graphics.*;
import mindustry.content.*;
import mindustry.game.*;
import mindustry.graphics.*;
import mindustry.graphics.g3d.*;
import mindustry.type.*;
// import cedaruke.content.CedarukeBlocks.*;
// import cedaruke.planets.*;

// I'll add the rest of the planets later
public class CedarukePlanets {
    public static Planet arion;

    public static void load() {
        arion = new Planet("arion", null, 5f, 0){{
            bloom = true;
            accessible = false;
            rotateTime = 20f * 50f;
            solarSystem = this;
            hasAtmosphere = true;

            meshLoader = () -> new SunMesh(
                    this, 0, 0, 0, 0, 0, 0, 0f,
                    Color.valueOf("000000"),
                    Color.valueOf("000000"),
                    Color.valueOf("000000"),
                    Color.valueOf("000000"),
                    Color.valueOf("000000"),
                    Color.valueOf("000000")
            );
        }};

    }
}

// The code is not finished yet!