package p204p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: classes10.dex */
public final class a2y {

    /* JADX INFO: renamed from: a */
    public final PlayerState f11737a;

    /* JADX INFO: renamed from: b */
    public final boolean f11738b;

    /* JADX INFO: renamed from: c */
    public final boolean f11739c;

    /* JADX INFO: renamed from: d */
    public final boolean f11740d;

    /* JADX INFO: renamed from: e */
    public final boolean f11741e;

    /* JADX INFO: renamed from: f */
    public final boolean f11742f;

    /* JADX INFO: renamed from: g */
    public final t0v0 f11743g;

    /* JADX INFO: renamed from: h */
    public final boolean f11744h;

    /* JADX INFO: renamed from: i */
    public final boolean f11745i;

    /* JADX INFO: renamed from: j */
    public final boolean f11746j;

    public a2y(PlayerState playerState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, t0v0 t0v0Var, boolean z6, boolean z7, boolean z8) {
        this.f11737a = playerState;
        this.f11738b = z;
        this.f11739c = z2;
        this.f11740d = z3;
        this.f11741e = z4;
        this.f11742f = z5;
        this.f11743g = t0v0Var;
        this.f11744h = z6;
        this.f11745i = z7;
        this.f11746j = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2y)) {
            return false;
        }
        a2y a2yVar = (a2y) obj;
        return wj50.m88271j(this.f11737a, a2yVar.f11737a) && this.f11738b == a2yVar.f11738b && this.f11739c == a2yVar.f11739c && this.f11740d == a2yVar.f11740d && this.f11741e == a2yVar.f11741e && this.f11742f == a2yVar.f11742f && wj50.m88271j(this.f11743g, a2yVar.f11743g) && this.f11744h == a2yVar.f11744h && this.f11745i == a2yVar.f11745i && this.f11746j == a2yVar.f11746j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11746j) + s571.m77245d(s571.m77245d((this.f11743g.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f11737a.hashCode() * 31, 31, this.f11738b), 31, this.f11739c), 31, this.f11740d), 31, this.f11741e), 31, this.f11742f)) * 31, 31, this.f11744h), 31, this.f11745i);
    }
}
