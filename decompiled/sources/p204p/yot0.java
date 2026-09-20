package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class yot0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final int f274732a;

    /* JADX INFO: renamed from: b */
    public final ContextTrack f274733b;

    public yot0(int i, ContextTrack contextTrack) {
        this.f274732a = i;
        this.f274733b = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yot0)) {
            return false;
        }
        yot0 yot0Var = (yot0) obj;
        return this.f274732a == yot0Var.f274732a && wj50.m88271j(this.f274733b, yot0Var.f274733b);
    }

    public final int hashCode() {
        return this.f274733b.hashCode() + (Integer.hashCode(this.f274732a) * 31);
    }
}
