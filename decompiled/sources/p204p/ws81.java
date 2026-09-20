package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes.dex */
public final class ws81 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f254556a;

    /* JADX INFO: renamed from: b */
    public final PlayOrigin f254557b;

    /* JADX INFO: renamed from: c */
    public final String f254558c;

    /* JADX INFO: renamed from: d */
    public final String f254559d;

    public ws81(ContextTrack contextTrack, PlayOrigin playOrigin, String str, String str2) {
        this.f254556a = contextTrack;
        this.f254557b = playOrigin;
        this.f254558c = str;
        this.f254559d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws81)) {
            return false;
        }
        ws81 ws81Var = (ws81) obj;
        return wj50.m88271j(this.f254556a, ws81Var.f254556a) && wj50.m88271j(this.f254557b, ws81Var.f254557b) && wj50.m88271j(this.f254558c, ws81Var.f254558c) && wj50.m88271j(this.f254559d, ws81Var.f254559d);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.f254556a;
        int iHashCode = (contextTrack == null ? 0 : contextTrack.hashCode()) * 31;
        PlayOrigin playOrigin = this.f254557b;
        int iHashCode2 = (iHashCode + (playOrigin == null ? 0 : playOrigin.hashCode())) * 31;
        String str = this.f254558c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f254559d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
