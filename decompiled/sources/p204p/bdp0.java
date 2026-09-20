package p204p;

import com.spotify.player.model.BitrateLevel;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class bdp0 {
    /* JADX INFO: renamed from: a */
    public static final BitrateLevel m28851a(ujw ujwVar) {
        switch (ujwVar) {
            case UNKNOWN:
                return BitrateLevel.UNKNOWN;
            case LOW:
                return BitrateLevel.LOW;
            case NORMAL:
                return BitrateLevel.NORMAL;
            case HIGH:
                return BitrateLevel.HIGH;
            case VERY_HIGH:
                return BitrateLevel.VERY_HIGH;
            case HIFI:
                return BitrateLevel.HIFI;
            case HIFI24:
                return BitrateLevel.HIFI_24;
            case PETREL:
                return BitrateLevel.UNKNOWN;
            case UNRECOGNIZED:
                return BitrateLevel.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
