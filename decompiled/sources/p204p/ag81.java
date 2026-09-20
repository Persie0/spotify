package p204p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class ag81 {

    /* JADX INFO: renamed from: a */
    public final ContextTrack f15311a;

    /* JADX INFO: renamed from: b */
    public final hg81 f15312b;

    /* JADX INFO: renamed from: c */
    public final boolean f15313c;

    public ag81(ContextTrack contextTrack, hg81 hg81Var, boolean z) {
        this.f15311a = contextTrack;
        this.f15312b = hg81Var;
        this.f15313c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag81)) {
            return false;
        }
        ag81 ag81Var = (ag81) obj;
        return wj50.m88271j(this.f15311a, ag81Var.f15311a) && wj50.m88271j(this.f15312b, ag81Var.f15312b) && this.f15313c == ag81Var.f15313c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15313c) + ((this.f15312b.hashCode() + (this.f15311a.hashCode() * 31)) * 31);
    }
}
