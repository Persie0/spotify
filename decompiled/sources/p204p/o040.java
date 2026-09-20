package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o040 {

    /* JADX INFO: renamed from: a */
    public final v300 f160227a;

    /* JADX INFO: renamed from: b */
    public final Set f160228b = s601.m77310m0(u300.THIS_IS_ARTIST, u300.ARTIST_MIX_READER, u300.BLEND, u300.DAILY_MIX, u300.DAYLIST, u300.DISCOVER_WEEKLY, u300.DESCRIPTO, u300.INSPIREDBY_MIX, u300.ON_REPEAT, u300.RELEASE_RADAR, u300.REPEAT_REWIND, u300.TOPIC_MIX);

    public o040(v300 v300Var) {
        this.f160227a = v300Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65976a(PlayerState playerState) {
        if (omo0.m67361m(playerState)) {
            return true;
        }
        return this.f160228b.contains(((w300) this.f160227a).m87094a(omo0.m67360l(playerState))) || e72.m37980N((ContextTrack) playerState.track().mo49278b()) || omo0.m67362n(playerState);
    }
}
