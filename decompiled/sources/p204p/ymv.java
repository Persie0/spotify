package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes2.dex */
public interface ymv {
    /* JADX INFO: renamed from: a */
    o1x0 mo44204a(PlayerState playerState);

    /* JADX INFO: renamed from: b */
    default fiz mo44205b(PlayerState playerState) {
        return nxf1.m65834m(mo44204a(playerState));
    }
}
