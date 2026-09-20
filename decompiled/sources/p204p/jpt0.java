package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes9.dex */
public final class jpt0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f114717a;

    /* JADX INFO: renamed from: b */
    public final int f114718b;

    /* JADX INFO: renamed from: c */
    public final int f114719c;

    /* JADX INFO: renamed from: d */
    public final boolean f114720d;

    public jpt0(ContextTrack contextTrack, int i, int i2, boolean z) {
        this.f114717a = contextTrack;
        this.f114718b = i;
        this.f114719c = i2;
        this.f114720d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpt0)) {
            return false;
        }
        jpt0 jpt0Var = (jpt0) obj;
        return wj50.m88271j(this.f114717a, jpt0Var.f114717a) && this.f114718b == jpt0Var.f114718b && this.f114719c == jpt0Var.f114719c && this.f114720d == jpt0Var.f114720d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114720d) + mt60.m62800g(this.f114719c, mt60.m62800g(this.f114718b, this.f114717a.hashCode() * 31, 31), 31);
    }
}
