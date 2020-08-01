package ml.knightcraft.core.utils;

import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.entity.Player;

public class dingNoise {
    public static void dingDing(Player p){
        p.playNote(p.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
    }
}
