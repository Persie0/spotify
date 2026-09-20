package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class djs {

    /* JADX INFO: renamed from: a */
    public String f49738a;

    /* JADX INFO: renamed from: a */
    public final boolean m36213a(ContextTrack contextTrack) {
        if (!wj50.m88271j(contextTrack.uri(), this.f49738a)) {
            this.f49738a = null;
        }
        return e72.m38025v(contextTrack) && this.f49738a == null;
    }
}
